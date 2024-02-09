package com.basic.stream.bytestream;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Owner {
    static Scanner userData = new Scanner(System.in);

    public static void main(String[] args) {
        String filePath="src/com/basic/stream/bytestream/menu.properties";
        FileOutputStream menus = null;
        try {
            Properties menuList = new Properties();
            FileInputStream fs=new FileInputStream(filePath);
            menuList.load(fs);
            menus = new FileOutputStream(filePath,true);

            boolean addMore = true;
            while (addMore) {
                System.out.println("Enter the name of the dish:");
                String dishName = userData.nextLine();
                System.out.println("Enter the price of the dish:");
                String dishPrice = userData.nextLine();

                menuList.setProperty(dishName, dishPrice);

                System.out.println("Do you want to add another dish? (yes/no):");
                String choice = userData.nextLine();
                if (!choice.equalsIgnoreCase("yes")) {
                    addMore = false;
                }
            }
            menuList.store(menus, "updated menu");
            System.out.println("Menu updated successfully.");
            System.out.println("Data has been written to the file.");
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (menus != null) {
                try {
                    menus.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
