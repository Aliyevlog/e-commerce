package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItems,Integer> {
}
