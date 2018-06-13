package com.example.Nile_Order.service.Impl;

import com.example.Nile_Order.entity.OrderEntity;
import com.example.Nile_Order.repository.OrderRepository;
import com.example.Nile_Order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public String placeOrder(OrderEntity orderEntity) {
        orderEntity.setDate(new Date());
        orderEntity = orderRepository.save(orderEntity);
        return orderEntity.getOrderNo().toString();
    }

    @Override
    public List<OrderEntity> getAllOrders() {
        return (List<OrderEntity>) orderRepository.findAll();
    }
}
