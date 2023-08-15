package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.ShoppingSessionDto;
import com.example.EcommerceMs.service.ShoppingSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "shoppingSession")
@RequiredArgsConstructor
public class ShoppingSessionController {

    private final ShoppingSessionService shoppingSessionService;

    @GetMapping

    public List<ShoppingSessionDto> getShoppingSession() {
        return shoppingSessionService.getShoppingSession();
    }

    @PostMapping

    public ShoppingSessionDto createShoppingSession(@RequestBody ShoppingSessionDto shoppingSessionDto) {
        return shoppingSessionService.createShoppingSession(shoppingSessionDto);
    }

    @PutMapping

    public ShoppingSessionDto updateShoppingSession(@RequestBody ShoppingSessionDto shoppingSessionDto) {
        return shoppingSessionService.updateShoppingSession(shoppingSessionDto);
    }

    @DeleteMapping("/{id}")

    public void deleteShoppingSession(@RequestParam(name = "id") Integer id) {
        shoppingSessionService.deleteShoppingSession(id);

    }
}
