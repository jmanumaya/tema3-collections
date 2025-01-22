package parte1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		// Creo el scanner
		Scanner sc = new Scanner(System.in);
		
		// Creo un conjunto para ir guardando los nombres insertados conservando el orden de insercion y que no se repitan.
		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		
		// Creo la variable que va a contener los nombres que vaya introduciendo el usuario.
		String name;
		
		//Indico al usuario
		System.out.println("Introduce una serie de nombres hasta que pongas fin.");
		
		// Do-While para ir pidiendo nombres hasta que indique "fin"
		do {
			System.out.print("Nombre: ");
			name = sc.nextLine();
			// Compruebo que no haya introducido fin para poder añadirlo al conjunto.
			if(!name.equals("fin")) {
				// Añado el nombre introducido al conjunto.
				nombres.add(name);
			}
		} while (!name.equals("fin"));
		
		// Muestro los nombres introducidos
		System.out.println("Nombres Guardados -> " + nombres);
		// Cierro uso de escaner.
		sc.close();
	}

}
