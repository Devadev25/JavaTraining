package com.basic.java8features.predefinedinterfaces.consumerexample;

import java.util.List;
import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Details {
    public static void main(String[] args) {
        try {
            List<Person> details = new ArrayList<>();
            details.add(new Person("Vivek", 27));
            details.add(new Person("Harsha", 23));
            details.add(new Person("Saro", 21));
            details.add(new Person("Arun", 23));

            BiConsumer<String, Integer> personDetails = (name, age) ->{
                System.out.println("Name :" + name + " " + "Age :" + age);
            };
            for (Person person : details) {
                personDetails.accept(person.getName(), person.getAge());
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
