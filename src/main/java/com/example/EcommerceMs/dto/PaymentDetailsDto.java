package com.example.EcommerceMs.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter

public class PaymentDetailsDto {
    @PositiveOrZero
    private Integer amount;

    @NotBlank
    @NotBlank
    private String provider;

    @NotBlank
    @NotNull
    private String status;

}
