package cap07_array_e_arrayList;

import java.security.SecureRandom;

public class DeckOfCards {
	
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public DeckOfCards() {
		String [] faces = {"Ace", "Two","Three","Four","Five","Six","Seven",
				"Eigth","Nine","Ten","Jack","Queen","King"};
		String [] suits = {"Hearts","Diamonds","Clubs","Spades"};
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for(int count = 0; count < deck.length; count++) {
			
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		//	count % 13; ---> opera��o "m�dulo" pego o resto da divis�o "count / 13", se "count = 0", � zero
		//   - todos os "counts" menores que 13 ser�o ZEROS. A partir de "14", ser� 1. Assim tem como passar pelas 52 cartas 
		//  e sempre voltar para o in�cio, pois a cada resto da divis�o com 13, passa por 13 cartas 4x para cada naipe. 
			
		//	count / 13; ---> aqui divide o "count" por 13, por�m retorna somente a parte inteira. Assim, vai retornar 13x
		//  0, 13x 1, 13x 2 ... pois a cada itera��o, qualquer divis�o ser� quebrada mas a parte inteira se mant�m a mesma de 
		// 	de 13 em 13. 
		}
	}
	
	public void shuffle() {
		currentCard = 0;
		
		for(int first = 0; first < deck.length; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
			
			//Embaralha as cartas, o "for" vai percorrer todas as 52 posi��es (0 a 51)
			// pela vari�vel "first". A vari�vel second vai receber um n�mero aleat�rio.
			// Ent�o, guardamos o valor original da posi��o de "first" em "temp", e depois,
			// trocamos esse valor por "second". Em seguida, colocamos ent�o o valor que
			// era de "first" (e que est� em temp) dentro de "second", consumando ent�o
			// a troca entre as duas posi��es.
		}
	}
	
	public Card dealCard() {
		
		if(currentCard < deck.length) {
			return deck[currentCard++];
		} else {
			return null;
		}
	}

}
