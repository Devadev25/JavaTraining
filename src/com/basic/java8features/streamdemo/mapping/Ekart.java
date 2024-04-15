package com.basic.java8features.streamdemo.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ekart {
    public static List<Customer> getDetails() {
        return Stream.of(
                new Customer("Deva", Arrays.asList("7896541203", "7932762436"), "deva@gmail.com"),
                new Customer("Harshini", Arrays.asList("12358964", "6541298730"), "harshini@gmail.com"),
                new Customer("Kishore", Arrays.asList("463632235", "9852136470"), "kishore@gmail.com"),
                new Customer("Vivek", Arrays.asList("30215678", "8520369741"), "vivek@gmail.com"),
                new Customer("Arun", Arrays.asList("753951284", "8462579310"), "arun001@gmail.com")
        ).collect(Collectors.toList());
    }


}
