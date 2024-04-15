package com.basic.java8features.optionaldemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DataBase {
    private Map<String, User> usersDb;

    public DataBase() {
        usersDb = new HashMap<>();
        usersDb.put("1", new User("1", "Kishore"));
        usersDb.put("2", new User("2", "Harshini"));
        usersDb.put("3", new User("10", "Arun"));
        usersDb.put("4", new User("11", "Vivek"));
        usersDb.put("5", new User("1201", "Harsha"));
        usersDb.put("6", new User("1001", "PachaiKizhi"));
    }

    public Optional<User> getUserById(String id) {
        return Optional.ofNullable(usersDb.get(id));
    }
}
