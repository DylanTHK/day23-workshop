package com.workshop.day23.model;

import java.util.Date;

public class Order {
    private Integer orderId = 10;
    private Date orderDate;
    private String customerId;
    private Integer totalPrice;
    private Integer totalCost;
    private Integer discount;
    private Integer discountedPrice;

    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public Integer getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Integer getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }
    public Integer getDiscount() {
        return discount;
    }
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public Integer getDiscountedPrice() {
        return discountedPrice;
    }
    public void setDiscountedPrice(Integer discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

}
