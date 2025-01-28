package parte2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejer2 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		
		Random rd = new Random();
		
		while (numeros.size() < 10) {
			
			numeros.add(rd.nextInt(1, 21));

		}
		
		System.out.println(numeros);

	}

}
