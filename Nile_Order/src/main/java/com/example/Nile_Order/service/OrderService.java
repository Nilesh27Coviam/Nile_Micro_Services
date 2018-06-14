package com.example.Nile_Order.service;

import com.example.Nile_Order.entity.OrderEntity;

import java.util.List;
import java.util.Optional;

public interface OrderService {

     String placeOrder(OrderEntity orderEntity);
     List<OrderEntity> getAllOrders();
     List<OrderEntity> findByUserId(String id);
     Optional<OrderEntity> findById(String id);
}
