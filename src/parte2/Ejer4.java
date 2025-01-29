package parte2;

import java.util.Collections;
import java.util.*;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo la lista para almacenar los nombres
		ArrayList<String> listaNombres = new ArrayList<>();
		// Creo el scanner
		Scanner sc = new Scanner(System.in);
		// Variable que va a contener la opcion del menu
		int opcion = 0;
		// Variable que va a contener el nombre dado por el user
		String nombre = "";
		// Variable que va a contener el nombre dado por el user para eliminar.
		String elimina = "";
		
		// Do-Wile para recorrerlo hasta que se indique 5.
		do {
			// Muestro el menu y recojo la opcion
			System.out.println("¿Qué deseas hacer?");
			System.out.println("1. Añadir nuevo nombre a la lista.\r\n"
					+ "2. Elimina un nombre específico.\r\n"
					+ "3. Ordena la lista alfabéticamente.\r\n"
					+ "4. Busca si un nombre específico está en la lista.\r\n"
					+ "5. Salir.\r\n"
					+ "");
			System.out.print("Introduce: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			// Switch para realizar la opcion dada
			switch (opcion) {
			
				// En caso de elegir 1 añadimos un nombre dado si existe o no.
				case 1 -> {
					System.err.println("Añadir un Nuevo Nombre...");
					System.out.print("Introduce nuevo nombre: ");
					nombre = sc.nextLine();
					// Si el nombre existe lo indicamos.
					if(listaNombres.contains(nombre)){
						System.err.println("¡Error! Nombre Existente.");
					// Si no existe lo añadimos
					} else {
						System.out.println("Nombre Añadido Correctamente.");
						listaNombres.add(nombre);
					}
				}
				
				// En caso de elegir 2 eliminamos un nombre dado si existe.
				case 2 -> {
					System.err.println("Eliminar Nombre en Específico...");
					System.out.print("Introduce un nombre en específico para eliminar: ");
					elimina = sc.nextLine();
					// si existe lo eliminamos
					if(listaNombres.contains(elimina)){
						listaNombres.remove(elimina);
						System.out.println("Nombre Eliminado Correctamente.");
					// Si no existe se le indica al usuario.
					} else {
						System.err.println("¡Error! El Nombre Indicado No Existe.");
					}
				}
				
				// En caso de elegir la opcion 3 ordenamos la lista y se le indica al usuario.
				case 3 -> {
					Collections.sort(listaNombres);
					System.out.println("Lista Ordenada Correctamente.");
				}
				
				// En caso de elegir la opcion 4 pedimos un nombre e indicamos si existe o no
				case 4 ->{
					System.out.print("Dime el nombre a buscar: ");
					nombre = sc.nextLine();
					if (listaNombres.contains(nombre)) {
						System.out.println("El nombre " + nombre + " existe.");
					} else {
						System.err.println("El nombre " + nombre + " no existe.");
					}
				}
				
				// Si no es ninguna de las opciones anteriores se indica que vamos a salir del programa.
				default ->{
					System.out.println("Saliendo del Programa...");
				}
			}
			
		} while (opcion != 5);
		
		System.out.println("Programa cerrado correctamente.");
		// Cierro uso de escaner.
		sc.close();
	}

}
