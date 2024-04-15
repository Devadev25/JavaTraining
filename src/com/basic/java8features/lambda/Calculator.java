package com.basic.java8features.lambda;

import java.util.Scanner;

public class Calculator {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the task to be done \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.exit ");
        int task = userInput.nextInt();
        System.out.println("Enter the first value :");
        double firstValue = userInput.nextDouble();
        System.out.println("Enter the second value :");
        double secondValue = userInput.nextDouble();
        Operation result;
        try {
            switch (task) {
                case 1:
                    result = (double x, double y) -> x + y;
                    System.out.println(result.operation(firstValue, secondValue));
                    break;
                case 2:
                    result = (double x, double y) -> x - y;
                    System.out.println(result.operation(firstValue, secondValue));
                    break;
                case 3:
                    result = (double x, double y) -> x * y;
                    System.out.println(result.operation(firstValue, secondValue));
                    break;
                case 4:
                    try {
                        if (secondValue == 0) {
                            System.out.println("Division by zero");
                        }
                    } catch (ArithmeticException arithmeticException) {
                        System.out.println(arithmeticException.getMessage());
                    }
                    result = (double x, double y) -> x / y;
                    System.out.println(result.operation(firstValue, secondValue));
                    break;
                case 5:
                    System.out.println("Successfully exited");
                    break;
                default:
                    System.out.println("Invalid option.please try again");
                    return;
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            userInput.close();
        }
    }

}
