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
    public ProductEntity insert() {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(RandomStringGenerator.generateRandomString());
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


        MerchantEntity merchantEntity=new MerchantEntity();
        merchantEntity.setName("M01");
        merchantEntity.setRateing(2);
        merchantEntity.setId("d18d2eaa-e34d-48af-972c-a2bd26a007d5");

//        MerchantEntity merchantEntity2=new MerchantEntity();
//        merchantEntity2.setName("nilesh");
//        merchantEntity2.setRateing(1);
//        merchantEntity2.setId(RandomStringGenerator.generateRandomString());
        List<MerchantEntity> list=new ArrayList<MerchantEntity>();
        list.add(merchantEntity);
//        list.add(merchantEntity2);
        productEntity.setMarchants(list);
        //productEntity.setMarchants(marchant);
        return  productRepository.insert(productEntity);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }
}