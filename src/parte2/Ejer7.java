package parte2;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		// Lista de palabras a clasificar (Combierto un array en lista) (Creo esta lista de palabras para la prueba del ejercicio.)
		List<String> palabras = Arrays.asList("sol", "luz", "cielo", "rojo", "amarillo", "verde", "luz", "sol");

		// Mapa para clasificar por longitud
		Map<Integer, Set<String>> mapaPalabras = new HashMap<>();

		// Clasificar palabras
		for (String palabra : palabras) {
			int longitud = palabra.length();
			// Si la clave no existe en el mapa, la crea con un conjunto bacío
			mapaPalabras.putIfAbsent(longitud, new HashSet<>());
			// Primero obtengo el conjunto de palabras con dicha longitud y luego se añade la palabra al conjunto
			mapaPalabras.get(longitud).add(palabra);
		}

		// Imprimir resultado
		
		// mapaPalabras.entrySet = Devuelve un conjunto de pares.
		// entry.getKey = Obtengo la clave.
		// entry.getValue = Obtegno el cojunto de palabras
		for (Map.Entry<Integer, Set<String>> entry : mapaPalabras.entrySet()) {
			System.out.println("Longitud " + entry.getKey() + ": " + entry.getValue());
		}
	}
}