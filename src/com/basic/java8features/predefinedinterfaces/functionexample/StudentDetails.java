package com.basic.java8features.predefinedinterfaces.functionexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class StudentDetails {
    public static void main(String[] args) {
        try {
            List<Student> details = new ArrayList<>();
            BiFunction<String, Integer, Student> biFunction = (name, rollnumber) -> new Student(name, rollnumber);
            details.add(biFunction.apply("Kishore", 100));
            details.add(biFunction.apply("Harshini", 102));
            details.add(biFunction.apply("Arun", 10));
            details.add(biFunction.apply("Vivek", 109));
            details.add(biFunction.apply("Saro", 8));

            for (Student student : details) {
                System.out.println("Name :" + student.name + " " + "Rollnumber :" + student.rollnumber);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
