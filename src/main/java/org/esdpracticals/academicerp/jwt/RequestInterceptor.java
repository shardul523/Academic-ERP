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

            String token = authHeader.substring(7);

            String role = jwtHelper.getRoleFromToken(token);
            Long userId = jwtHelper.getUserIdFromToken(token);

            request.setAttribute("userId", userId);
            request.setAttribute("role", role);

            return true;
        } catch (Exception e) {
            throw new JwtException("Invalid token");
        }
    }
}

