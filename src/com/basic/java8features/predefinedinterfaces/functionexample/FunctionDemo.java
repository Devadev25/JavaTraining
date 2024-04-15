package com.basic.java8features.predefinedinterfaces.functionexample;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        try {
            Function<String, Integer> function = (data) -> data.length();
            System.out.println(function.apply("Agira"));

            Function<Integer, String> function1 = (number) -> {
                if (number % 2 == 0) {
                    return "Number " + number + " is an even ";
                } else {
                    return "Number " + number + " is an odd ";
                }
            };
            System.out.println(function1.apply(10));

            Function<String, Integer> function2 = (data) -> data.length();
            Function<Integer, Integer> function3 = (number) -> number * 2;
            System.out.println(function2.andThen(function3).apply("Java"));

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
