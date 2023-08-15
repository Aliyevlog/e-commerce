package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.DiscountDto;

import java.util.List;

public interface DiscountService  {

    List<DiscountDto> getDiscount();

    DiscountDto postDiscount(DiscountDto discountDto);

    DiscountDto putDiscount(DiscountDto discountDto);

    void deleteDiscount(Integer id);
}
