package com.basic.collectionsframework.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class Fruits {

    public static void main(String[] args) {
        try {
            Set<String> fruitsVariety = new HashSet<>();
            fruitsVariety.add("Apple");
            fruitsVariety.add("Banana");
            fruitsVariety.add("Orange");
            fruitsVariety.add("Apple");

            System.out.println("Set elements:");
            for (String fruits : fruitsVariety) {
                System.out.println(fruits);
            }

            String searchItem = "Banana";
            if (fruitsVariety.contains(searchItem)) {
                System.out.println(searchItem + " is present in the fruitsVariety.");
            } else {
                System.out.println(searchItem + " is not present in the fruitsVariety.");
            }

            fruitsVariety.remove("Orange");

            System.out.println("\nSet elements after removing 'Orange':");
            for (String fruits : fruitsVariety) {
                System.out.println(fruits);
            }

            System.out.println("\nSize of the fruitsVariety: " + fruitsVariety.size());

            fruitsVariety.clear();

            System.out.println("\nSet elements after clearing:");
            for (String fruits : fruitsVariety) {
                System.out.println(fruits);
            }

            if (fruitsVariety.isEmpty()) {
                System.out.println("Set is empty.");
            } else {
                System.out.println("Set is not empty.");
            }
        } catch (Exception exception) {
            System.out.println("An error occured :" + exception.getMessage());
        } finally {
            System.exit(0);
        }
    }
}


