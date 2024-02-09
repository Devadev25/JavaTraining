package com.basic.oops;

public class Helper {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe");
        account1.deposit(500);
        account1.displayBalance();
        account1.withdraw(200);
        account1.displayBalance();

    }
    }

