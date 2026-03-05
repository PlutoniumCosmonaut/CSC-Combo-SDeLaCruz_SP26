//this is a tic tac toe game. it will need a player variable and a board
//the player variable will be an int that alternates between 1 and 2
//the board will be an array of chars

import java.util.Scanner;

public class ticTacToe {

	public static void main(String[] args) {
		int player = 2;
		char[] board = new char[9];
		fillBoard(board);
		drawBoard(board);
		int count = 0;
		while (count < 9 && checkWinner(board, player) < 0) {
			player = player % 2 + 1;
			makeBoard(board, player);
			drawBoard(board);
			
			count++;
		}
		if (checkWinner(board, player) > 0)
			System.out.println("Player " + player + " is the winner");
		else
			System.out.println("Cats game");
	}

	private static int checkWinner(char[] board, int player) {
		String line = "";
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				line = String.valueOf(board[0]) + board[1] + board[2];
				break;
			case 1:
				line = String.valueOf(board[3]) + board[4] + board[5];
				break;
			case 2:
				line = String.valueOf(board[6]) + board[7] + board[8];
				break;
			case 3:
				line = String.valueOf(board[0]) + board[3] + board[6];
				break;
			case 4:
				line = String.valueOf(board[1]) + board[4] + board[7];
				break;
			case 5:
				line = String.valueOf(board[2]) + board[5] + board[8];
				break;
			case 6:
				line = String.valueOf(board[2]) + board[4] + board[6];
				break;
			case 7:
				line = String.valueOf(board[0]) + board[4] + board[8];
				break;

			}
			if (line.equals("OOO") || line.equals("XXX"))
				return player;

		}
		return -1;
	}

	private static void makeBoard(char[] board, int player) {
		Scanner input = new Scanner(System.in);
		char marker = 'X';
		if (player == 2)
			marker = 'O';
		int place = -1;
		while (place < 1 || place > 9) { //makes sure they choose 1-9
			System.out.println("Player " + player + " enter the number where you want to place your marker");
			place = input.nextInt();
		}
		while (!Character.isDigit(board[place - 1]))// makes sure spot isnt being used
		{
			System.out.println("Player " + player + " enter the number where you want to place your marker");
			place = input.nextInt();
		}
		board[place - 1] = marker;

	}

	private static void drawBoard(char[] board) {
		int index = 0;
		for (int i = 0; i < 3; i++)// rows
		{
			for (int j = 0; j < 3; j++)// columns
			{
				System.out.print(board[index]);
				if (j != 2)
					System.out.print('|');
				index++;

			}
			System.out.println();
			if (i != 2)
				System.out.println("~~~~~");
		}
	}

	private static void fillBoard(char[] board) {
		int index = 0;
		for (char i = '1'; i <= '9'; i++) {
			board[index] = i;
			index++;
		}

	}

}
