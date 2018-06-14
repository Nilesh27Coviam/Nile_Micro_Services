package com.example.Nile_Order.repository;

import com.example.Nile_Order.entity.CartEntity;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartEntity, String> {
}
