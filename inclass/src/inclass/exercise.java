package inclass;

import java.util.Iterator;
import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word and I will tell you if its abcedarian: ");
		String word = input.next();
		String lword = word.toLowerCase();
		if (isAbcedarian(lword)) {
			System.out.println(word + " is abcedarian");
		} else {
			System.out.println(word + " isn't abcedarian");
		}
		if (isDubloon(word)) {
			System.out.println(word + " is a doubloon");
		}
		else
		{
			System.out.println(word + " isn't a doubloon");
		}
	}

	private static boolean isDubloon(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					count++;
				}
			}
			if (count > 2 || count < 2) {
				return false;
			}
			count = 0;
		}
		return true;
	}

	private static boolean isAbcedarian(String word) {
		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) > word.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

}
