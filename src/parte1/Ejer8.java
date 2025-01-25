package parte1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		
		// Creo el scanner.
		Scanner sc = new Scanner(System.in);
		
		// Creo el HashMap para poder usarlo como base de datos de usuarios y sus contraseñas
		HashMap<String, String> acceso = new HashMap<>();
		
		// Variable string que va a contener el nombre de usuario indicado
		String usuario = "";
		
		// Variable string que va a contener la contraseña indicada
		String clave = "";
		
		// Variable entera que va a contener la opcion indicada en el menu
		int opcion;
		
		// variable que va a hacer las veces de contador para los intentos de la pass
		int cont = 0;
		
		// Indico al usuario.
		System.err.println("Página Principal de Mapher Game");
		System.out.println("Selecciona como quieres acceder (introduce 1 2 o 0)");
		
		// Do-while para realizar almenos una vez el proceso del menu y demas y repetirlo hasta qye se indique 0.
		do {
			
			// Muestro las opciones al usuario y espero respuesta por su parte
			System.out.println("1. Registrarse\n2. Iniciar Sesión\n0. Salir");
			System.out.print("Introduce Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			// Si indica 1 empiezo el proceso de registro donde le pido un usuario y una contraseña para registrarlas en el hashmap.
			if (opcion == 1) {
				do {
					System.err.println("Procedimiento de Registro...");
					System.out.print("Introduce un nombre de usuario: ");
					usuario = sc.nextLine();
					System.out.print("Ahora introduce una contraseña: ");
					clave = sc.nextLine();
					// Si el hashmap ya contiene el nombre de usuario indicado, se le indica al usuario.
					if (acceso.containsKey(usuario)) {
						System.out.println("Nombre de usuario no disponible");
					}
				// Vuelvo a pedirle los dato si de estos alguno está vacío o el usuario no esta disponible porque se encuentre en el hashmap
				} while (usuario.isEmpty() || clave.isEmpty() || acceso.containsKey(usuario));
				// Si se ha rellenado los datos correctamente se le indica y al hashmap acceso, le añado el nuevo usuario como clave y la contraseña como valor de esta.
				System.out.println("Registro Completado Exitosamente");
				acceso.put(usuario, clave);
				
			// Si lo que se ha elegido es iniciar sesión procedemos con este pidiendo un usuario y contraseña donde se revisara si corresponden con uno ya existente.
			} else if (opcion == 2) {
				// En este primer do-while compruebo el usuario indicado, donde repito la introduccion de este si o me indica el campo vacío o este no existe.
				do {
					System.err.println("Procedimiento de Inicio Sesión");
					System.out.print("Introduce tu nombre de usuario: ");
					usuario = sc.nextLine();
				} while (usuario.isEmpty() || !acceso.containsKey(usuario));
				// En este segundo do-while, compruebo la contraseña indicada donde si esta es igual a la que este asignada al usuario accederá correctamente.
				do {
					System.out.print("Ahora introduce tu contraseña: ");
					clave = sc.nextLine();
					if (acceso.get(usuario).equals(clave)) {
						System.out.println("Has accedido al area restringida");
						cont = 5;
					// Si no es la contraseña correcta, incremento cont.
					} else {
						++cont;
					}
					// Si cont es igual a 3 se le indica al usuario que no tiene acceso al area ya que no ha podido iniciar sesion correctamente.
					if (cont == 3) {
						System.out.println("Lo siento, no tiene acceso al área restringida");
					}
				// Salimos del do en el momento que cont sea == o mayor que 3 (si es == significa que ha ocupado todos los intentos y si es mayor significa que se ha forzado a salir al iniciar correctamente la sesion.)
				}while (cont < 3);
				
			// Si indica 0 pues nos despedimos del usuario ya que procederemos a finalizar el programa.
			} else {
				System.out.println("Hasta la próxima!");
			}
			
			// Reiniciamos cont para otro posible bucle
			cont = 0;
		
		// Repetiremos el bucle siempre y cuando el usuario no haya introducido 0
		}while(opcion != 0);
		
		// Cierro uso de escaner.
		sc.close();
		}

	}

