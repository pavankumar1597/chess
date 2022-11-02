package com.pavan.chess;


import lombok.Data;

@Data public class Cell extends  BaseModel {
    private COlour colour ;
    private Piece pawn ;
    private long cellX;
    private long cellY;

    public Cell(COlour colour, Piece pawn, long cellX, long cellY) {

        this.colour = colour;
        this.pawn = pawn;
        this.cellX = cellX;
        this.cellY = cellY;
    }
}
