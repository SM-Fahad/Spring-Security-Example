package com.abc.SpringBootSecurityEx.dtos;



import java.util.Collection;

public record JwtResponse(
        String token,
        String username,
        String email,
        Collection<String> roles
) {}