//this is a tic tac toe game. it will need a player variable and a board
//the player variable will be an int that alternates between 1 and 2
//the board will be an array of chars

import java.util.Scanner;

public class ticTacToe {

	public static void main(String[] args) {
		int player = 1;
		char[] board = new char[9];
		fillBoard(board);
		drawBoard(board);
		int count = 0;
		while (count < 9) {
			makeBoard(board, player);
			drawBoard(board);
			player = player % 2 + 1;
			count++;
		}
	}

	private static void makeBoard(char[] board, int player) {
		Scanner input = new Scanner(System.in);
		char marker = 'X';
		if (player == 2)
			marker = 'O';
		int place = -1;
		while (place < 1 || place > 9) {
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
