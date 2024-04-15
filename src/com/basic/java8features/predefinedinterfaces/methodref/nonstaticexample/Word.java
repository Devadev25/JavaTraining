package com.basic.java8features.predefinedinterfaces.methodref.nonstaticexample;

import java.util.function.Predicate;

public class Word {
    public static void main(String[] args) {
        StringPredicate detail=new StringPredicate();
        Predicate<String> data=detail::isUpperCase;
        boolean result= data.test("hello");
        System.out.println("Is uppercase ? "+ result);
    }
}
