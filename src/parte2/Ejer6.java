package parte2;
import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		
		HashMap<String, ArrayList<Integer>> libroAmarillo = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		//
		int number = 0;
		
		int opcion = 0;
		
		System.out.println("Bienvenido al Libro Amarillo");
		do {
			
			System.out.println("¿Qué deseas hacer?");
			System.out.println("1. Añadir persona.\r\n"
					+ "2. Añadir teléfono a una persona dada.\r\n"
					+ "3. Mostrar los teléfonos de una persona.\r\n"
					+ "4. Eliminar teléfono de una persona.\r\n"
					+ "5. Eliminar una persona.\r\n"
					+ "0. Salir");
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			
			case 1 -> {
				System.out.println("Añadir Persona...");
				System.out.print("Nombre: ");
				name = sc.nextLine();
				if(libroAmarillo.containsKey(name)) {
					System.out.println("Error. El nombre ya existe");
				} else {
					libroAmarillo.put(name, new ArrayList<>());
				}
			}
			
			case 2 ->{
				System.out.println("Añadir Telefono...");
				System.out.print("Indica el Nombre de la persona: ");
				name = sc.nextLine();
				if(!libroAmarillo.containsKey(name)) {
					System.out.println("Error. El nombre no existe");
				} else {
					System.out.print("Introduce el número de la persona: ");
					number = sc.nextInt();
					libroAmarillo.get(name).add(number);
				}
			}
			
			case 3 ->{
				System.out.println("Introduce la persona a la que quieras ver los telefonos asociados...");
				System.out.print("Nombre: ");
				name = sc.nextLine();
				if(!libroAmarillo.containsKey(name)) {
					System.out.println("Error. El nombre no existe");
				} else {
					System.out.println("Listado de numeros asociado a " + name + ": " + libroAmarillo.get(name));
				}
			}
			
			case 4 ->{
				System.out.println("Eliminar Telefono...");
				System.out.print("Indica el Nombre de la persona: ");
				name = sc.nextLine();
				if(!libroAmarillo.containsKey(name)) {
					System.out.println("Error. El nombre no existe");
				} else {
					System.out.print("Introduce el número de la persona que deseas eliminar: ");
					number = sc.nextInt();
					libroAmarillo.get(name).remove(number);
				}
			}
			
			case 5 ->{
				System.out.println("Eliminar Persona...");
				System.out.print("Indica el Nombre de la persona: ");
				name = sc.nextLine();
				if(!libroAmarillo.containsKey(name)) {
					System.out.println("Error. El nombre no existe");
				} else {
					libroAmarillo.remove(name);
					System.out.println("Persona Eliminada Correctamente");
				}
			}
			
			case 0 ->{
				System.out.println("Saliendo del Programa...");
			}
			}
			
		} while(opcion != 0);
		
	}

}
