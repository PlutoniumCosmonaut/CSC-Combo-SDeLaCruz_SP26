import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Bookwork {

	public static void main(String[] args) {
		// ToDo make some arrays! T^T time to bakushin!
		int[] counts; // declarations
		double[] values;

		counts = new int[4];
		values = new double[4];

		for (double i : values) {
			System.out.println(i);
		}

		int[] a = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(a));
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}

		for (int i = 0; i < a.length; i++) {
			a[i] *= a[i];
		}

		for (int i : a)
			System.out.println(i);

		counts[0] = 7;
		counts[1] = counts[0] * 2;
		counts[2]++;
		counts[3] -= 60;

		for (int i : counts)
			System.out.println(i);

		System.out.println(Arrays.toString(a));
		int target = 10;
		search(a, target);
		System.out.println(search(a, target));
		System.out.println(sum(a));

		int[] arr = randomArray(100);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			if ((i + 1) % 10 == 0 && i != 0)
				System.out.println();
		}
	}

	private static int sum(int[] a) {
		int sum = 0;
		for (int i : a)
			sum += i;
		return sum;
	}

	private static int[] randomArray(int i) {
		Random rand = new Random();
		int[] arr = new int[i];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = rand.nextInt(9) + 1;
		}
		return arr;
	}

	private static boolean search(int[] a, int target) {
		for (int i : a)
			if (i == target) {
				return true;
			}
		return false;
	}

}
