package com.example.EcommerceMs.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class UserAddressDto {

    @NotNull
    @NotBlank
    private String addressLine1;

    @NotNull
    @NotBlank
    private String addressLine2;

    @NotNull
    @NotBlank
    private String city;

    @NotNull
    @NotBlank
    private String postalCode;

    @NotNull
    @NotBlank
    private String country;

    @NotNull
    @NotBlank
    private String telephone;

    @NotNull
    @NotBlank
    private String mobile;

}
