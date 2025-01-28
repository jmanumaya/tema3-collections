package parte2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer3 {
	
	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Creo el mapa
		HashMap<Character, Integer> mapaCaracteres = new HashMap<>();
		
		// Pido el texto al usuario
		System.out.print("Introduce la frase: ");
		String texto = sc.nextLine().toLowerCase();
		
		// Variable que va a contener cada letra del texto
		char letra;
		
		// Variable que va a funcionar como contador
		int cont = 0;
		
		// For para iterar cada letra del texto
		for (int i = 0; i < texto.length(); i++) {
			
			// Inicializo letra en cada letra que se recorre.
			letra = texto.charAt(i);
			// Si el caracter es letra miro a ver si se encuentra en el mapa si no la introduzco
			if (Character.isLetter(letra)) {
				if (mapaCaracteres.containsKey(letra)) {
					// Recojo el valor de cont de la letra y lo incremento para vilver a introducirlo
					cont = mapaCaracteres.get(letra);
					++cont;
					mapaCaracteres.put(letra, cont);
				} else {
					++cont;
					mapaCaracteres.put(letra, cont);
				}
			}
			// Reseteo contador
			cont = 0;
		}
		
		// Imprimo el mapa
		System.out.println(mapaCaracteres);
	}
}
