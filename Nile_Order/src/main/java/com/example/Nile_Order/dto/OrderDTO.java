package com.example.Nile_Order.dto;

import java.util.Date;

public class OrderDTO {

    private String orderNo;
    private String userId;
    private String prodctId;
    private Date date;
    private Integer quantity;
    private String marchantId;
    private Integer price;

    public String getMarchantId() {
        return marchantId;
    }

    public void setMarchantId(String marchantId) {
        this.marchantId = marchantId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProdctId() {
        return prodctId;
    }

    public void setProdctId(String prodctId) {
        this.prodctId = prodctId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
