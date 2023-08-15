package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.ProductCategoryDto;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategoryDto> getProductCategory();

    ProductCategoryDto createProductCategory(ProductCategoryDto productCategoryDto);

    ProductCategoryDto updateProductCategory(ProductCategoryDto productCategoryDto);

    void deleteProductCategory(Integer id);
}
