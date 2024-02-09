package com.basic.methodoverloading;

public class Main {
    public static void main(String args[]) {
        Payment payment = new Payment();
        payment.payment("Gpay", 9573);
        payment.payment("Debitcard", 4581643278941254l, 522);
        payment.payment("savings", "ravikiran", 6547523, 35486785214l);
    }
}
