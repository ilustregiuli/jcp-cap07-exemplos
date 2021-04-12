package cap07_array_e_arrayList;

public class Card {

	private final String face;
	private final String suit;
	
	public Card(String cardFace, String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}
	
	@Override
	public String toString() {
		return face + " of " + suit;
	}
	
}
