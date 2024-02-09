package com.basic.collectionsframework.collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class Food {
    public static void main(String[] args) {
        try {
            TreeMap<Integer, String> menu = new TreeMap<>();
            menu.put(120, "Biriyani");
            menu.put(450, "Tandoori");
            menu.put(110, "fried rice");
            menu.put(240, "Mutton Biriyani");
            menu.put(220, "Prawn gravy");

            System.out.println(menu.keySet());
            System.out.println(menu.values());
            System.out.println(menu.size());
            System.out.println(menu.headMap(220));
            System.out.println(menu.subMap(150, 240));
            System.out.println(menu.tailMap(220));

            for (Integer integer : menu.keySet()) {
                System.out.println(integer);
            }
            for (String value : menu.values()) {
                System.out.println(value);
            }
            Iterator dishes = menu.entrySet().iterator();
            while (dishes.hasNext()) {
                System.out.println(dishes.next());
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        }
    }
}
