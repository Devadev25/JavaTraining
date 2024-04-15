package com.basic.java8features.executionservicedemo.calldemo;

import java.util.List;

public class Order {
    private String customerName;
    private int orderId;
    private List<String> itemsOrdered;

    public String getCustomerName() {
        return customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<String> getItemsOrdered() {
        return itemsOrdered;
    }

    public Order(String customerName, int orderId, List<String> itemsOrdered) {
        this.customerName = customerName;
        this.orderId = orderId;
        this.itemsOrdered = itemsOrdered;
    }

}
