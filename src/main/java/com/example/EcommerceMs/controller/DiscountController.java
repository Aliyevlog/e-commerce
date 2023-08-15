package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.DiscountDto;
import com.example.EcommerceMs.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "discount")
@RequiredArgsConstructor

public class DiscountController {
    private final DiscountService discountService;

    @GetMapping
    public List<DiscountDto> getDiscount() {
        return discountService.getDiscount();
    }

    @PostMapping
    public DiscountDto postDiscount(@PathVariable DiscountDto discountDto) {

        return discountService.postDiscount(discountDto);

    }

    @PutMapping
    public DiscountDto updateDiscount(@PathVariable DiscountDto discountDto) {
        return discountService.putDiscount(discountDto);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteDiscount(@PathVariable(name = "id") Integer id) {
        discountService.deleteDiscount(id);
    }


}
