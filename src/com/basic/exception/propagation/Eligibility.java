package com.basic.exception.propagation;

public class Eligibility {
    public static void main(String[] args) {
        try {
            age();
        } catch (License license) {
            System.out.println(license.getMessage());
        } finally {
            System.exit(0);
        }
    }

    public static void age() throws License {
        int eligibilityAge = 18;
        int personAge = 14;
        if (eligibilityAge >= personAge) {
            throw new License("Your not eligible"); // creating new custom exception object using new keyword
        } else {
            System.out.println("You can get your license ");
        }
    }
}
