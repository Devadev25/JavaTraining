package com.basic.abstraction;

public class Implementation {
    public static void main(String[] args) {
        Operations c1 = new Operations();
        c1.add(100, 300);
        c1.sub(500, 300);
        c1.div(100, 30);
        c1.mult(100, 300);
        c1.print();
    }
}
