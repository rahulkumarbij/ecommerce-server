package com.zosh.ecommerce_youtube.com.zosh.repository;

import com.zosh.ecommerce_youtube.com.zosh.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
