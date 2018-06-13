package com.nile.Nile_Product.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = MerchantEntity.COLLECTION_NAME)
public class MerchantEntity {

    public static final String COLLECTION_NAME = "merchant";
    @Id
    public String id;
    public String name;
    public Integer rateing;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRateing() {
        return rateing;
    }

    public void setRateing(Integer rateing) {
        this.rateing = rateing;
    }
}