import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to see if it is prime");
		int num = input.nextInt();
		boolean p = isPrime(num);
		if (isPrime(num)) {
			System.out.println(num + " is prime.");
		} else {
			System.out.println(num + " is not prime.");
		}
	}

	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
