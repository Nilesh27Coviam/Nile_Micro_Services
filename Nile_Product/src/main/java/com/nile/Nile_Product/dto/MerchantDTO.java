package com.nile.Nile_Product.dto;

public class MerchantDTO {

    public String id;
    public String name;
    public Integer rateing;

    public Integer getRateing() {
        return rateing;
    }

    public void setRateing(Integer rateing) {
        this.rateing = rateing;
    }

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
}
