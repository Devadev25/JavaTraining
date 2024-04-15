package com.basic.java8features.executionservicedemo.rundemo;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketBookingSystem {
    private final AtomicInteger availableTickets = new AtomicInteger(30);
        public void bookTickets(int tickets, String user) throws InterruptedException {

        int remainingTickets = availableTickets.getAndAccumulate(-tickets, Math::max);
        if (remainingTickets >= tickets) {
            Thread.sleep(1000);
            System.out.println(user + " booked " + tickets + " Tickets");
        } else {
            System.out.println(user + " could not book " + tickets + " Tickets ");
        }
    }
}

