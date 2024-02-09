package com.basic.typecasting.nonprimitive;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Seller {
    public static void main(String[] args) {
        Fruits fruits = new Fruits();
        System.out.println(Arrays.toString(fruits.fruitVariety));

        List<Integer> List = new LinkedList<>();

        // Upcasting
        Fruits fruit1 = new Apple();
        System.out.println(Arrays.toString(fruit1.fruitVariety));
        Fruits fruit2 = new Mango();
        System.out.println(Arrays.toString(fruit2.fruitVariety));

        //Downcasting
        Apple apple = (Apple) fruit1;
        System.out.println(apple.price);
        apple.apple();

        Mango mango = (Mango) fruit2;
        System.out.println(mango.price);
        mango.mango();

    }
}
