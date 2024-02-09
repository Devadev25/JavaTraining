package com.basic.inheritance.hierarchical;

public class Account {
    public static void main(String[] args) {

        System.out.println("Deposit process");
        Deposit deposit = new Deposit();
        deposit.details();
        deposit.depositAmount();
        System.out.println("Withdrawl Process");
        Withdraw withdraw = new Withdraw();
        withdraw.details();
        withdraw.withdrawAmount();
    }
}
