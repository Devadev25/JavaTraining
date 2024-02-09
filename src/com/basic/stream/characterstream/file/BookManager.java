package com.basic.stream.characterstream.file;

import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        try {
            boolean entry = true;
            while (entry) {
                System.out.println("Welcome to Book Manager!");
                System.out.println("1. Write to the file");
                System.out.println("2. Display content of the file");
                System.out.println("3.exit");
                System.out.println("Enter your choice: ");
                int choice = userInput.nextInt();
                switch (choice) {
                    case 1:
                        Book.writeToFile();
                        break;
                    case 2:
                        Content.displayContent();
                        break;
                    case 3:
                        System.out.println("exited successfully");
                        entry = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                userInput.close();
            } catch (Exception closeException) {
                System.out.println(closeException.getMessage());
            }
        }
    }
}
