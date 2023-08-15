package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.ShoppingSessionDto;

import java.util.List;

public interface ShoppingSessionService {
    List<ShoppingSessionDto> getShoppingSession();

    ShoppingSessionDto createShoppingSession(ShoppingSessionDto shoppingSessionDto);

    ShoppingSessionDto updateShoppingSession(ShoppingSessionDto shoppingSessionDto);

    void deleteShoppingSession(Integer id);
}
