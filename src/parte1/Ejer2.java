package parte1;

import java.util.ArrayList;
import java.util.Random;

public class Ejer2 {

	public static void main(String[] args) {

		// Importo random.
		Random rd = new Random();
		
		// Creo la lista que usaré para almacenar los numeros
		ArrayList<Integer> numerosAleatorios = new ArrayList<>();
		
		// Variable que va a almacenar cada numero generado aleatoriamente.
		int numAleatorio;
		
		// Variable que va a almacenar el valor de la longitud del arraylist.
		int longitudAleatoria = rd.nextInt(5, 11);
		
		// Variable que va a almacenar la suma de los numeros.
		int suma = 0;
		
		// Variable que va a almacenar la media de los numeros.
		int media = 0;
		
		// Variable que va a almacenar el numero maximo.
		int maximo = 0;
		
		// Variable que va a almacenar el numero minimo.
		int minimo = 101;
		
		// Recorro hasta la longitud generada.
		for(int i = 0; i < longitudAleatoria; i++) {
			// Asigno a la lista un numero generado aleatoriamente entre 0 y 100.
			numerosAleatorios.add(numAleatorio = rd.nextInt(0, 101));
			
			// Calculo la suma de todos los numeros generados.
			suma += numAleatorio;
			
			// Asigno si procede el valor minimo generado o el maximo
			if (numAleatorio > maximo) {
				maximo = numAleatorio;
			} else if (numAleatorio < minimo){
				minimo = numAleatorio;
			}
		}
		
		// Calculo la media de todos los numeros generados
		media = suma / longitudAleatoria;
		
		// Muestro los resultados.
		System.out.println("Valores de la lista: " + numerosAleatorios);
		
		System.out.println("Suma total de los números: " + suma + "\nMedia: " + media + "\nMinimo: " + minimo + "\nMaximo: " + maximo);
		
	}

}
