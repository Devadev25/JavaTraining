package com.basic.inheritance.hierarchical;

public class Withdraw extends Bank {
    double amount = 100.02;

    public void withdrawAmount() {
        if (amount > availableBalance) {
            System.out.println("You cannot withdrawl‐balance exceeds");
        } else {
            System.out.println("Collect Amount");
        }
    }
}
