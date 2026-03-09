import java.util.Scanner;

public class Codingexam1 {

	public static void main(String[] args) {
		System.out.println("This is my first programming test");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 3 for a drink");
		int num = input.nextInt();

		if (num == 1) {
			System.out.println("Your drink is water!");
		}
		if (num == 2) {
			System.out.println("Your drink is coke!");
		}
		if (num == 3) {
			System.out.println("Your drink is coffee!");
		}


	}
}