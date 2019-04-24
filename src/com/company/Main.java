package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        User user = new User(1,"Barry");
        User user2 = new User(2,"Garry");
        User user3 = new User(1,"Harry");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        System.out.println(users);
        HashSet<User> set = new HashSet<>(users);
        System.out.println(set);
    }
}
