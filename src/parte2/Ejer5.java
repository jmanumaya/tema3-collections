package parte2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		// Creo el hashmap que va a contener los productos.
		HashMap<String, Double> series = new HashMap<>();
		
		// Creo el scanner.
		Scanner sc = new Scanner(System.in);
		
		// Variable para almacenar la opcion dada por el usuario en el menu
		int opcion;
		
		// Variable nombre que va a almacenar el nombre indicado por el usuario para el producto.
		String nombre = "";
		
		// Variable precio que va a almacenar el precio indicado por el usuario para el producto.
		double valoracion;
		
		// Do-While para recorrer como minimo una vez hasta que se introduce 0 por parte del usuario.
		do {
			
			// Muestro el menu y espero una respuesta por parte del usuario
			System.err.println("\nMenú de Opciones:");
			System.out.println("1. Agregar Serie\n2. Buscar Serie\n3. Eliminar Serie\n0. Salir");
			System.out.print("Selecciona una Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			// Switch para realizar uno de los casos en cada iteracion segun la respuesta del usuari en el menu
			switch (opcion) {
				// Caso 1: Procedimiento de alta, se pide un nombre donde si este no existe se le pide luego un precio para posteriormente añadirlo a la lista (hashmap) de productos
	            case 1 ->{
	            	System.err.println("Agregar Serie...");
	            	System.out.print("\nIntroduce el nombre de la Serie: ");
	            	nombre = sc.nextLine();
	            	// Compruebo si el nombre indicado exite en la lista (hashmap) productos.
	            	if (series.containsKey(nombre)) {
                        System.out.println("La Serie ya existe.");
                    } else {
                    	System.out.print("Introduce la valoracion de la serie: ");
                    	valoracion = sc.nextDouble();
                    	sc.nextLine();
                    	// Añado el producto (clave = nombre y el valor = precio)
                    	series.put(nombre, valoracion);
                        System.out.println("Serie añadida correctamente.");
                    }
	            }
	            // Caso 2: Procedimiento de baja, se pide un nombre donde si este existe se elimina directamente la clave correspondiente con el nombre de la lista (hashmap) productos
	            case 2 ->{
	            	System.out.println("Introduce el nombre de la serie que deseas comprobar su valoracion.");
	            	System.out.print("Nombre: ");
	            	nombre = sc.nextLine();
	            	if (series.containsKey(nombre)) {
	            		System.out.println("La valoracion de " + nombre + " es " + series.get(nombre));
	            	} else {
	            		System.out.println("La serie no existe.");
	            	}
	            }
	            // Caso 3: Procedimiento de muestra de productos, la lista productos no esta vacia, se recorre con un for-each mostrando la clave (nombre) con su correspondiente valor (precio).
	            case 3 -> {
	            	System.out.println("Procedimiento de Eliminar Serie");
	            	System.out.print("\nIntroduce el nombre de la serie: ");
	            	nombre = sc.nextLine();
	            	if (series.containsKey(nombre)) {
	            		// Elimino la clave (= nombre) de la lista (hashmap) productos
	            		series.remove(nombre);
                        System.out.println("Serie eliminado correctamente.");
                    } else {
                    	System.out.println("La Serie no existe.");
                    }
	            }
	            	
	
	            // Caso 0: Me despido del usuario ya que ha decidido salir al introducir 0.
	            case 4 ->{
	                System.err.println("\nSaliendo de la aplicación. ¡Hasta luego!");
	            }
	
	            // Default para por si introduce una opción no valida e informarle al usuario de ello.
	            default ->{
	                System.err.println("Opción no válida. Por favor, selecciona una opción del menú.");
	            }
			}
		// condicion del do - while global
		} while (opcion != 4);
		
		// Cierro uso de escaner.
		sc.close();
	}

}
