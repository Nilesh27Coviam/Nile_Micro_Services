package com.nile.Nile_Product.service;


import com.nile.Nile_Product.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    public List<ProductEntity> findAll();
    public List<ProductEntity> findByCategory(String category);
    public ProductEntity findByProductId(String productId);
    public ProductEntity delete(String productId);
    public ProductEntity insert(ProductEntity productEntity);
    public void deleteAll();
    public boolean insertAll(List<ProductEntity> productEntityList);
}
