package com.pavan.chess.dto;

import com.pavan.chess.model.Board;
import com.pavan.chess.enums.GameStatus;
import com.pavan.chess.model.Player;
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
