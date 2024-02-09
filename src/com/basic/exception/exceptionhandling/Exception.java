package com.basic.exception.exceptionhandling;

public class Exception extends Throwable {
    public static void main(String[] args) {
        try {
            int intValue = 10 / 0;

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid input can't divide a number by zero");
        }
        try {
            String stringData = null;
//            String stringData2="null";
            System.out.println(stringData.length());
        } catch (NullPointerException nullPointerException) {

            System.out.println("String can't be null ");
        } finally {
            System.exit(0);
        }
    }
}
