package com.basic.collectionsframework.collection.set.treeset;

import java.util.TreeSet;
import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        TreeSet<Contact> phoneBook = new TreeSet<>();
        Scanner userInput = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nPhone Book Menu:");
                System.out.println("1. Add Contact");
                System.out.println("2. Display Phone Book");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = userInput.nextInt();
                   userInput.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = userInput.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = userInput.nextLine();
                        Contact contact = new Contact(name, phoneNumber);
                        if (phoneBook.add(contact)) {
                            System.out.println("Contact added successfully!");
                        } else {
                            System.out.println("Contact already exists!");
                        }
                        break;
                    case 2:
                        System.out.println("Phone Book:");
                        for (Contact c : phoneBook) {
                            System.out.println(c);
                        }
                        break;
                    case 3:
                        System.out.println("Exiting Phone Book. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            userInput.close();
        }
    }
}

