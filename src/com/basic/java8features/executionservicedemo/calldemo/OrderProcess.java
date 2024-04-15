package com.basic.java8features.executionservicedemo.calldemo;

import java.util.concurrent.Callable;

public class OrderProcess implements Callable<String> {
    private Order order;

    public OrderProcess(Order order) {
        this.order = order;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Order Id :" + order.getOrderId() + " processed for customer :" + order.getCustomerName();
    }
}

