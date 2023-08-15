package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemsRepository extends JpaRepository<CartItems,Integer> {


}
