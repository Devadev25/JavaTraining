package com.basic.collectionsframework.collection.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class AdhaarApp {

    public static void main(String[] args) {
        LinkedHashSet<Long> aadhaarDetails = new LinkedHashSet<>();
        Scanner userInput = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nAadhaar Management System Menu:");
                System.out.println("1. Add Aadhaar Number");
                System.out.println("2. Display Aadhaar Numbers");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = userInput.nextInt();
                userInput.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Aadhaar Number: ");
                        long aadhaarNumber = userInput.nextLong();
                        if (aadhaarDetails.add(aadhaarNumber)) {
                            System.out.println("Aadhaar Number added successfully!");
                        } else {
                            System.out.println("Aadhaar Number already exists!");
                        }
                        break;
                    case 2:
                        System.out.println("Aadhaar Numbers:");
                        for (long aadhaar : aadhaarDetails) {
                            System.out.println(aadhaar);
                        }
                        break;
                    case 3:
                        System.out.println("Exiting Aadhaar Management System. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception exception) {
            System.out.println("An error occurred: " + exception.getMessage());
        } finally {
            userInput.close();
        }
    }
}



