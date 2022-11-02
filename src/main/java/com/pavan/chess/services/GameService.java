package com.pavan.chess.services;

import com.pavan.chess.Game;
import com.pavan.chess.Player;

public class GameService {
    public Game findGameByPlayer(Player player) {
    return player.getGame();
    }
}
