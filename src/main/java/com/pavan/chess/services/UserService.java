package com.pavan.chess.services;

import com.pavan.chess.model.User;
import com.pavan.chess.repositories.UserRepoImpl;
import com.pavan.chess.repositories.UserRepository;

public class UserService {
    private UserRepository userRepository;

    UserService() {
        // how can I not use InMemoryUserRepository here directly
        this.userRepository = new UserRepoImpl();
    }

    public User getRandomUser() {
        return userRepository.getRandomUser();
    }
}
