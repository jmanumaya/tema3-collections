package parte1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Creo el HashMap para poder usarlo como diccionario
		HashMap<String, String> acceso = new HashMap<>();
		
		String usuario = "";
		
		String clave = "";
		
		int opcion;
		
		int cont = 0;
		
		boolean exitoso = false;
		
		System.err.println("Página Principal de Mapher Game");
		System.out.println("Selecciona como quieres acceder (introduce 1 2 o 0)");
		System.out.println("1. Registrarse\n2. Iniciar Sesión\n0. Salir");
		System.out.print("Introduce Opción: ");
		opcion = sc.nextInt();
		sc.nextLine();
		
		do {
			
			System.out.println("1. Registrarse\n2. Iniciar Sesión\n0. Salir");
			System.out.print("Introduce Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			if (opcion == 1) {
				do {
				System.err.println("Procedimiento de Registro...");
				System.out.print("Introduce un nombre de usuario: ");
				usuario = sc.nextLine();
				System.out.print("Ahora introduce una contraseña: ");
				clave = sc.nextLine();
				if (acceso.containsKey(usuario)) {
					System.out.println("Nombre de usuario no disponible");
				}
				} while (usuario.isEmpty() && clave.isEmpty() || acceso.containsKey(usuario));
				System.out.println("Registro Completado Exitosamente");
				acceso.put(usuario, clave);
			} else if (opcion == 2) {
				do {
					System.err.println("Procedimiento de Inicio Sesión");
					System.out.print("Introduce tu nombre de usuario: ");
					usuario = sc.nextLine();
					System.out.print("Ahora introduce tu contraseña: ");
					clave = sc.nextLine();
					if (acceso.containsKey(usuario) && acceso.get(usuario).equals(clave)) {
						System.out.println("Has accedido correctamente");
						exitoso = true;
					} else {
						++cont;
					}
					if (cont > 3) {
						System.out.println("No has podido acceder, te quedastes sin intentos");
					}
				} while (usuario.isEmpty() && clave.isEmpty() || exitoso || cont > 3);
			} else {
				System.out.println("Hasta la próxima!");
			}
			
		}while(opcion != 0);
		
		System.out.println("Fin");
		}

	}

