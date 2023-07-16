package com.pavan.chess.services;

import com.pavan.chess.enums.PieceType;

public class MoveValidatorFactory {



      PieceMoveValidator getValidator(PieceType pieceType){


        switch (pieceType){
            case KING: return new KingMoveValidator();
            case QUEEN: return new QueenMoveValidator();
            default: return new UnknownMoveValidator();
        }


    }
}
