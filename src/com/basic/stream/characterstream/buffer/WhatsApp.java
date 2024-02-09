package com.basic.stream.characterstream.buffer;


public class WhatsApp {

    public static void main(String[] args) {
        try {
            boolean entry = true;
            while (entry) {
                System.out.println("Welcome to Book Manager!");
                System.out.println("1. Login ");
                System.out.println("2. Login details");
                System.out.println("3.exit");
                System.out.println("Enter your choice: ");
                int choice = Utility.userInput.nextInt();
                switch (choice) {
                    case 1:
                        Login.entry();
                        break;
                    case 2:
                        DisplayLog.logDetails();
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
                Utility.userInput.close();
            } catch (Exception closeException) {
                System.out.println(closeException.getMessage());
            }
        }
    }

}
