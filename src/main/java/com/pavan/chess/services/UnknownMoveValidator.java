package com.pavan.chess.services;

import com.pavan.chess.model.Board;
import com.pavan.chess.model.Cell;

public class UnknownMoveValidator implements  PieceMoveValidator{


    @Override
    public boolean validateMove(Board board, Cell startCell, Cell endCell) {
        return false;
    }
}
