import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String word;
		int intNum;
		float realNum = 987654321.987654321f;
		double biggerRealNum;
		char letter;

		System.out.println("Enter multiple words");
		word = input.nextLine();
		word = word.toUpperCase();
		System.out.println(word);

		System.out.println("Enter a num");
		intNum = input.nextInt();
		System.out.println(intNum);

		System.out.println("Enter a real num");
		realNum = input.nextFloat();
		realNum = realNum + realNum;
		System.out.println(realNum);

		System.out.println("Enter a bigger real num");
		biggerRealNum = input.nextDouble();
		biggerRealNum = biggerRealNum + biggerRealNum; 
		System.out.printf("$%.2f\n", biggerRealNum);

		System.out.println("Enter a single letter");
		letter = input.next().charAt(0);
		System.out.println(letter);

	}

}
