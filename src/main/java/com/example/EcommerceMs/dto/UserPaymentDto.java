package com.example.EcommerceMs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserPaymentDto {

    @NotNull
    @NotBlank
    private String paymentType;

    @NotNull
    @NotBlank
    private String provide;

    @NotNull
    @NotBlank
    private Integer accountNo;

    @NotNull
    @NotBlank
    private Date expiry;
}
