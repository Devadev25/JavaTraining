package com.basic.java8features.predefinedinterfaces.consumerexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        try {
            Consumer<String> consumer = (data) -> System.out.println(data);
            consumer.accept("AgiraTech");

            Consumer<String> consumer2 = (data) -> System.out.println(data + "Java");
            Consumer<String> consumer3 = (data) -> System.out.println(data + "world");
            consumer2.andThen(consumer3).accept("Hello");

            List<Integer> integer = new ArrayList<>();
            integer.add(34);
            integer.add(4);
            integer.add(11);
            integer.add(2);
            integer.add(84);
            integer.add(74);
            integer.forEach((integer1) -> System.out.println(integer1));

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
