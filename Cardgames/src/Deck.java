import java.util.Arrays;
import java.util.Random;

public class Deck {
	//this makes the space for our deck.
	Card[] cards;
	//thi constructor creates a deck of n size
	//we use it in subdeck
	public Deck(int n) {
		this.cards = new Card[n];
	}
	//this is a values constructor that creates a standard deck of playing card objects
	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	//subdeck creates smaller decks using the original deck
	public Deck subdeck(int low, int high) {
		Deck sub = new Deck(high - low + 1); //create the space for the deck
		for(int i = 0; i < sub.cards.length; i++)//traverse through the main deck putting cards in the sub
		{
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}
	//this is a simple selection sort to sort the cards
	public void selectionSort() {
		for (int i = 0; i < this.cards.length; i++) {
			int j = indexLowest(i, this.cards.length - 1);//indexLowest is a helper method
			swap(i, j);//so is swap, it uses index locations i and j
		}
	}
	//this finds the lowest card from where we are to the end of the array
	private int indexLowest(int low, int high) {
		int lowIndex = low;
		for (int i = low + 1; i <= high; i++) {
			if (this.cards[i].compareTo(this.cards[lowIndex]) < 0) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}
	//shuffle the cards using a random index and swap
	public void shuffle() {
		for (int i = 0; i < this.cards.length; i++) {
			int j = randomInt(i, cards.length - 1);
			swap(i, j);
		}
	}
	//returns a random int between low and high inclusive
	private static int randomInt(int low, int high) {
		Random random = new Random();
		return low + random.nextInt(high - low + 1);
	}
	//swaps the cards at each of the given indexes
	private void swap(int i, int j) {
		Card temp = this.cards[i];
		this.cards[i] = this.cards[j];
		this.cards[j] = temp;
	}
	//we are looking for the target in the array of cards
	public int search(Card target) {
		int count = 0;
		for (int i = 0; i < cards.length; i++) {
			count++;
			if (cards[i].equals(target));
			{
				System.out.println(count);
				return i;
			}
		}
		return -1;
	}

	private int binSearch(Deck cards, Card target) {
		int count = 0;
		int low = 0;
		int high = cards.getCards().length - 1;
		while (low <= high) {
			count++;
			int mid = (low + high) / 2;
			System.out.println(low + ", " + high);
			int comp = this.cards[mid].compareTo(target);
			if (comp == 0) {
				System.out.println(count);
				return mid;
			} else if (comp < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
	//this is how we get cards to other classes
	public Card[] getCards() {
		return this.cards;
	}
	//prints the deck
	public void printDeck() {
		for (Card card : cards) {
			System.out.println(card);
		}

	}
	//we arent using this but its for demonstration 
	@Override
	public String toString() {
		return Arrays.toString(this.cards);
	}

}
