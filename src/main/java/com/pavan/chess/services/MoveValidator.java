package com.pavan.chess.services;

import com.pavan.chess.Board;
import com.pavan.chess.Cell;
import com.pavan.chess.Piece;
import com.pavan.chess.dto.MoveRequest;
import lombok.RequiredArgsConstructor;

public class MoveValidator {


    private MoveValidatorFactory moveValidatorFactory =
            new MoveValidatorFactory();

    public boolean moveValidator(Board boardById, MoveRequest moveRequest) {

        Cell cellsStart = boardById.getCells(moveRequest.getStartCell());
        Cell cellEnd = boardById.getCells(moveRequest.getEndCell());
        PieceMoveValidator validator = moveValidatorFactory.getValidator(cellsStart.getPawn().getPieceType());
        return   validator.validateMove(boardById,cellsStart,cellEnd) ;
    }
}
