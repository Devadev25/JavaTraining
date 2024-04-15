package com.basic.java8features.optionaldemo;

import java.util.Optional;

public class Server {
    public static void main(String[] args) {
        try {
            DataBase dataBase = new DataBase();
            Optional<User> data = dataBase.getUserById("2");

            if (data.isPresent()) {
                User user = data.get();
                System.out.println(user.getName());
            } else {
                System.out.println("User not found");
            }
            data.ifPresent((user) -> System.out.println("User found : " + user.getName()));

            User defaultUser = new User("0", "Default");
            User retrievedUser = data.orElse(defaultUser);
            System.out.println("Retrieved user : " + retrievedUser);

            String username = data.map(User::getName).orElse("Unknown");
            System.out.println(username);

            data.filter(user -> user.getName().isEmpty()).ifPresent(user -> System.out.println(user.getName()));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
