package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.CartItemsDto;
import com.example.EcommerceMs.service.CartItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "cartItems")
@RequiredArgsConstructor

public class CartItemsController {
    private final CartItemsService cartItemsService;

    @GetMapping
    public List<CartItemsDto> getCartItems() {
        return cartItemsService.getCartItems();
    }

    @PostMapping
    public CartItemsDto postCartItems(@RequestBody CartItemsDto cartItemsDto) {
        return cartItemsService.postCartItems(cartItemsDto);
    }

    @PutMapping
    public CartItemsDto putCartItems(@RequestBody CartItemsDto cartItemsDto) {
        return cartItemsService.putCartItems(cartItemsDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCartItems(@PathVariable Integer id) {
        cartItemsService.deleteCartItems(id);
    }


}
