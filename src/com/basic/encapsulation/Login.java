package com.basic.encapsulation;

public class Login {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        // Instance variable values
        System.out.println(facebook.getUserId());
        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassword());

        // Using setter method changing the values
        facebook.setUserId(321);
        facebook.setUserName("Agira");
        facebook.setPassword("Agira@321");

        // Getting values after changing
        System.out.println(facebook.getUserId());
        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassword());

    }
}
