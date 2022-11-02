package com.pavan.chess.services;

import com.pavan.chess.model.Board;
import com.pavan.chess.model.Game;
import com.pavan.chess.repositories.BoardRepo;

public class BoardService {
    private BoardRepo boardRepository;

    public BoardService() {
        this.boardRepository = new BoardRepo();
    }
    public Board findBoardById(Game game) {
        return game.getBoard();
    }



    public Board setNewBoard(int size) {
        return this.boardRepository.get(8);
    }
}
