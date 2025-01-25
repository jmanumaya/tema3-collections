package parte1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		
		// Creo el hashmap que va a contener los productos.
		HashMap<String, Double> productos = new HashMap<>();
		
		// Creo el scanner.
		Scanner sc = new Scanner(System.in);
		
		// Variable para almacenar la opcion dada por el usuario en el menu
		int opcion;
		
		// Variable nombre que va a almacenar el nombre indicado por el usuario para el producto.
		String nombre = "";
		
		// Variable precio que va a almacenar el precio indicado por el usuario para el producto.
		double precio;
		
		// Do-While para recorrer como minimo una vez hasta que se introduce 0 por parte del usuario.
		do {
			
			// Muestro el menu y espero una respuesta por parte del usuario
			System.err.println("\nMenú de Opciones:");
			System.out.println("1. Alta de Producto\n2. Baja de Producto\n3. Lista de existencias\n0. Salir");
			System.out.print("Selecciona una Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			// Switch para realizar uno de los casos en cada iteracion segun la respuesta del usuari en el menu
			switch (opcion) {
				// Caso 1: Procedimiento de alta, se pide un nombre donde si este no existe se le pide luego un precio para posteriormente añadirlo a la lista (hashmap) de productos
	            case 1:
	            	System.err.println("Procedimiento de Alta...");
	            	System.out.print("\nIntroduce el nombre del Producto: ");
	            	nombre = sc.nextLine();
	            	// Compruebo si el nombre indicado exite en la lista (hashmap) productos.
	            	if (productos.containsKey(nombre)) {
                        System.out.println("El producto ya existe.");
                    } else {
                    	System.out.print("Introduce el Precio del Producto: ");
                    	precio = sc.nextDouble();
                    	sc.nextLine();
                    	// Añado el producto (clave = nombre y el valor = precio)
                    	productos.put(nombre, precio);
                        System.out.println("Producto añadido correctamente.");
                    }
	                break;
	            // Caso 2: Procedimiento de baja, se pide un nombre donde si este existe se elimina directamente la clave correspondiente con el nombre de la lista (hashmap) productos
	            case 2:
	            	System.out.println("Procedimiento de Baja...");
	            	System.out.print("\nIntroduce el nombre del Producto: ");
	            	nombre = sc.nextLine();
	            	if (productos.containsKey(nombre)) {
	            		// Elimino la clave (= nombre) de la lista (hashmap) productos
	            		productos.remove(nombre);
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                    	System.out.println("El producto no existe.");
                    }
	                break;
	            // Caso 3: Procedimiento de muestra de productos, la lista productos no esta vacia, se recorre con un for-each mostrando la clave (nombre) con su correspondiente valor (precio).
	            case 3:
	            	if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println("\nLista de productos:\n");
                        // A nombreProducto le asigno en cada iteración la correspondiente clave del hashmap (productos)
                        for (String nombreProducto : productos.keySet()) {
                        	// Imprimo dicha clave y su correspondiente valor opteniendolo con .get
                            System.out.println(nombreProducto + ": " + productos.get(nombreProducto) + " €");
                        }
                    }
	                break;
	
	            // Caso 0: Me despido del usuario ya que ha decidido salir al introducir 0.
	            case 0:
	                System.err.println("\nSaliendo de la aplicación. ¡Hasta luego!");
	                break;
	
	            // Default para por si introduce una opción no valida e informarle al usuario de ello.
	            default:
	                System.err.println("Opción no válida. Por favor, selecciona una opción del menú.");
			}
		// condicion del do - while global
		} while (opcion != 0);
		
		// Cierro uso de escaner.
		sc.close();
	}

}
