package com.basic.stream.bytestream;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class Customer {
    static Scanner userChoice = new Scanner(System.in);

    public static void main(String[] args) {
        String filePath="src/com/basic/stream/bytestream/menu.properties";
        FileInputStream menuFile = null;
        try {
            menuFile = new FileInputStream(filePath);
            Properties menuProperties = new Properties();
            menuProperties.load(menuFile);

            System.out.println("Welcome to the Restaurant Menu!");
            while (true) {
                System.out.println("Please select your dishes from the menu:");
                for (String dish : menuProperties.stringPropertyNames()) {
                    System.out.println(dish + " - " + menuProperties.getProperty(dish));

                }

                System.out.println("Enter the dish numbers you'd like to order (comma-separated):");
                String userChoices = userChoice.nextLine();

                String[] chosenDishes = userChoices.split(", ");
                System.out.println("You've selected the following dishes:");
                for (String choice : chosenDishes) {
                    String chosenDish = choice.trim();
                    boolean found = false;
                    for (String dishName : menuProperties.stringPropertyNames()) {
                        if (chosenDish.equalsIgnoreCase(dishName)) {
                            found = true;
                            String dishPrice = menuProperties.getProperty(dishName);
                            System.out.println(dishName + " - " + dishPrice);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid dish: " + chosenDish);
                    }
                }

            }

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            userChoice.close();

        }
    }
}


