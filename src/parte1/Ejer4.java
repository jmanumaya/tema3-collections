package parte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejer4 {

	public static void main(String[] args) {

		// Importo random.
		Random rd = new Random();

		// Creo la lista que va a almacenar los numero aleatorios
		ArrayList<Integer> numerosAleatorios = new ArrayList<>();
		
		// Variable que va a almacenar el numero aleatorio generado.
		int numAlea;
		
		// Variable que contiene el numero minimo posible
		int numMinimo =  Integer.MIN_VALUE;
		
		// Variable que hace las veces de contador
		int cont = 0;
		
		// Variable que inicializo con el numero de veces que quiero añadir un numero.
		int repite = 20;

		// Bucle para ir insertando los numeros generados si procede.
		while (cont < repite) {
			
			// Genero un numero aleatorio
			numAlea = rd.nextInt(numMinimo, 10);
			
			// Compruebo si la lista contiene el numero añadido para no volver a añadirlo
			if(!numerosAleatorios.contains(numAlea)) {
				numerosAleatorios.add(numAlea);
				// Ordeno la lista a medida que voy añadiendo numeros
				Collections.sort(numerosAleatorios);
				cont++;
			}
			
		}

		// Pinto la lista.
		System.out.println(numerosAleatorios);
	}

}
