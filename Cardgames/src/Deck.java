import java.util.Arrays;
import java.util.Random;

public class Deck {
	// this makes the space for our deck.
	Card[] cards;

	// thi constructor creates a deck of n size
	// we use it in subdeck
	public Deck(int n) {
		this.cards = new Card[n];
	}

	// this is a values constructor that creates a standard deck of playing card
	// objects
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

	// subdeck creates smaller decks using the original deck
	public Deck subdeck(int low, int high) {
		Deck sub = new Deck(high - low + 1); // create the space for the deck
		for (int i = 0; i < sub.cards.length; i++)// traverse through the main deck putting cards in the sub
		{
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}

	// this is a simple selection sort to sort the cards
	public void selectionSort() {
		for (int i = 0; i < this.cards.length; i++) {
			int j = indexLowest(i, this.cards.length - 1);// indexLowest is a helper method
			swap(i, j);// so is swap, it uses index locations i and j
		}
	}

	private static Deck merge(Deck d1, Deck d2) {
		// create a new deck, c3, big enough for all the cards
		Card[] c1 = d1.getCards();
		Card[] c2 = d2.getCards();
		Card[] c3 = new Card[c1.length + c2.length];

		// use the index i to keep track of where we are at in
		// the first deck, and the index j for the second deck
		int i = 0; // c1 iterator
		int j = 0; // c2 iterator

		if (c1.length == 0)
			c3 = c2;
		else if (c2.length == 0)
			c3 = c1;
		else {
			// the index k traverses the result deck
			// if d2 is empty, use top card from d1
			// otherwise, compare the top two cards
			// add lowest card to the new deck at k
			// increment i or j (depending on card)
			for (int k = 0; k < c3.length; k++) {
				// if d1 is empty, use top card from d2
				if (j >= c2.length || i < c1.length && c1[i].compareTo(c2[j]) <= 0) {
					c3[k] = c1[i];
					i++;
				} else {
					c3[k] = c2[j];
					j++;
				}

			}

		}

		Deck deck = new Deck(c1.length + c2.length);
		deck.cards = c3;
		return deck;
		// return the new deck
	}

	public Deck almostMergeSort() {
		// divide the deck into two subdecks
		int mid = cards.length / 2;
		Deck d1 = new Deck(mid);
		Deck d2 = new Deck(cards.length - mid);

		// sort the subdecks using selectionSort
		for (int i = 0; i < mid; i++) {
			d1.cards[i] = cards[i];
		}
		for (int i = mid; i < cards.length; i++) {
			d2.cards[i - mid] = cards[i];
		}
		// merge the subdecks, return the result
		d1.selectionSort();
		d2.selectionSort();

		return merge(d1, d2);
	}

	public Deck mergeSort() {
		int len = cards.length;
		// if the deck has 0 or 1 cards, return it
		if (len <= 1)
			return this;
		// otherwise, divide the deck into two subdecks
		else {
			int mid = cards.length / 2;
			// sort the subdecks using mergeSort
			Deck d1 = subdeck(0, mid - 1).mergeSort();
			Deck d2 = subdeck(mid, len - 1).mergeSort();
			// merge the subdecks
			// return the result
			return merge(d1, d2);
		}

	}

	// this finds the lowest card from where we are to the end of the array
	private int indexLowest(int low, int high) {
		int lowIndex = low;
		for (int i = low + 1; i <= high; i++) {
			if (this.cards[i].compareTo(this.cards[lowIndex]) < 0) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	// shuffle the cards using a random index and swap
	public void shuffle() {
		for (int i = 0; i < this.cards.length; i++) {
			int j = randomInt(i, cards.length - 1);
			swap(i, j);
		}
	}

	// returns a random int between low and high inclusive
	private static int randomInt(int low, int high) {
		Random random = new Random();
		return low + random.nextInt(high - low + 1);
	}

	// swaps the cards at each of the given indexes
	private void swap(int i, int j) {
		Card temp = this.cards[i];
		this.cards[i] = this.cards[j];
		this.cards[j] = temp;
	}

	// we are looking for the target in the array of cards
	public int search(Card target) {
		int count = 0;
		for (int i = 0; i < cards.length; i++) {
			count++;
			if (cards[i].equals(target))
				;
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

	// this is how we get cards to other classes
	public Card[] getCards() {
		return this.cards;
	}

	// prints the deck
	public void printDeck() {
		for (Card card : cards) {
			System.out.println(card);
		}

	}

	// we arent using this but its for demonstration
	@Override
	public String toString() {
		return Arrays.toString(this.cards);
	}

}
