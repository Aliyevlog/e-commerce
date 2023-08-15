package com.example.EcommerceMs.authentication.jwt.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AuthenticationRequest {

    @NotNull(message = "Username shouldn't be blank")
    @NotBlank(message = "Username shouldn't be blank")
    private String userName;

    @NotNull(message = "Password shouldn't be blank")
    @NotBlank(message = "Password shouldn't be blank")
    private String password;
}
