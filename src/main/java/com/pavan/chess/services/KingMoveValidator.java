package com.pavan.chess.services;

import com.pavan.chess.model.Board;
import com.pavan.chess.model.Cell;

public class KingMoveValidator implements PieceMoveValidator{
    @Override
    public boolean validateMove(Board board, Cell startCell, Cell endCell) {

        boolean isValidXMoved = Math.abs(startCell.getCellX() - endCell.getCellX()) <= 1;
        boolean isValidYMoved = Math.abs(startCell.getCellX() - endCell.getCellX()) <= 1;
        boolean isStationary = startCell == endCell;
        if(isValidXMoved && isValidYMoved && !isStationary)
            return true;
        return false;

    }
}
