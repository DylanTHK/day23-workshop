package com.workshop.day23.model;

import org.joda.time.DateTime;

public class Order {
    private Integer orderId = 10;
    private DateTime orderDate;
    private Integer customerId;
    private Float totalPrice;
    private Float totalCost;
    private Float discount;
    private Float discountedPrice;

    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public DateTime getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(DateTime orderDate) {
        this.orderDate = orderDate;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public Float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Float getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }
    public Float getDiscount() {
        return discount;
    }
    public void setDiscount(Float discount) {
        this.discount = discount;
    }
    public Float getDiscountedPrice() {
        return discountedPrice;
    }
    public void setDiscountedPrice(Float discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customerId=" + customerId + ", totalPrice="
                + totalPrice + ", totalCost=" + totalCost + ", discount=" + discount + ", discountedPrice="
                + discountedPrice + "]";
    }
    
}
