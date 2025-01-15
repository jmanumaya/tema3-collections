package parte1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Lista donde recogeré los numeros enteros positivos
		ArrayList<Integer> numerosEnteros = new ArrayList<>();
		// Creo el scanner.
		Scanner sc = new Scanner(System.in);
		// Variable donde almacenaré cada numero introducido.
		int num;
		
		// Booleano para salir del bucle.
		boolean salir = false;
		
		// Pido al usuario que me de los numeros hasta que introduzca uno negativo
		do {
			
			System.out.println("Dime un numero positivo que añadir a la lista (introduce negativo para salir)");
			System.out.print("Numero: ");
			num = sc.nextInt();
			
			// Compruebo si es positivo para añadirlo o negativo para salir del bucle.
			if (num >= 0) {
				numerosEnteros.add(num);
			} else {
				salir = true;
			}
			
		} while (!salir);
		
		// Muestro los numeros almacenados en la lista gracias a un for-each
		System.err.println("Numeros añadidos a la lista: ");
		
		for(int numbers : numerosEnteros) {
			System.out.print(numbers + " "); 
		}
		// Cierro uso de escaner.
		sc.close();
		
	}

}
