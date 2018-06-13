package com.nile.Nile_Product.service.impl;

import com.nile.Nile_Product.entity.MerchantEntity;
import com.nile.Nile_Product.entity.ProductEntity;
import com.nile.Nile_Product.repository.ProductRepository;
import com.nile.Nile_Product.service.ProductService;
import com.nile.Nile_Product.utils.RandomStringGenerator;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductEntity> findAll() {
        return  productRepository.findAll();
    }

    @Override
    public List<ProductEntity> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public ProductEntity findByProductId(String productId) {
        return productRepository.findByProductId(productId);
    }

    @Override
    public ProductEntity delete(String productId) {
        return productRepository.deleteByProductId(productId);
    }

    @Override
    public ProductEntity insert(ProductEntity productEntity) {
        return  productRepository.insert(productEntity);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    @Override
    public boolean insertAll(List<ProductEntity> productEntityList) {
        return productEntityList.addAll(productEntityList);
    }
}