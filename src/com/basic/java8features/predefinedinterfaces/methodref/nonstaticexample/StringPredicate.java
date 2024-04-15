package com.basic.java8features.predefinedinterfaces.methodref.nonstaticexample;

public class StringPredicate {
    boolean isUpperCase(String word){
        return word.equals(word.toUpperCase());
    }
}
