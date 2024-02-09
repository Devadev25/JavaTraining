package com.basic.teashopmanagement;

import java.util.Scanner;

public class TeaShopItems extends OwnerDetails {
    Scanner userInput = new Scanner(System.in);
    int[] itemCounts;

    TeaShopItems(String ownerName, String address, long phoneNumber) {
        super(ownerName, address, phoneNumber);
        this.itemCounts = new int[4];

    }

    void sellItems() {
        try {
            System.out.println("enter the item to be sell\n1.Vada\n2.Bonda\n3.Bajie\n4.Muttaikose");
            byte itemType = userInput.nextByte();
            System.out.println("Quantity to sell");
            byte quantity = userInput.nextByte();
            if (itemType >= 1 && itemType <= 4) {
                if (quantity <= itemCounts[itemType - 1]) {
                    itemCounts[itemType - 1] -= quantity;
                    System.out.println("sold :" + quantity + " " + getItemName(itemType));
                } else {
                    System.out.println("Not enough stock available");
                   int stock=itemCounts[itemType -1];
                    System.out.println("Inventory Available : "+stock);
                }
            } else {
                System.err.println("Invalid item");
            }

        } catch (Exception exception) {
            System.err.println("Invalid input. Please enter valid number");
        }
    }

    void stockItems() {
        System.out.println("enter the item to be stock \n1.Vada\n2.Bonda\n3.Bajie\n4.Muttaikose");
        byte itemType = userInput.nextByte();
        System.out.println("Quantity to stock");
        int quantity = userInput.nextInt();
        if (itemType >= 1 && itemType <= 4) {

            itemCounts[itemType - 1] += quantity;
            System.out.println("stock :" + quantity + getItemName(itemType));
        } else {
            System.err.println("Invalid item type");
        }
    }

    void getInventory() {
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Inventory Items:");
        for (int i = 0; i < 4; i++) {
            System.out.println(getItemName(i + 1) + ": " + itemCounts[i]);
        }


    }

    String getItemName(int itemType) {
        switch (itemType) {
            case 1:
                return "vada";
            case 2:
                return "Bonda";
            case 3:
                return "Bajie";
            case 4:
                return "Muttaikose";
            default:
                return "Unknown";
        }
    }

}


