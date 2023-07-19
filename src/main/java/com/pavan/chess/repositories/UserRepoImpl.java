package com.pavan.chess.repositories;

import com.pavan.chess.Database.userDb;
import com.pavan.chess.model.User;

import java.util.HashMap;

public class UserRepoImpl extends UserRepository {

    private HashMap<String, User> userdb;
    private static Boolean shouldSendOne = false;


    public UserRepoImpl() {
        this.userdb = userDb.connect();
    }

    @Override
    public User get(String email) {

        return userdb.get(email);

    }

    @Override
    public User getRandomUser() {

        shouldSendOne = !shouldSendOne;
        if (shouldSendOne) {
            return userdb.get("user.one@email.in");
        }
        return userdb.get("user.two@email.in");

    }

    @Override
    public void save(User user) {
        userdb.put(user.getEmail(), user);
    }
}
