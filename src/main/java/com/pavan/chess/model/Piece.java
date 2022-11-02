package com.pavan.chess.model;

import com.pavan.chess.enums.COlour;
import com.pavan.chess.enums.PieceType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Piece {
    private COlour colour;
    private PieceType pieceType;



}
