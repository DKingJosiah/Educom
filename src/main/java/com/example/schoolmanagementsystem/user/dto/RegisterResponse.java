package com.example.schoolmanagementsystem.user.dto;
import java.util.UUID;

public record RegisterResponse(
        UUID id,
        String firstName,
        String lastName,
        String email,
        String status,
        boolean emailVerified
) {}
