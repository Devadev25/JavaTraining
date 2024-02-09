package com.basic.abstraction;

class Operations extends Calculator implements Modulus {
    @Override
    public void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    @Override
    public void sub(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    @Override
    public void div(int number1, int number2) {
        System.out.println(number1 / number2);
    }

    @Override
    public void mult(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    @Override
    public void mod(int i,int j) {
System.out.println(i%j);
    }

    public  void  print(){
        System.out.println("default method overridden");
    }
}
