package parte1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer7 {

	public static void main(String[] args) {
		
		// Creo el treeMap para poder usarlo como diccionario
		TreeMap<String, String> diccionario = new TreeMap<>();
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Variable que va a llevar la elección en el menú.
		int elecMenu;
		
		// Variable que va a contener la clave dada (palabra en español).
		String palabraEspanol;
		
		// Variable que va a contener el valor dado (palabra en ingles).
		String palabraIngles;
		
		// Estado de la palabra.
		boolean estado = false;
		
		// Introduzco en el mapa las 20 primeras traducciones del espalol al ingles
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("libro", "book");
		diccionario.put("agua", "water");
		diccionario.put("sol", "sun");
		diccionario.put("luna", "moon");
		diccionario.put("manzana", "apple");
		diccionario.put("ventana", "window");
		diccionario.put("puerta", "door");
		diccionario.put("flor", "flower");
		diccionario.put("árbol", "tree");
		diccionario.put("rojo", "red");
		diccionario.put("azul", "blue");
		diccionario.put("verde", "green");
		diccionario.put("amarillo", "yellow");
		diccionario.put("rato", "mouse");
		diccionario.put("avión", "plane");
		diccionario.put("tren", "train");
		diccionario.put("barco", "ship");
		diccionario.put("computadora", "computer");
		
		// Indico al usuario y muestro el menu.
		System.out.println("Bienvenido al Diccionario. Introduce 1, 2 o 0 segun quieras hacer.");
		System.out.println("1. Insertar Palabra.\n2. Buscar Palabra.\n0. Salir.");
		System.out.print("¿Qúe quieres hacer?:");
		elecMenu = sc.nextInt();
		sc.nextLine();
		
		// While para realizar hasta que introduzca 0.
		while(elecMenu != 0) {
			
			// Si elige 1 pues procedemos a insertar valores.
			if (elecMenu == 1) {
				
				// Do para recorrer siempre y cuando el usuario introduzca alguna palabra vacía.
				do {
				// Indico al usuario que introduzca la palabra en español
				System.out.print("Introduce la palabra en Españo: ");
				palabraEspanol = sc.nextLine();
				// Indico al usuario que introduzca la palabra en ingles
				System.out.print("Introduce la correspondiente palabra en Ingles: ");
				palabraIngles = sc.nextLine();
				} while (palabraEspanol.isEmpty() && palabraIngles.isEmpty());
				
				// Introduzco la nueva clave y valor en el diccionario.
				diccionario.put(palabraEspanol, palabraIngles);
			
			// si el usuario introduce 2 procedemos con la buscqueda de la palabra.
			} else if (elecMenu == 2) {
				
				// do para controlar el estado (si se encuentra o no) y volver a pedirle una.
				do {
					System.out.println("¿Que palabra en español quieres saber en ingles?");
					palabraEspanol = sc.nextLine();
					// Compruebo si se encuentra la key en el mapa.
					estado = diccionario.containsKey(palabraEspanol);
					if (!estado) {
						System.out.println("La palabra indicada no se encuentra en el diccionario.");
					}
				} while(!estado);
				
				// Busco el valor de la clave y la asigno a la variable para mostrar la consulta en pantalla
				palabraIngles = diccionario.get(palabraEspanol);
				System.err.println("La traducción de " + palabraEspanol + " es " + palabraIngles);
			}
			
			// Vuelvo a preguntar al usuario que hacer.
			System.out.println("Bienvenido al Diccionario. Introduce 1, 2 o 0 segun quieras hacer.");
			System.out.println("1. Insertar Palabra.\n2. Buscar Palabra.\n0. Salir.");
			System.out.print("¿Qúe quieres hacer?:");
			elecMenu = sc.nextInt();
			sc.nextLine();
		}
		
		// Indico que ha salido y finalizo uso de escaner y de programa.
		System.out.println("Has salido del diccionario, gracias por usarlo!");
		sc.close();
	}
}
