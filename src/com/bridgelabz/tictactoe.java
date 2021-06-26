package com.bridgelabz;

public class tictactoe {
private static char[] Board() {
		char[] boardArray = new char[11];
		for(char c : boardArray) {
			c = ' ';
		}
		return boardArray;
	}
	
	public static void main(String[] args) {
		Board();
	}
}

