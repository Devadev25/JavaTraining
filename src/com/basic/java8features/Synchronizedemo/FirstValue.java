package com.basic.java8features.Synchronizedemo;

public class FirstValue extends Thread{
    Power power;

    public FirstValue(Power power) {
        this.power = power;
    }
    public  void run(){
        power.printPower(5);
    }
}
