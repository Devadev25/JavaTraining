package com.basic.abstraction;

public interface Modulus {
    public void mod(int i, int j);
    default  void print(){
        System.out.println("hello world");
    }
}
