//write a recursive method named oddsum that takes a positive odd integer n and returns the sum of odd integers from 1 to n. 
//start with a base case, and use temporary variables to debug your solution. you might find it helpful to print the value of n each time oddsum is invoked
package week8;

public class OddSum {

	public static void main(String[] args) {
		int sumOdds = oddSum(99);
		System.out.println(sumOdds);
	}

	private static int oddSum(int i) {
		if (i < 1)
			return 0;
		System.out.println(i);
		return oddSum(i - 2) + i;
	}

}
