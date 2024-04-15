package com.basic.java8features.predefinedinterfaces.methodref.constructorexamples;

import java.util.function.Function;

public class Details {
    public static void main(String[] args) {
        Function<String,Person> assigner=Person::new;
        Person person = assigner.apply("John");
        System.out.println("Person name: " + person.getName());
    }
}
