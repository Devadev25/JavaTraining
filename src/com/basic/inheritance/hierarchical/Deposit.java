package com.basic.inheritance.hierarchical;

import java.lang.Math;
import java.text.DecimalFormat;

public class Deposit extends Bank {
    double depositedAmount = 100.21;

    public void depositAmount() {
        System.out.println("Deposit amt : " + depositedAmount);
        availableBalance = availableBalance + depositedAmount;
//      DecimalFormat decimalFormat = new DecimalFormat("#.###");
//      System.out.println("Total Ava bal is:" +Math.round((availableBalance)));

        System.out.format("Total Ava bal is: %.5f", availableBalance).println();
    }
}
