package com.vikas.ecommerce.inventory_micro_service.repository;

import com.vikas.ecommerce.inventory_micro_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}