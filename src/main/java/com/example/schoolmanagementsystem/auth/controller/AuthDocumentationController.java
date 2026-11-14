
package com.example.schoolmanagementsystem.auth.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "auth-controller")
public class AuthDocumentationController {

    @Operation(
//            summary = "Logout",
            description = "Invalidates the current authenticated session."
    )
    @ApiResponse(
            responseCode = "204",
            description = "Logout successful"
    )
    @ApiResponse(
            responseCode = "401",
            description = "User is not authenticated"
    )
    @PostMapping("/logout")
    public ResponseEntity<Void> logoutDocumentation() {
        return ResponseEntity.noContent().build();
    }
}
