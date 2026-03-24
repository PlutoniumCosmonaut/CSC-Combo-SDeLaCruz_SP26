import java.math.BigInteger;

public class Bookwork {

	public static void main(String[] args) {
		String word = "word";
		String word2 = new String("word");
		String name = null;
		// System.out.println(name.length());

		name = "alan turing";
		name = name.toUpperCase();
		System.out.println(name);

		String text = "computer science is fun";
		text = text.replace("computer science", "CS");
		System.out.println(text);

		Integer i = Integer.valueOf(5);

		System.out.println(i.equals(5));

		Integer x = Integer.valueOf(123);
		Integer y = Integer.valueOf(123);
		if (x == y)
			System.out.println("x and y are the same object");
		if (x.equals(y))
			System.out.println("x and y are the same value");

		String nums = "12345";
		nums += 6;
		System.out.println(nums);
		int num = Integer.valueOf(nums);
		num += 6;
		System.out.println(num);
		if (isCapitalized("Bob"))
			System.out.println("True");
		else
			System.out.println("False");

		String s = "12345678901234567890";
		BigInteger bigger = new BigInteger(s);

		System.out.println(bigger);

		//printRow(6);
		printTable(15);
	}

	public static void printTable(int rows) {
		for (int j = 1; j <= rows; j++)
			
		{
			printRow(j);
		}

	}

	private static void printRow(int n) {
		for (int j = 1; j <= 6; j++) {
			System.out.printf("%4d", n * j);
		}
		System.out.println();

	}

	private static boolean isCapitalized(String str) {
		if (str == null || str.isEmpty())
			return false;
		return Character.isUpperCase(str.charAt(0));
	}

}
