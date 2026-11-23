package com.vikas.ecommerce.order_micro_service.repository;

import com.vikas.ecommerce.order_micro_service.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
