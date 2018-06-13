package com.example.Nile_Order.controller;

import com.example.Nile_Order.dto.OrderDTO;
import com.example.Nile_Order.entity.OrderEntity;
import com.example.Nile_Order.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(method = RequestMethod.POST, value = "/placeOrder")
    public String placeOrder(@RequestBody OrderDTO orderDTO){

        OrderEntity orderEntity = new OrderEntity();
        BeanUtils.copyProperties(orderDTO, orderEntity);
        return orderService.placeOrder(orderEntity);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/getAll")
    public ResponseEntity<?> getAllOrders(@RequestBody OrderDTO orderDTO){


        List<OrderEntity> orderEntityList = orderService.getAllOrders();
        List<OrderDTO> productDTOS = new ArrayList<>();
        for (OrderEntity productEntity : orderEntityList) {
            OrderDTO productDTO = new OrderDTO();
            BeanUtils.copyProperties(productEntity, productDTO);
            productDTOS.add(productDTO);
        }
        return new ResponseEntity<List<OrderDTO>>(productDTOS, HttpStatus.OK)
    }

}
