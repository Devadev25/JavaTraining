package com.basic.java8features.predefinedinterfaces.methodref.staticexample;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the name :");
        String name=userInput.nextLine();
        Converter converter=StringConverter::stringLength;
        int length= converter.convert(name);
        System.out.println("Length of the word was "+length);
    }
}
