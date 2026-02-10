import java.util.Scanner;

public class CC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r, d, c, a;
		
		System.out.println("Enter Radius to find area, diameter, and circumference");
		r = input.nextDouble();
		System.out.println(calculateArea(r));
		System.out.println(calculateDia(r));
		System.out.println(calculateCirc(r));
		
	}
	private static double calculateArea(double radius) {
		double result = Math.PI * radius * radius;
		return result;
	}
	private static double calculateDia(double radius) {
		double result = 2 * radius;
		return result;
	}
	private static double calculateCirc(double radius) {
		double result = Math.PI * radius * 2;
		return result;
	}
}
