package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getProduct();

    ProductDto createProduct(ProductDto productDto);

    ProductDto updateProduct(ProductDto productDto);

    void deleteProduct(Integer id);
}
