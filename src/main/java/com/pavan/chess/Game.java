package com.pavan.chess;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Game extends  BaseModel{

    private List<Player> players;
    private Date startTime;
    private Board board;
    private  GameStatus status;

}
