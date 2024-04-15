package com.basic.java8features.Synchronizedemo;

public class PowerRunner {
    public static void main(String[] args) {
        Power power = new Power();
        FirstValue firstValue = new FirstValue(power);
        SecondValue secondValue = new SecondValue(power);
        firstValue.start();
        secondValue.start();
    }
}
