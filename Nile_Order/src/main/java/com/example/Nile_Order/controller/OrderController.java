package com.example.Nile_Order.controller;

import com.example.Nile_Order.dto.OrderDTO;
import com.example.Nile_Order.entity.OrderEntity;
import com.example.Nile_Order.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        return new ResponseEntity<List<OrderDTO>>(productDTOS, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/history/{userid}")
    public ResponseEntity<?> findByUserId(@PathVariable("userid") String id){

        List<OrderDTO> orderDTOS = new ArrayList<>();
        List<OrderEntity> entities = orderService.findByUserId(id);
        for (OrderEntity orderEntity : entities) {
            OrderDTO orderDTO = new OrderDTO();
            BeanUtils.copyProperties(orderEntity, orderDTO);
            orderDTOS.add(orderDTO);
        }
        return new ResponseEntity<List<OrderDTO>>(orderDTOS, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/orderDetails/{orderId}")
    public ResponseEntity<?> orderDetails(@PathVariable("orderId") String id){

        Optional<OrderEntity> orderEntity = orderService.findById(id);
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderEntity.get(), orderDTO);
        return new ResponseEntity<OrderDTO>(orderDTO, HttpStatus.OK);
    }

}
