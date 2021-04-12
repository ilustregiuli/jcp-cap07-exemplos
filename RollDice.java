package cap07_array_e_arrayList;

import java.security.SecureRandom;

public class RollDice {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom(); // classe para criar n�mero randomico
		int [] frequency = new int[7];
		
	    for(int roll = 1; roll <= 6000000; roll ++) {	// "roll" = rolar o dado 6 milh�es de vezes
	    	++ frequency[1 + randomNumbers.nextInt(6)];	// cada vez que o dado � rolado, � acrescentado +1 no �ndice que foi sorteado	
	    }
	    
	    //OBS: "randomNumber" utiliza o m�todo ".nextInt" para sortear um n�mero dentro do intervalo especificado, nesse caso, 
	    // o "6", significa que ser� do 0 ao 5, por isso a soma de +1 no �ndice para excluir o zero e incluir o 6
	    
	    System.out.printf("%s%10s%n", "Face", "Frequency");
	    
	    for(int face = 1; face < frequency.length; face++) {
	    	System.out.printf("%4d%10d%n", face, frequency[face]);
	    }
	    

	}

}
