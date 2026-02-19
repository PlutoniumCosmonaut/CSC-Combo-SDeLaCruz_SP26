import java.util.Scanner;

public class Bottles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many bottles?");
		int numBtls = input.nextInt();
		for(int i = numBtls; i >= 0; i--)
		{
		btlsOfBeer(i, numBtls);
		}
	}

	private static void btlsOfBeer(int i, int numBtls) {
		if(i == 2){
			System.out.println(i + " bottles of beer on the wall, "
					+ i + " bottles of beers, take one down pass it around " 
					+(i-1) + " bottle of beer on the wall.");
		}
		else if(i == 1){
			System.out.println(i + " bottle of beer on the wall, "
					+ i + " bottle of beer, take one down pass it around " 
					+(i-1) + " bottles of beer on the wall.");
		}
		else if(i == 0){
			System.out.println(i + " bottles of beer on the wall, "
					+ i + " bottles of beer, go to the store and buy some more " 
					+(numBtls) + " bottles of beer on the wall.");
		}
		else{
			System.out.println(i + " bottles of beer on the wall, "
					+ i + " bottles of beers, take one down pass it around " 
					+(i-1) + " bottles of beer on the wall.");
		}
		
		
	}

}
