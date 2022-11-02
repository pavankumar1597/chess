package com.pavan.chess.repositories;

import com.pavan.chess.Board;
import com.pavan.chess.Database.boardDb;

import java.util.ArrayList;

public class BoardRepo {
    private ArrayList<Board> board;

    public BoardRepo() {
        this.board = boardDb.connect();
    }

    public Board get(int size) {
        return board.get(size);

    }
}