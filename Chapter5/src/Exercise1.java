import java.util.Scanner;

/**
 * 
 * Write a Java program to get a number from the user and print whether it is positive or negative.
 *  main() should call a method named  isPositive() that will return whether the number is positive. (Call the class Exercise1)
 *
 *
 *
 * @author s02956711
 */
public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a number and i will tell you whether its positive or negative");
		int num = input.nextInt();
		
		boolean pos = isPositive(num);
		System.out.print("The number is ");
		if(pos)System.out.println("positive");
		else System.out.println("negative");
		
		

		System.out.println("Enter three numbers I will tell you the greatest one");
		num = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		System.out.println(greatestNumber(num, num2, num3));
	
		System.out.println("Enter a float");
		double real = input.nextDouble();
		System.out.println(realPositive(real));
		
		
		System.out.println("Enter a number between 1 and 7");
		int dayNum = input.nextInt();
		System.out.println(getWeekDay(dayNum));
	}
	private static String getWeekDay(int dayNum) {
		String ret = null;
		switch(dayNum)
		{
		case 1:
			ret = "Sunday";
			break;
		case 2:
			ret = "Monday";
			break;
		case 3:
			ret = "Tuesday";
			break;
		case 4:
			ret = "Wednesday";
			break;
		case 5:
			ret = "Thursday";
			break;
		case 6:
			ret = "Friday";
			break;
		case 7:
			ret = "Saturday";
			break;
		
		}
		return ret;
	}
		
	private static String realPositive(double real) {
		String ret = "";
		if(real > 0) ret += "positive, ";
		else if(real == 0) ret += "zero, ";
		else ret += "negative, ";
		
		return ret;
	}
		
	private static int greatestNumber(int num, int num2, int num3) {
	if(num > num2 && num > num3)return num;
	if(num2 > num && num2 > num3)return num2;
		return num3;
	}
	private static boolean isPositive(int num) {
		return num > 0;
	}		
	
	
}
