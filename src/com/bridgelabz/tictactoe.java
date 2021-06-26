package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class tictactoe {

	private static char[] boardArray;
	private static int[] boardArrayIndex = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private static String[] tossString = { "heads", "tails" };
	
	private static char[] Board() {
		char[] dummyBoardArray = new char[10];
		for (int i = 0; i < dummyBoardArray.length; i++) {
			dummyBoardArray[i] = '$';
		}
		return dummyBoardArray;
	}

	private static boolean IsEmpty(int index) {
		if (boardArrayIndex[index] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/* Returns a random string between "heads" & "tails" */
	@SuppressWarnings("unused")
	private static String TossMaker() {
		int index = new Random().nextInt(tossString.length);
		String randomString = (tossString[index]);
		return randomString;
	}

	private static void winningCondition() {

		// -----------------Horizontal conditions-----------------
		int i = 1;
		if (boardArray[i] == boardArray[i + 1] && boardArray[i + 1] == boardArray[i + 2]) {
			System.out.println("A player won");
			System.exit(0);
		}
		i = 4;
		if (boardArray[i] == boardArray[i + 1] && boardArray[i + 1] == boardArray[i + 2]) {
			System.out.println("A player won");
			System.exit(0);
		}
		i = 7;
		if (boardArray[i] == boardArray[i + 1] && boardArray[i + 1] == boardArray[i + 2]) {
			System.out.println("A player won");
			System.exit(0);
		}
		i = 1;
		if (boardArray[i] == boardArray[i + 3] && boardArray[i + 6] == boardArray[i + 3]) {
			System.out.println("A player won");
			System.exit(0);
		}
		i = 2;
		if (boardArray[i] == boardArray[i + 3] && boardArray[i + 6] == boardArray[i + 3]) {
			System.out.println("A player won");
			System.exit(0);
		}
		i = 3;
		if (boardArray[i] == boardArray[i + 3] && boardArray[i + 6] == boardArray[i + 3]) {
			System.out.println("A player won");
			System.exit(0);
		}
		
		i = 1;
		if (boardArray[i] == boardArray[i + 4] && boardArray[i + 4] == boardArray[i + 8]) {
			System.out.println("A player won");
			System.exit(0);
		}
		i = 3;
		if (boardArray[i] == boardArray[i + 2] && boardArray[i + 4] == boardArray[i + 2]) {
			System.out.println("A player won");
			System.exit(0);
		} else {
			System.out.println("The match is drawn");
			System.exit(0);
		}
	}
	
	
	
		// Allows the user to 'X' or 'O'
	
@SuppressWarnings("unused")
private static void ChooseLetter() {
	
	char firstplayerCharacterInput = ' ';
	char computerCharacterInput = ' ';
	try (Scanner sc = new Scanner(System.in)) {
		int positionOfMove;
		if (TossMaker().equals("heads")) {
		System.out.println("Time to give input Mr. Player : ");
		while (true) {
			System.out.println("Enter the position you want to give input in (from 1-9) : ");
			positionOfMove = sc.nextInt();
			if (positionOfMove >= 1 && positionOfMove <= 9) {
				if (IsEmpty(positionOfMove) == false) {
					System.out.println("The position is not empty. Please give other position input.");
					continue;
				}
				break;
			} else {
				System.out.println("The position is not empty. Please give other position input.");
				continue;
			}
		}
		
		
		boardArrayIndex[positionOfMove] = 1;
		while (true) {
			System.out.println("Enter 'X' or 'O' down below : ");
			char playerCharacterInput = sc.next().charAt(0);
			playerCharacterInput = sc.next().charAt(0);
			playerCharacterInput = Character.toUpperCase(playerCharacterInput);
			boardArray[positionOfMove] = playerCharacterInput;
			switch (playerCharacterInput) {
			case 'X': {
				playerCharacterInput = 'X';
				computerCharacterInput = 'O';
				break;
			}
			case 'O': {
				playerCharacterInput = 'O';
				computerCharacterInput = 'X';
				break;
			}
			default: {
				System.out.println("Please enter a valid input");
				
				
				continue;
			}
			}

			System.out.println("User input is : " + playerCharacterInput + " so the computer input will be : "
					+ computerCharacterInput);
			break;
		}
		} else {
			System.out.println("Computer plays first & has choosen X");
			System.exit(0);
		}
		sc.close();
	}
}
public static void main(String[] args) {		
	char[] boardArray = Board();
	ChooseLetter();
	ShowBoard(boardArray);
}


private static void ShowBoard(char[] boardArray) {
	System.out.println("THE BOARD");
	System.out.println(" ");
	System.out.print("|  ");
	for (char i = 1; i < 3; i++) {
		System.out.print(boardArray[i] + "  |  ");
	}
	System.out.print( boardArray[3] + "  ");
	System.out.print("|");
	System.out.println();
	System.out.println(" ");
	System.out.print("|  ");
	for (char i = 4; i < 6; i++) {
		System.out.print(boardArray[i] + "  |  ");
	}
	System.out.print(boardArray[6] + "  ");
	System.out.print("|");
	System.out.println();
	System.out.println(" ");
	System.out.print("|  ");
	for (char i = 7; i < 9; i++) {
		System.out.print(boardArray[i] + "  |  ");
	}
	System.out.print(boardArray[9] + "  ");
	System.out.println("|");
	System.out.print(" "); 
}

}

