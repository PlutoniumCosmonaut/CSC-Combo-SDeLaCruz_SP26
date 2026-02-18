import java.util.Iterator;
import java.util.Scanner;

/**Write a program (class name RightAngleLoop) to accept
 *a number from the user and display the pattern like a
 *right angle triangle with a number like the picture shown here.  
 *You should define and invoke a method called getUserNumber()  to get the number from the user
 */
public class rtTriangle {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		 int num = getUserNum();
		 System.out.println("Symbols to print");
		 char symb = input.next().charAt(0);
		 buildEqTriangle(num, symb);
		 buildRtTriangle(num);

	}
	private static void buildRtTriangle(int num) {
		for (int i = 0; i <= num; i++) {
			
			for(int j = 1; j <= 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	private static void buildEqTriangle(int num, char symb) {
		for(int i = 1; i <= num; i++) { //Which row
			for(int k = i; k < num; k++)//takes care of spacing
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) { //outputs the row
				System.out.print(symb + " ");
			}
			System.out.println();
		}
		
}
	private static int getUserNum() {
		System.out.println("How many floors will your triangle be?");
		int num = input.nextInt();
		return num;
	}

}
