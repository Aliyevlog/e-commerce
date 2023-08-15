package com.example.EcommerceMs.authentication.jwt.auth;

import jakarta.validation.constraints.Email;
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
public class UserRequest {

    @NotNull(message = "firstName shouldn't be blank")
    @NotBlank(message = "firstName shouldn't be blank")
    private String firstName;

    @NotNull(message = "firstName shouldn't be blank")
    @NotBlank(message = "firstName shouldn't be blank")
    private String lastName;

    @NotNull(message = "firstName shouldn't be blank")
    @NotBlank(message = "firstName shouldn't be blank")
    private String userName;

    @NotNull(message = "firstName shouldn't be blank")
    @NotBlank(message = "firstName shouldn't be blank")
    private String password;

    @NotNull(message = "firstName shouldn't be blank")
    @NotBlank(message = "firstName shouldn't be blank")
    private String phone;

    @NotNull(message = "firstName shouldn't be blank")
    @NotBlank(message = "firstName shouldn't be blank")
    @Email(message = "Email must be valid ex: example@gmail.com")
    private String email;
}
