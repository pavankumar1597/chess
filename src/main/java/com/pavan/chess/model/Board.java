package com.pavan.chess.model;

import java.util.ArrayList;
import java.util.List;


import com.pavan.chess.enums.COlour;
import com.pavan.chess.enums.PieceType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Board extends BaseModel {

    long size;
    private List<List<Cell>> board;


    public Board(long size) {
        super();

        this.size = size;
        List<List<Cell>> emptyBoard = new ArrayList<>();
        System.out.println("njhgfccjhb");
        for (long cellX = 0; cellX < size; cellX++) {
            List<Cell> emptyRow = new ArrayList<>();
            for (long cellY = 0; cellY < size; cellY++) {
                System.out.println("njhgfccjhb");

                COlour cellColour = cellY * cellX % 2 == 0 ? COlour.BLACK : COlour.WHITE;
                emptyRow.add(new Cell(cellColour, new Piece(COlour.UNKNOWN, PieceType.UNKNOWN), cellX, cellY));
            }
            emptyBoard.add(emptyRow);
        }

        System.out.println("-------------------------------------------");

        this.board = emptyBoard;
    }


    public Cell getCells(Cell startCell) {
        return board.get((int) startCell.getCellX()).get((int) startCell.getCellY());
    }

    public Cell getCell(int cellX, int cellY) {
        return this.board.get(cellX).get(cellY);
    }

    public void setCell(int x, int y, Piece piece) {
        board.get(x).get(y).setPawn(piece);
    }

    public void printBoard() {
        for (int cellY = (int) size - 1; cellY >= 0; cellY--) {
            for (int cellX = 0; cellX < size; cellX++) {
                Cell currentCell = this.getCell(cellX, cellY);
                System.out.print(String.format("%-20s", currentCell.toString()));
            }
            System.out.println("\n");
        }
    }

    public Board movePiece(Cell startCell, Cell endCell) {
        Piece piece = startCell.getPawn();
        startCell.setPawn(new Piece(COlour.UNKNOWN, PieceType.UNKNOWN));
        endCell.setPawn(piece);
        return this;


    }
}
