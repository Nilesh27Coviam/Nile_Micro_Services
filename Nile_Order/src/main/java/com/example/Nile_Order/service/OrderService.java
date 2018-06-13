package com.example.Nile_Order.service;

import com.example.Nile_Order.entity.OrderEntity;

import java.util.List;

public interface OrderService {

     String placeOrder(OrderEntity orderEntity);
     List<OrderEntity> getAllOrders();
}
