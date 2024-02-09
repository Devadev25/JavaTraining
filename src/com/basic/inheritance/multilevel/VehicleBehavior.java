package com.basic.inheritance.multilevel;

public class VehicleBehavior {
    public static void main(String[] args) {
        ElectricCar ev = new ElectricCar();
        ev.move();
        ev.start();
        ev.charging();
    }
}
