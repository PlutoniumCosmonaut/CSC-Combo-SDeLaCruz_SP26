package week8;

public class BottlesofBeer {

	public static void main(String[] args) {
		bottleOfBeer(10);

	}

	private static void bottleOfBeer(int btls) {
		if (btls == 0) {
			System.out.println("No bottles of beer on the wall,\n" + "no bottles of beer,\n"
					+ "ya’ can’t take one down, ya’ can’t pass it around,\n"
					+ "’cause there are no more bottles of beer on the wall!");
		}

		else {
			System.out.println("" + btls + " bottles of beer on the wall,\n" + btls + " bottles of beer,\n"
					+ "take one down pass it around,\n" + (btls - 1) + " bottles of beer on the wall!");
			bottleOfBeer(btls - 1);
		}
	}

}
