package cap07_array_e_arrayList;

import java.security.SecureRandom;

public class RollDice {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom(); // classe para criar número randomico
		int [] frequency = new int[7];
		
	    for(int roll = 1; roll <= 6000000; roll ++) {	// "roll" = rolar o dado 6 milhôes de vezes
	    	++ frequency[1 + randomNumbers.nextInt(6)];	// cada vez que o dado é rolado, é acrescentado +1 no índice que foi sorteado	
	    }
	    
	    //OBS: "randomNumber" utiliza o método ".nextInt" para sortear um número dentro do intervalo especificado, nesse caso, 
	    // o "6", significa que será do 0 ao 5, por isso a soma de +1 no índice para excluir o zero e incluir o 6
	    
	    System.out.printf("%s%10s%n", "Face", "Frequency");
	    
	    for(int face = 1; face < frequency.length; face++) {
	    	System.out.printf("%4d%10d%n", face, frequency[face]);
	    }
	    

	}

}
