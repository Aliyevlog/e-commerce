package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.ProductCategoryDto;
import com.example.EcommerceMs.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "productCategory")
@RequiredArgsConstructor
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    @GetMapping

    public List<ProductCategoryDto> getProductCategory() {
        return productCategoryService.getProductCategory();
    }


    @PostMapping

    public ProductCategoryDto createProductCategory(@RequestBody ProductCategoryDto productCategoryDto) {

        return productCategoryService.createProductCategory(productCategoryDto);
    }


    @PutMapping

    public ProductCategoryDto updateProductCategory(@RequestBody ProductCategoryDto productCategoryDto) {

        return productCategoryService.updateProductCategory(productCategoryDto);
    }


    @DeleteMapping("/{id}")

    public void deletePaymentDetails(@PathVariable(name = "id") Integer id) {
        productCategoryService.deleteProductCategory(id);
    }


}
