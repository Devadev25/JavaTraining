package com.basic.java8features.streamdemo.mapping;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerDetails {
    public static void main(String[] args) {
        List<Customer> customers = Ekart.getDetails();

        List<String> emails = customers.stream().map(Customer::getEmail).collect(Collectors.toList());
        System.out.println(emails);

        List<String> customerName = customers.stream().map(Customer::getCustomerName).collect(Collectors.toList());
        System.out.println(customerName);

        List<String> phoneNumber = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phoneNumber);

        List<String> customerName2 = customers.stream().map(Customer::getCustomerName).collect(Collectors.toList());
        System.out.println(customerName2.size());
    }
}
