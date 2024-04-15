package com.basic.java8features.runandthread;

import sun.awt.SunToolkit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        try {
            List<Integer> numbers = new ArrayList<>();
            System.out.println("Enter 10 integers:");
            for (int i = 0; i < 10; i++) {
                int num = userInput.nextInt();
                numbers.add(num);
            }

            Runnable filterRunnable = () -> {
                numbers.removeIf(n -> n % 2 == 0);
                System.out.println("Filtered List: " + numbers);
            };

            Thread filterThread = new Thread(filterRunnable);
            System.out.println(filterThread.getState());
            filterThread.start();
            System.out.println(filterThread.getState());
            filterThread.setName("hard number");
            System.out.println(filterThread.getName());
            System.out.println(filterThread.getId());
            System.out.println(filterThread.isAlive());

        } catch (IllegalThreadStateException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            userInput.close();
        }
    }
}


