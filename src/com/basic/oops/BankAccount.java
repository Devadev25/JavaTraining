package com.basic.oops;
   public class BankAccount {
        private int accountNumber;
        private double balance;
        private String ownerName;


        public BankAccount(String ownerName) {
            this.ownerName = ownerName;
            this.accountNumber = generateAccountNumber();
        }

        private int generateAccountNumber() {
            // Generate and return a random account number (for demonstration purposes)
            return (int) (Math.random() * 1000000);
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void deposit(double amount) {
            balance += amount;
        }


        public void displayBalance() {
            System.out.println("Account Balance: " + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " successful.");
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        }
    }

