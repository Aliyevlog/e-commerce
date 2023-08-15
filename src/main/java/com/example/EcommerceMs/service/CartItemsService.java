package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.CartItemsDto;

import java.util.List;

public interface CartItemsService {

    List<CartItemsDto> getCartItems();

    CartItemsDto postCartItems(CartItemsDto cartItemsDto);

    CartItemsDto putCartItems(CartItemsDto cartItemsDto);

    void deleteCartItems(Integer id);
}
