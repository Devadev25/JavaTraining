package com.basic.java8features.Synchronizedemo;

public class Power {
    synchronized void printPower(int value){
        int temp=1;
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":-"+value+"^"+i+" value : "+value*temp);
            temp=value*temp;
            try{
                Thread.sleep(500);
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
