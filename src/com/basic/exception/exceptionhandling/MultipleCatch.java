package com.basic.exception.exceptionhandling;

import java.lang.Exception;

public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int array[] = {10, 35, 87, 10, 90};
            System.out.println(array[6]);
            int integerValue = 5 / 0;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Index doesn't exist");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic Exception Handled");
        } catch (NullPointerException nullPointerException) {
            System.out.println("NullPointerException Handled");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


    }
}
