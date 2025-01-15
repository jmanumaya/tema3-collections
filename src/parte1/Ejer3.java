package parte1;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Importo random.
		Random rd = new Random();
		
		// Creo la colección (de forma ordenada.)
		ArrayList<Integer> numerosAleatorios = new ArrayList<>();
		
		// Bucle para ir insertando los numeros generados.
		for (int i = 0; i < 30; i++) {
			numerosAleatorios.add(rd.nextInt(1, 11));
		}
		
		// Ordeno la lista.
		Collections.sort(numerosAleatorios);
				
		// Pinto la lista.
		System.out.println(numerosAleatorios);
	}

}
