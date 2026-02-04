import java.util.Scanner;

public class MtoKm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double miles, kM;

		System.out.println("How many miles");
		miles = input.nextDouble();

		kM = miles * 1.60934;

		System.out.printf("There are %.3f kilometers in %.3f miles", kM, miles);

	}

}
