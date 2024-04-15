package com.basic.java8features.Synchronizedemo;

public class SecondValue extends Thread {
    Power power;

    public SecondValue(Power power) {
        this.power = power;
    }
    public void run(){
        power.printPower(8);
    }
}
