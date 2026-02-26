package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence with no spaces and I will tell you if it is a palindrome. ");
		String words = input.next();
		
		System.out.println(isPalindrome(words));
	}

	private static boolean isPalindrome(String words) {
		words = words.toLowerCase();
		
		for(int i = 0; i < words.length()/2; i++)
		{
			if(words.charAt(i) != words.charAt(words.length()-(i + 1)))
			{
				return false;
			}
		}
		return true;
	}

}
