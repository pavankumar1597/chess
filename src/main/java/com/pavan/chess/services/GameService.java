package com.pavan.chess.services;

import com.pavan.chess.model.Game;
import com.pavan.chess.model.Player;

public class GameService {
    public Game findGameByPlayer(Player player) {
    return player.getGame();
    }
}
