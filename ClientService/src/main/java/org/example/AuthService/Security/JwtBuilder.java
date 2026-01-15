package org.example.AuthService.Security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.grpc.server.service.GrpcService;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.UUID;

@GrpcService
public class JwtBuilder {
    private final SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);



    public String generateJwt(String username){
        long currentTimeMillis = System.currentTimeMillis();
      String accessToken = Jwts.builder()
              .setSubject(username)
              .setIssuedAt(new Date())
              .setExpiration(new Date(currentTimeMillis + 1000*60*15))
              .signWith(key)
              .compact();









    String refreshToken = UUID.randomUUID().toString();
    return AuthResponse.newBuilder()
            .setAccessToken(accessToken)
            .setRefreshToken(refreshToken)
            .setMessage("Success")
            .build();




} }