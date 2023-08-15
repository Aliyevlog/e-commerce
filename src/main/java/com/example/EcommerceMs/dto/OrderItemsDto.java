package com.example.EcommerceMs.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter

public class OrderItemsDto {

    @PositiveOrZero
    private Integer quantity;
}
