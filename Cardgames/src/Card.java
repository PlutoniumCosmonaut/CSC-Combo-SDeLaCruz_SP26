/**
 * this is the card class. it creates a playing card with a suit and a rank.
 * @author syd
 * @since 4/22/26
 */
public class Card {
	private final int suit;
	private final int rank;

	private static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	/**
	 * checks to see if one cards equals another
	 * 
	 * @param that || your card
	 * @return suit and rank
	 */
	public boolean equals(Card that) {
		return this.suit == that.suit && this.rank == that.rank;
	}

	/**
	 * compares your card to your opponents 
	 * 
	 * @param that || your card
	 * @return  
	 */
	public int compareTo(Card that) {
		if (this.suit < that.suit)
			return -1;
		if (this.suit > that.suit)
			return 1;
		if (this.rank < that.rank)
			return -1;
		if (this.rank > that.rank)
			return 1;
		return 0;
	}

	/**
	 * 
	 * @return the suit of your card
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 *
	 * @returnn the rank of your card
	 */
	public int getRank() {
		return rank;
	}

	/**
	 *returns the suit and rank of a given card in a printable format
	 */
	public String toString() {
		return RANKS[this.rank] + " of " + SUITS[this.suit];
	}
}
