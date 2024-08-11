package com.zosh.ecommerce_youtube.com.zosh.service;

import com.zosh.ecommerce_youtube.com.zosh.model.OrderItem;
import com.zosh.ecommerce_youtube.com.zosh.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImplementation implements OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;
    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }
}
