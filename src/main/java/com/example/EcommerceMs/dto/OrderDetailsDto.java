package com.example.EcommerceMs.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter

public class OrderDetailsDto {

    @NotNull
    @NotBlank
    private BigDecimal total;

}
