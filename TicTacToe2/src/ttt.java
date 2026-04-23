
import java.util.Scanner;
/**
 * 
 * 
 * 
 *	this is a tic tac toe game. it will need a player variable and a board
 *	the player variable will be an int that alternates between 1 and 2
 *	the board will be an array of chars
 * 	@author Sydney
 *  @since 4/22/26
 * 
 * 
 * 
 */
public class ttt {

	public static void main(String[] args) {
		int player = 2;
		char[][] board = new char[3][3];
		fillBoard(board);
		drawBoard(board);
		int count = 0;
		while (count < 9 && checkWinner(board, player) < 0) {
			player = player % 2 + 1;
			makeMove(board, player);
			drawBoard(board);

			count++;
		}
		if (checkWinner(board, player) > 0)
			System.out.println("Player " + player + " is the winner");
		else
			System.out.println("Cats game");
	}

	/**
	 * 
	 * this takes in the board and the current player and runs it through checks to see if there is a winner
	 * if there is it returns player otherwise it returns -1
	 * 
	 * @param board a 2d array of chars to represent a tic tac toe board
	 * @param player the current player
	 * @return player or -1
	 */
	private static int checkWinner(char[][] board, int player) {
		String line = "";
		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:// top horizontal
				line = String.valueOf(board[0][0]) + board[0][1] + board[0][2];
				break;
			case 1:// mid horizontal
				line = String.valueOf(board[1][0]) + board[1][1] + board[1][2];
				break;
			case 2:// bottom horizontal
				line = String.valueOf(board[2][0]) + board[2][1] + board[2][2];
				break;
			case 3:// lft vert
				line = String.valueOf(board[0][0]) + board[1][0] + board[2][0];
				break;
			case 4:// mid vert
				line = String.valueOf(board[1][0]) + board[1][1] + board[1][2];
				break;
			case 5:// right vert
				line = String.valueOf(board[2][0]) + board[2][1] + board[2][2];
				break;
			case 6:
				line = String.valueOf(board[0][0]) + board[1][1] + board[2][2];
				break;
			case 7:
				line = String.valueOf(board[2][0]) + board[1][1] + board[1][2];
				break;

			}
			if (line.equals("OOO") || line.equals("XXX"))
				return player;

		}
		return -1;
	}

	/**
	 * This method is what allows each player to place their tic on the board
	 * 
	 * @param board a 2d array of chars to represent a tic tac toe board
	 * @param player the current player
	 */
	private static void makeMove(char[][] board, int player) {
		Scanner input = new Scanner(System.in);
		int row, col, place;
		char marker = (player == 1) ? 'X' : 'O';

		while (true) {
			System.out.println("Player" + player + ", enter a position (1-9): ");

			if (input.hasNextInt()) {
				place = input.nextInt();

				if (place >= 1 && place <= 9) {
					row = (place - 1) / 3;
					col = (place - 1) % 3;

					// checks if the spot is available
					if (Character.isDigit(board[row][col])) {
						board[row][col] = marker;
						break; // move successful, exit loop
					}

					else {
						System.out.println("That spot is already taken");
					}
				}
				else {
					System.out.println("Please enter a number. ");
					input.next(); //Clear invalid input
				}
			}
		}
	}

	/**
	 * THis method draws the board that the characters will be placed on
	 * 
	 * @param board a 2d array of chars to represent a tic tac toe board
	 */
	private static void drawBoard(char[][] board) {
		int index = 0;
		for (int i = 0; i < 3; i++)// rows
		{
			for (int j = 0; j < 3; j++)// columns
			{
				System.out.print(board[i][j]);
				if (j != 2)
					System.out.print('|');
				index++;

			}
			System.out.println();
			if (i != 2)
				System.out.println("~~~~~");
		}
	}

	/**
	 * Allows the board to be filled
	 * 
	 * @param board a 2d array of chars to represent a tic tac toe board
	 */
	private static void fillBoard(char[][] board) {
		char ch = '1';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ch;
				ch++;
			}
		}

	}

}
