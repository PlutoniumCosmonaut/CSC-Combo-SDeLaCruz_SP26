import java.util.Random;

public class Histogram {

	public static void main(String[] args) {
		int arr[] = randomArray(100, 100);
		int counts[] = new int[5];
		int a = inRange(arr, 1, 20);
		int low = 1;
		int high = 10;
		for(int i = 0; i < counts.length; i++)
		{
			counts[i] = inRange(arr, low, high);
			low += 10;
			high += 10;
		}
		printArray(counts);
		//System.out.println(a);
	}

	private static int inRange(int[] arr, int low, int high) {
		int count = 0;
		for(int i : arr)
		{
			if(i >= low && i <= high)
			{
				count++;
			}
		}
		return count;
	}

	private static int[] randomArray(int size, int range) {
		Random rand = new Random();
		int[] arr = new int[size];
		for (int j = 0; j < size; j++) {
			arr[j] = rand.nextInt(range) + 1;
		}
		return arr;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			if ((i + 1) % 10 == 0 && i != 0)
				System.out.println();
		}
	}

}
