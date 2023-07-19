package com.pavan.chess.Database;

import com.pavan.chess.model.User;

import java.util.HashMap;

public class userDb {
    public static HashMap<String, User> connect() {
        HashMap<String, User> userMap = new HashMap<>();
        userMap.put("user.one@email.in", new User(1, "User One", "user.one@email.in"));
        userMap.put("user.two@email.in", new User(2, "User Two", "user.two@email.in"));
        userMap.put("user.three@email.in", new User(3, "User Three", "user.three@email.in"));
        return userMap;
    }
}
