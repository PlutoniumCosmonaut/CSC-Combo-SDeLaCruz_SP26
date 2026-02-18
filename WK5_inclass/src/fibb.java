import java.util.Scanner;

public class fibb {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which level of fibonacci do you want to go to?");
		int i = 0;
		int num1 = 0;
		int num2 = 1;
		int count = input.nextInt();
		if(count == 1) System.out.println(num1);
		if(count == 2) System.out.println(num1 + "\n" + num2);
		System.out.println(num1 + "\n" + num2);
		for(i = 2; i < count; i++)
		{
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
		num1 = 0;
		num2 = 1;
		System.out.println(num1 +"\n" + num2);
		i = 2; //initializer 
		while(i < count) //Condition
		{
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			i++;
			//Changer
		}
		
	}

}
