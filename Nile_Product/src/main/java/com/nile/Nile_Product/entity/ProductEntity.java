package com.nile.Nile_Product.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection = ProductEntity.COLLECTION_NAME)
public class ProductEntity {

    public static final String COLLECTION_NAME = "product";

    @Id
    private String productId;
    private String productName;
    private String category;
    private List<MerchantEntity> merchants;
    private String discription;
    private List<Map> attribute;
    private Integer stock;
    private List<String> images;
    private String breand;


    public String getBreand() {
        return breand;
    }
    public void setBreand(String breand) {
        this.breand = breand;
    }
    public List<Map> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Map> attribute) {
        this.attribute = attribute;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<MerchantEntity> getMarchants() {
        return merchants;
    }

    public void setMarchants(List<MerchantEntity> marchants) {
        this.merchants = marchants;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
