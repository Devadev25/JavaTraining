package com.basic.collectionsframework.collection.map.linkedhashmap;

import java.util.*;

public class LinkedMapExample {
    public static void main(String[] args) {
        try {
            LinkedHashMap<Integer, String> data = new LinkedHashMap<>();
            data.put(388, "Rahul");
            data.put(1, "Riya");
            data.put(103, "Pooja");
            System.out.println(data);
            System.out.println(data.keySet());
            System.out.println(data.values());
            System.out.println(data.get(101));
            System.out.println(data.get(334));
            System.out.println(data.containsKey(1002));
            System.out.println(data.containsValue("Java"));
            data.put(101, "Sanju");
            data.put(103, "Pooja1.0");
            System.out.println("After adding duplicate keys" + data);
            data.put(null, "Pooja2.0");
            System.out.println(data);
            data.put(null, "Pooja3.0");
            System.out.println(data);

            for (Integer integer : data.keySet()) {
                System.out.println(integer);
            }
            for (String value : data.values()) {
                System.out.println(value);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
