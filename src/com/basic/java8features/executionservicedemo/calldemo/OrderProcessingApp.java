package com.basic.java8features.executionservicedemo.calldemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


public class OrderProcessingApp {
    public static void main(String[] args) {
//        ExecutorService executorService= Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> customerOrders = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Deva", 101, Arrays.asList("Apple", "Chocolate")));
        orders.add(new Order("Harshini", 105, Arrays.asList("Makeup kit", "Earings")));
        orders.add(new Order("Vivek", 11, Arrays.asList("Center fruit", "Curd")));
        orders.add(new Order("Harsha", 121, Arrays.asList("Chilli powder", "UradDal")));
        orders.add(new Order("Arun", 110, Arrays.asList("Cookies", "Pringles")));

//        for (Order callableOrder : orders){
//            Callable<String> task=new OrderProcess(callableOrder);
//            Future<String> future=executorService.submit(task);
//            customerOrders.add(future);
//        }
//        for (Future<String> future : customerOrders ){
//            try{
//                String result= future.get();
//                System.out.println(result);
//            }catch (InterruptedException | ExecutionException exception){
//                System.out.println(exception.getMessage());
//            }
//        }
        try {
            String firstCompletedOrder = executorService.invokeAny(createdOrders(orders));
            System.out.println("First Completed Order :" + firstCompletedOrder);

            List<Future<String>> futures = executorService.invokeAll(createdOrders(orders));
            for (Future<String> stringFuture : futures) {
                System.out.println(stringFuture.get());
            }
        } catch (InterruptedException | ExecutionException exception) {
            System.out.println(exception.getMessage());
        }

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(100000, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException.getMessage());
        }
    }

    private static List<Callable<String>> createdOrders(List<Order> orders) {
        List<Callable<String>> process = new ArrayList<>();
        for (Order order : orders) {
            process.add(new OrderProcess(order));
        }
        return process;
    }

}

