package br.com.softblue.tictactoe.core;

public class Move {
	private	int i;
	private int j;
	
	public Move(String moveStr) {
		
		//"0,0" 
		//["1" "2"]
		String[] tokens = moveStr.split(",");
		
		this.i = Integer.parseInt(tokens[0]);
		this.j = Integer.parseInt(tokens[0]);
		
		//TODO Validar se a estrutura do moveStr esta correta
		
	}
	
	public int getI() { //get == metodo que retorna o valor do I
		return i;
	}

	public int getJ() {
		return j;
	}
	
	
}
