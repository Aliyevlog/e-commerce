package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.ProductInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInventoryRepository extends JpaRepository<ProductInventory,Integer> {
}
