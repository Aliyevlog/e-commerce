package com.example.EcommerceMs.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.Date;


@Getter
@Setter
public class CartItemsDto {

    @PositiveOrZero
    private Integer quantity;

}
