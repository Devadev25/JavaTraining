package com.basic.collectionsframework.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperMarket {
    public static void main(String[] args) {
        // Create a list to store supermarket items
        List<SupermarketItem> productsVariety = new ArrayList<>();

        // Add items to the productsVariety
        productsVariety.add(new SupermarketItem("Apples", 10.99));
        productsVariety.add(new SupermarketItem("Bananas", 0.99));
        productsVariety.add(new SupermarketItem("Milk", 2.49));
        productsVariety.add(new SupermarketItem("Bread", 1.79));
        productsVariety.add(new SupermarketItem("Eggs", 2.99));
        productsVariety.add(new SupermarketItem("Eggs", 2.99));

        // Display the productsVariety
        try {
            System.out.println("Supermarket Inventory:");
            Iterator<SupermarketItem> products = productsVariety.iterator();
            while (products.hasNext()) {
                System.out.println(products.next());
            }
        } catch (Exception exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        } finally {
            System.out.println("Execution complete.");
        }
    }
}
