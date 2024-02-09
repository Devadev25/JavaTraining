package com.basic.collectionsframework.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        try {
            Map<String, Integer> details = new HashMap<>();
            details.put("John", 25);
            details.put("Alice", 30);
            details.put("Bob", 28);
            details.put("Sarah", 35);

            Scanner userInput = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Choose an operation:");
                System.out.println("1. Get age by name");
                System.out.println("2. Check if a name is present");
                System.out.println("3. Remove a name");
                System.out.println("4. Print all details");
                System.out.println("5. Print size of details");
                System.out.println("6. Clear all details");
                System.out.println("7. Exit");

                int choice = userInput.nextInt();
                userInput.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter name:");
                        String name = userInput.nextLine();
                        System.out.println("Age of " + name + ": " + details.get(name));
                        break;
                    case 2:
                        System.out.println("Enter name:");
                        name = userInput.nextLine();
                        System.out.println("Is '" + name + "' present? " + details.containsKey(name));
                        break;
                    case 3:
                        System.out.println("Enter name to remove:");
                        name = userInput.nextLine();
                        details.remove(name);
                        System.out.println(name + " removed.");
                        break;
                    case 4:
                        System.out.println("Details: " + details);
                        break;
                    case 5:
                        System.out.println("Size of key and value mapping: " + details.size());
                        break;
                    case 6:
                        details.clear();
                        System.out.println("Details cleared.");
                        break;
                    case 7:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                        break;
                }
            }

            System.out.println("Exiting program...");
            userInput.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
