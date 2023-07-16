package com.pavan.chess.repositories;

import com.pavan.chess.model.Player;

import java.util.HashMap;

public class PlayerRepo {


    private static PlayerRepo instance = null;
    HashMap<Integer, Player> player;

    private PlayerRepo() {
        this.player = new HashMap<>();


    }
    public static PlayerRepo getInstance() {
        if(instance == null)
            instance = new PlayerRepo();
        return instance;
    }
}
