package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.core.ui.UI;

public class Game {

	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	private int currentPlayIndex = 0;

	public void play() {
		UI.printGameTitle();

		for (int i = 0; i < players.length; i++) {
			players[i] = createPlayer(i);
				
			
		}

	}

	private Player createPlayer(int index) {
		String name = UI.readInput("Jogador" + (index + 1) + "=>");
		char symbol = Constants.SYMBOL_PLAYERS[index];
		Player player = new Player(name, board, symbol);

		UI.printText("O jogador '" + name + "'vai usar i simbolo '" + symbol + "' ");

		return player;
	}
	
	private Player nextPlayer() {
		/*
		currentPlayIndex++;
		
		if (currentPlayIndex >= players.length) {
			currentPlayIndex = 0;
		}
		return players[currentPlayIndex];
		*/
		currentPlayIndex = (currentPlayIndex + 1) % players.length;
		return players[currentPlayIndex];
	}
}
