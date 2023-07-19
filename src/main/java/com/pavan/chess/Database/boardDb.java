package com.pavan.chess.Database;

import com.pavan.chess.model.Board;
import com.pavan.chess.enums.COlour;
import com.pavan.chess.model.Piece;
import com.pavan.chess.enums.PieceType;

import java.util.ArrayList;
import java.util.Arrays;

public class boardDb {
    public static ArrayList<Board> connect() {
        Board eightBoard = new Board(8);


        eightBoard.setCell(0, 0, new Piece(COlour.WHITE, PieceType.KING));
        eightBoard.setCell(0, 7, new Piece(COlour.BLACK, PieceType.KING));
        ArrayList<Board> board = new ArrayList<>();
        board.addAll(Arrays.asList(null, null, null, null, null, null, null, null, eightBoard));
        return board;
    }
}
