package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.ProductInventoryDto;
import com.example.EcommerceMs.service.ProductInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "productInventory")
@RequiredArgsConstructor
public class ProductInventoryController {

    private final ProductInventoryService productInventoryService;

    @GetMapping

    public List<ProductInventoryDto> getProductInventory() {
        return productInventoryService.getProductInventory();
    }

    @PostMapping

    public ProductInventoryDto createProductInventory(@RequestBody ProductInventoryDto productInventoryDto) {
        return productInventoryService.createProductInventory(productInventoryDto);
    }

    @PutMapping

    public ProductInventoryDto updateProductInventory(@RequestBody ProductInventoryDto productInventoryDto) {
        return productInventoryService.updateProductInventory(productInventoryDto);
    }

    @DeleteMapping("/{id}")

    public void deleteProductInventory(@PathVariable(name = "id") Integer id) {
        productInventoryService.deleteProductInventory(id);
    }

}
