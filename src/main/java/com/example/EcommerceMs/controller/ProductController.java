package com.example.EcommerceMs.controller;

import com.example.EcommerceMs.dto.ProductDto;
import com.example.EcommerceMs.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping

    public List<ProductDto> getProduct() {
        return productService.getProduct();
    }

    @PutMapping

    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

    @PostMapping

    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }

    @DeleteMapping("/{id}")

    public void deleteProduct(@PathVariable(name = "id") Integer id) {
        productService.deleteProduct(id);

    }


}
