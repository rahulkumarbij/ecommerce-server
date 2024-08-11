package com.zosh.ecommerce_youtube.com.zosh.service;

import com.zosh.ecommerce_youtube.com.zosh.exception.ProductException;
import com.zosh.ecommerce_youtube.com.zosh.model.Cart;
import com.zosh.ecommerce_youtube.com.zosh.model.User;
import com.zosh.ecommerce_youtube.com.zosh.request.AddItemRequest;
import org.springframework.stereotype.Service;

@Service
public interface CartService {

    public Cart createCart(User user);
    public String addCartItem(Long userId, AddItemRequest req)throws ProductException;
    public Cart findUserCart(Long userId);

}
