package com.pavan.chess.controller;


import com.pavan.chess.model.Board;
import com.pavan.chess.model.Game;
import com.pavan.chess.enums.GameStatus;
import com.pavan.chess.model.Player;
import com.pavan.chess.dto.MoveRequest;
import com.pavan.chess.dto.MoveResponse;
import com.pavan.chess.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("move")
@RequiredArgsConstructor
public class MoveController {



    
    PlayerService playerService = new PlayerService();
    BoardService boardService = new BoardService();
    MoveValidator moveValidator =
            new MoveValidator();



    

    public  GameService gameService = new GameService();





    

    @PostMapping("")
    public MoveResponse moveIt(MoveRequest moveRequest){


        
        Player player = playerService.findPlayerById(moveRequest.getPlayerId());
        Game game = gameService.findGameByPlayer(player);


        
        Board board = boardService.findBoardById(game);
        boolean b = moveValidator.moveValidator(board, moveRequest);
        if (b) {
            // doesn't include attacks to opponent players


            
            // only move feature implemented, same player keeps moving for now
            String message = player.getColor() + " moves " + moveRequest.getStartCell().toString() + " to " + moveRequest.getEndCell().toString();
             board = board.movePiece(moveRequest.getStartCell(), moveRequest.getEndCell());
            System.out.println("\n\n");
            System.out.println("new board : ");
            board.printBoard();

            
            return new MoveResponse(message, board, GameStatus.ACTIVE, player);
        }



        

        System.out.println("\n\n");
        System.out.println("new board : \n");
        board.printBoard();

        return new MoveResponse("Invalid move", board, GameStatus.ACTIVE, player);
    }




    //dumy test
}
