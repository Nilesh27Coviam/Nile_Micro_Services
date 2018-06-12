package com.nile.Nile_Product.service.impl;

import com.nile.Nile_Product.entity.ProductEntity;
import com.nile.Nile_Product.repository.ProductRepository;
import com.nile.Nile_Product.service.ProductService;
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
    public ProductEntity insert() {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId("P02");
        productEntity.setProductName("Item-2");
        productEntity.setCategory("C03");

        List<Map> attrib = new ArrayList<Map>();
        Map<String, String> attribute = new HashMap<String, String>();
        attribute.put("width", "01");
        attribute.put("heigth", "02");
        attribute.put("wight", "120");
        attribute.put("color", "Red");
        attribute.put("materials", "steel");
        attrib.add(attribute);

        productEntity.setAttribute(attrib);
        productEntity.setDiscription("This is discription");
        productEntity.setStock(new Integer(232));

        List<String> img = new ArrayList<String>();
        img.add("Image 1");
        img.add("Image 2");
        img.add("Image 3");
        productEntity.setImages(img);

        List<String> marchant = new ArrayList<>();
        marchant.add("Marchant 1");
        marchant.add("Marchant 2");
        marchant.add("Marchant 3");
        marchant.add("Marchant 4");
        productEntity.setMarchants(marchant);

        return  productRepository.insert(productEntity);
    }
}