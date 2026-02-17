import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num1 = 0;
		int num2 = 1;
		int i = 0;
		int sum = 0;
		while(i < 10)
		{
			sum += i; 
			i++;
		}
		System.out.println("The Sum is " + sum);
		sum = 0;
		for(i = 0; i < 10; i++)
		{
			sum += i;
		}
		System.out.println("The Sum is " + sum);
		
		System.out.println("Which level of fibonacci do you want to go to?");
		int count = input.nextInt();
		if(count == 1) System.out.println(num1);
		if(count == 2) System.out.println(num1 + "\n" + num2);
		System.out.println(num1 + "\n" + num2);
		for(i = 2; i < count; i++) {
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
