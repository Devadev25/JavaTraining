package com.basic.teashopmanagement;

import java.util.Scanner;

public class Management {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Enter the owner name : ");
                String ownerName = userInput.next();
                System.out.println("Enter the address : ");
                String address = userInput.next();
                System.out.println("Enter the phone number");
                long phoneNumber = userInput.nextLong();
                TeaShopItems teaShopItems = new TeaShopItems(ownerName, address, phoneNumber);
                boolean exit = true;
                do {
                    System.out.println("Enter the options : \n1.Sell the Teashop Items" +
                            " \n2.Stock the Teashop Items " +
                            "\n3.Get the inventory " +
                            "\n4.Exit ");
                    int option = userInput.nextInt();

                    switch (option) {

                        case 1:
                            teaShopItems.sellItems();
                            break;
                        case 2:
                            teaShopItems.stockItems();
                            break;
                        case 3:
                            teaShopItems.getInventory();
                            break;
                        case 4:
                            exit = false;
                            System.out.println("Successsfully exited");
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                } while (exit);

            } catch (Exception exception) {
                System.err.println("An Error Occured" + exception.getMessage());
            }
            userInput.nextLine();
            System.out.println("Press 1 to Continue, Press 2 to exit from program");
            byte option = userInput.nextByte();
            if (option == 2) {
                break;
            }

        }
    }

}
