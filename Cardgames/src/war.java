
public class war {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Pile p1 = new Pile();
		p1.addDeck(deck.subdeck(0, 5));
		p1.pilePrint();
		System.out.println("***************************");
		Pile p2 = new Pile();
		p2.addDeck(deck.subdeck(31, 36));
		p2.pilePrint();
		
		while (!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.pop();
			Card c2 = p2.pop();

			int diff = c1.getRank() - c2.getRank();
			if (diff > 0) {
				p1.add(c1);
				p1.add(c2);
			} else if (diff < 0) {
				p2.add(c1);
				p2.add(c2);
			} else {

			}
		}

		if (p2.isEmpty())
			System.out.println("Player 1 is the winner");
		else
			System.out.println("Player 2 is the winner");
	}
}