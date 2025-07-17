package aplication;

import chess.ChessMath;

public class Program {

	public static void main(String[] args) {
		
		ChessMath chessmatch = new ChessMath();
		UI.printBoard(chessmatch.getPieces());
		
	}
}