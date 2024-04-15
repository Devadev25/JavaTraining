package com.basic.java8features.executionservicedemo.rundemo;

import com.basic.java8features.executionservicedemo.rundemo.TicketBookingSystem;

public class User implements Runnable {
    private TicketBookingSystem bookingSystem;
    private int tickets;
    private String name;

    public User(TicketBookingSystem bookingSystem, int tickets, String name) {
        this.bookingSystem = bookingSystem;
        this.tickets = tickets;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread currentThread = Thread.currentThread();
            System.out.println(name+" Job Started by "+Thread.currentThread().getName()+" "+"and in a " +Thread.currentThread().getState()+" state. ");
            bookingSystem.bookTickets(tickets, name);
            try{
                Thread.sleep(3000);
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
            System.out.println(name+" Job completed by "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
