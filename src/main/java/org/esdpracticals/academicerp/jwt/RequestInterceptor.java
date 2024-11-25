package org.esdpracticals.academicerp.jwt;

import io.jsonwebtoken.JwtException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
@RequiredArgsConstructor
public class RequestInterceptor implements HandlerInterceptor {
    private final JwtHelper jwtHelper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws JwtException {
        try {
            String authHeader = request.getHeader("Authorization");
            System.out.println(authHeader);
            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
                return false;
            }
            System.out.println(authHeader);

            String token = authHeader.substring(7);
            System.out.println(token);
            String role = jwtHelper.getRoleFromToken(token);
            Long userId = jwtHelper.getUserIdFromToken(token);

            request.setAttribute("userId", userId);
            request.setAttribute("role", role);

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new JwtException("Unauthorized");
        }
    }
}
