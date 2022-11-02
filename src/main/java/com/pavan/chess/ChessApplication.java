package com.pavan.chess;

import com.pavan.chess.controller.MoveController;
import com.pavan.chess.dto.MoveRequest;
import com.pavan.chess.dto.MoveResponse;
import com.pavan.chess.services.BoardService;
import com.pavan.chess.services.PlayerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

 public class ChessApplication {

	public static void main(String[] args) {
		PlayerService playerService = new PlayerService();
		BoardService boardService = new BoardService();

		Player player1 = playerService.getPlayer(COlour.WHITE);
		Player player2 = playerService.getPlayer(COlour.BLACK);

		Game game1 = new Game();

		List<Player> players = new ArrayList<>();
		players.add(player1);
		players.add(player2);

//		game1.setPlayers(players);
		player1.setGame(game1);
		player2.setGame(game1);

		playerService.save(player1);
		playerService.save(player2);

		game1.setBoard(boardService.setNewBoard(8));
		game1.setStatus(GameStatus.ACTIVE);

		MoveController playerController = new MoveController();
		game1.getBoard().printBoard();
		// RIGHT KING MOVE
		MoveResponse response = playerController.moveIt(new MoveRequest(1, game1.getBoard().getCell(0, 0), game1.getBoard().getCell(1, 1)));
		System.out.println(response.getMessage());
		// WRONG KING MOVE
		MoveResponse response1 = playerController.moveIt(new MoveRequest(1, game1.getBoard().getCell(1, 1), game1.getBoard().getCell(3, 1)));
		System.out.println(response1.getMessage());
	}
}
