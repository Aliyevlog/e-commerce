package com.example.EcommerceMs.service;

import com.example.EcommerceMs.dto.ProductInventoryDto;

import java.util.List;

public interface ProductInventoryService {
    List<ProductInventoryDto> getProductInventory();

    ProductInventoryDto createProductInventory(ProductInventoryDto productInventoryDto);

    ProductInventoryDto updateProductInventory(ProductInventoryDto productInventoryDto);

    void deleteProductInventory(Integer id);
}
