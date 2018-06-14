package com.example.Nile_Order.service.Impl;

import com.example.Nile_Order.entity.CartEntity;
import com.example.Nile_Order.repository.CartRepository;
import com.example.Nile_Order.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Override

    @Autowired
    CartRepository cartRepository;

    public boolean addToCart(String userId, String productId) {

        CartEntity cartEntity = new CartEntity();
        cartEntity.setProductId(productId);
        cartEntity.setUserId(userId);
        cartRepository.save(cartEntity);
        return false;
    }
}
