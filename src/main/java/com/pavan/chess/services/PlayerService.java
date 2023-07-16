package com.pavan.chess.services;

import com.pavan.chess.enums.COlour;
import com.pavan.chess.model.Player;
import com.pavan.chess.repositories.PlayerRepo;
import com.pavan.chess.repositories.UserRepoImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PlayerService {
    UserRepoImpl userRepoImpl;
    Boolean shouldIdBeOne;
    HashMap<Long, Player> player = new HashMap<>();
    PlayerRepo playerRepository;


    public PlayerService() {
        playerRepository = PlayerRepo.getInstance();
        this.shouldIdBeOne = false;
    }
    public Player findPlayerById(long playerId) {

        return player.get(playerId);

    }
    public Player getPlayer(COlour colour) {
        UserService userService = new UserService();
        shouldIdBeOne = !shouldIdBeOne;
        long id = shouldIdBeOne ? 1 : 2;
        return new Player(id, userService.getRandomUser(),colour);
    }


    public void save(Player player1) {
        player.put(player1.getId(),player1);

    }
}
