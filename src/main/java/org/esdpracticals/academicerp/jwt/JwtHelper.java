package org.esdpracticals.academicerp.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtHelper {
    @Value("${jwt.secret}")
    private String JWT_SECRET;

    private SecretKey getSigningKey() {
        byte[] bytesKey = Base64.getDecoder().decode(JWT_SECRET);
        return Keys.hmacShaKeyFor(bytesKey);
    }

    public String generateToken(String role, Long userId) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("role", role);
        claims.put("userId", userId);
        return createToken(claims);
    }

    private String createToken(Map<String, Object> claims) {
        return Jwts.builder()
                .claims(claims)
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(getSigningKey())
                .compact();
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    public Long getUserIdFromToken(String token) {
        Claims claims = extractAllClaims(token);
        Object value = claims.get("userId");
        if (value instanceof Long) return (Long) value;
        return Long.valueOf((Integer) value);
    }

    public String getRoleFromToken(String token) {
        Claims claims = extractAllClaims(token);
        return (String) claims.get("role");
    }

    public boolean validateToken(String token) {
        return extractAllClaims(token)
                .getExpiration()
                .before(new Date());
    }
}
