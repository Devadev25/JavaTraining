package com.basic.java8features.executionservicedemo.rundemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TicketSeller {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new User(bookingSystem, 3, "deva"));
        executorService.submit(new User(bookingSystem, 2, "Harshini"));
        executorService.submit(new User(bookingSystem, 8, "Harsha"));
        executorService.submit(new User(bookingSystem, 2, "Kishore"));
        executorService.submit(new User(bookingSystem, 2, "Arun"));
        executorService.submit(new User(bookingSystem, 1, "Saro"));
        executorService.submit(new User(bookingSystem, 6, "Dany"));
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(100000, TimeUnit.MILLISECONDS)) {
                System.out.println("Task not completed");
                executorService.shutdownNow();
            }
        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException.getMessage());
        }
    }
}
