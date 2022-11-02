package com.pavan.chess.dto;

import com.pavan.chess.Board;
import com.pavan.chess.GameStatus;
import com.pavan.chess.Player;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MoveResponse {
    String message;
    Board board;
    GameStatus active;
    Player playe;

}
