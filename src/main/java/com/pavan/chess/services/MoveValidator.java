package com.pavan.chess.services;

import com.pavan.chess.model.Board;
import com.pavan.chess.model.Cell;
import com.pavan.chess.dto.MoveRequest;

public class MoveValidator {


    private MoveValidatorFactory moveValidatorFactory =
            new MoveValidatorFactory();

    public boolean moveValidator(Board boardById, MoveRequest moveRequest) {

        Cell cellsStart = boardById.getCells(moveRequest.getStartCell());
        Cell cellEnd = boardById.getCells(moveRequest.getEndCell());
        PieceMoveValidator validator = moveValidatorFactory.getValidator(cellsStart.getPawn().getPieceType());
        return validator.validateMove(boardById, cellsStart, cellEnd);
    }
}
