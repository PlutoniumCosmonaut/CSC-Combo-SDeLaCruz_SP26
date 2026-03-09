import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number grade");
		int num = input.nextInt();
		String grade = "";
		if (num >= 92)
			grade = "A";
		else if (num >= 89)
			grade = "A-";
		else if (num >= 87)
			grade = "B+";
		else if (num >= 82)
			grade = "B";
		else if (num >= 79)
			grade = "B-";
		else if (num >= 77)
			grade = "C+";
		else if (num >= 72)
			grade = "C-";
		else if (num >= 69)
			grade = "C-";
		else if (num >= 67)
			grade = "D+";
		else if (num >= 60)
			grade = "D";
		else if (num >= 0)
			grade = "F";

		System.out.println("Your letter grade is " + grade);
	}

}
