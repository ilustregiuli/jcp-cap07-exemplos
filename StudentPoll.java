package cap07_array_e_arrayList;

public class StudentPoll {

	/*
	 * O programa � uma simula��o de pesquisa, em que ser� 
	 * dado aos entrevistados 5 op��es (n�meros de 1 a 5).
	 * O array "responses" tem os elementos de cada resposta individual;
	 * O array "frequency" vai acrescentar +1 na em cada posi��o, sempre que um elemento de
	 * "responses" aparecer no "for(....)"; Com isso, saberemos quantos elementos de cada "responses"
	 * tem dentro do array "frequency".
	 */
	
	public static void main(String[] args) {
		
		int [] frequency = new int[6];
		int [] responses = {1,2,5,4,3,5,2,1,30,3,1,4,3,3,3,2,3,3,2,1};
		
		for (int answer = 0; answer < responses.length; answer++) {
			
			try {
				++frequency[responses[answer]]; // referencia o elemento do array "frequency", na posi��o que � indicada pelo
												//conte�do do array "responses" na posi��o indicada pela resposta (answer),
												// ent�o, acrescenta +1 (++frequency)
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.printf("  responses[%d] = %d%n%n",answer,responses[answer]);
				break;
			}
		}
		
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		
		for(int rating = 1; rating < frequency.length; rating++) {
			System.out.printf("%6d%10d%n", rating, frequency[rating]);
		}

	}

}
