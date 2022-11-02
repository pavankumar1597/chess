package com.pavan.chess.services;

import com.pavan.chess.Board;
import com.pavan.chess.Cell;

public interface PieceMoveValidator {
    public boolean validateMove(Board board,
                                Cell startCell,
                                Cell endCell);
}
