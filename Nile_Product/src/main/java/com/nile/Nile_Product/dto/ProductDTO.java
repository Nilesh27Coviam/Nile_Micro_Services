package com.nile.Nile_Product.dto;

import java.util.List;
import java.util.Map;

public class ProductDTO {

    private String productId;
    private String productName;
    private String category;
    private List<Map> marchants;
    private String discription;
    private List<Map> attribute;
    private Integer stock;
    private List<String> images;
    private Integer price;
    private String breand;

    public String getBreand() {
        return breand;
    }

    public void setBreand(String breand) {
        this.breand = breand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

    public List<Map> getMarchants() {
        return marchants;
    }

    public void setMarchants(List<Map> marchants) {
        this.marchants = marchants;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public List<Map> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Map> attribute) {
        this.attribute = attribute;
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