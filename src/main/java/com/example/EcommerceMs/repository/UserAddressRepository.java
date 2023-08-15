package com.example.EcommerceMs.repository;

import com.example.EcommerceMs.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress,Integer> {
}
