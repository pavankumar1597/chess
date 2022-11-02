package com.pavan.chess.services;

import com.pavan.chess.Board;
import com.pavan.chess.Cell;

public class QueenMoveValidator implements PieceMoveValidator{
    @Override
    public boolean validateMove(Board board, Cell startCell, Cell endCell) {
        return false;
    }
}
