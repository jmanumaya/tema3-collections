package parte2;
import java.util.*;

public class Ejer8 {
	
	// Me creo el mapa tipo global
    private static Map<String, List<String>> tareasPorCategoria = new HashMap<>();
    
    // Me creo el scanner global tambien porque lo voy a usar en las diferentes funciones que he implementado.
    private static Scanner scanner = new Scanner(System.in);

    // Main
    public static void main(String[] args) {
    	// Variable que va a contener la opcion indicada por el usuario.
        int opcion;
        
        // Do-while para hacerlo hasta que el usuario indique 5 para salir.
        do {
        	// LLamo a la funcion mostrarMenu para mostrar el menu.
            mostrarMenu();
            // Obtengo la opcion dada por el usuario.
            opcion = scanner.nextInt();
            // Limpio buffer
            scanner.nextLine();

            // Switch para hacer la opcion que el usuario haya introducido.
            switch (opcion) {
            	// Caso 1, llamo a la funcion agregarTarea (el propio nombre indica que hará)
                case 1 -> agregarTarea();
                // Caso 2, llamo a la funcion eliminarTarea (el propio nombre indica que hará)
                case 2 -> eliminarTarea();
                // Caso 3, llamo a la funcion listarTareasPorCategoria (va a mostrar la lista de tareas por categorias)
                case 3 -> listarTareasPorCategoria();
                // Caso 4, llamo a la funcion listarTodasLasTareas (va a mostrar una lista con todas las tareas)
                case 4 -> listarTodasLasTareas();
                // Caso 5, Indicamos al usuario que está saliendo del gestor de tareas.
                case 5 -> System.err.println("Saliendo del gestor de tareas...");
                // Caso default por si indica una opcion no valida.
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }
    
    // funcion mostrarMenu para mostrar el menu por consola cada vez que se le llame.
    private static void mostrarMenu() {
        System.out.println("\n--- Gestor de Tareas ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Listar tareas por categoría");
        System.out.println("4. Mostrar todas las categorías y tareas");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
    
    // funcion agregarTarea (el propio nombre indica que hará)
    private static void agregarTarea() {
    	// Pido una categoria.
        System.out.print("Introduce la categoría: ");
        String categoria = scanner.nextLine().trim();

        // Pido la tarea
        System.out.print("Introduce la tarea: ");
        String tarea = scanner.nextLine().trim();

        // Si no encuentra la categoria la crea con un conjunto vacío.
        tareasPorCategoria.putIfAbsent(categoria, new ArrayList<>());
        // Añado la tarea al conjunto correspondiente a la categoria.
        tareasPorCategoria.get(categoria).add(tarea);
        // Indico que se ha añadido correctamente al usuario.
        System.out.println("✅ Tarea añadida correctamente.");
    }
    
    // funcion eliminarTarea (el propio nombre indica que hará)
    private static void eliminarTarea() {
    	// Pido una categoria al usuario.
        System.out.print("Introduce la categoría: ");
        String categoria = scanner.nextLine().trim();

        // Si la categoria no existe pues se le indica y no seguimos con el proceso.
        if (!tareasPorCategoria.containsKey(categoria)) {
            System.out.println("⚠️ No existe esa categoría.");
            return;
        }
        
        // Muestro las tareas que existen dentro de la categoría indicada para que el usuario elija que tarea eliminar.
        System.out.println("Tareas en " + categoria + ": " + tareasPorCategoria.get(categoria));
        // Recojo la respuesta del usuario sobre que tarea quiere eliminar.
        System.out.print("Introduce la tarea a eliminar: ");
        String tarea = scanner.nextLine().trim();

        // Si se puede eliminar dicha tarea la elimina y se indica al usuario
        if (tareasPorCategoria.get(categoria).remove(tarea)) {
            System.out.println("✅ Tarea eliminada correctamente.");
        // Si no se ha podido eliminar se le indica.
        } else {
            System.out.println("⚠️ No se encontró la tarea en la categoría.");
        }
    }
    
    // funcion listarTareasPorCategoria (va a mostrar la lista de tareas por categorias)
    private static void listarTareasPorCategoria() {
    	// Pido la categoria que se quiera listar sus tareas.
        System.out.print("Introduce la categoría: ");
        String categoria = scanner.nextLine().trim();

        // Si no ha tareas en dicha categoria se informa por consola al usuairo y no seguimos con el proceso.
        if (!tareasPorCategoria.containsKey(categoria)) {
            System.out.println("⚠️ No hay tareas en esta categoría.");
            return;
        }
        
        // Mostramos por consola el listado de tareas correspondientes a la categoria indicada por el usuario.
        System.out.println("📌 Tareas en " + categoria + ": " + tareasPorCategoria.get(categoria));
    }

    // funcion listarTodasLasTareas (va a mostrar una lista con todas las tareas)
    private static void listarTodasLasTareas() {
    	
    	// Compruebo al principio si no hay categorias (por ende no hay tareas) para indicarselo al usuario y no seguir con el proceso.
        if (tareasPorCategoria.isEmpty()) {
            System.out.println("📭 No hay tareas registradas.");
            return;
        }

        // Muestro con un for-each todas las categorias junto a sus tareas.
        System.out.println("\n--- Tareas por categoría ---");
        for (Map.Entry<String, List<String>> entry : tareasPorCategoria.entrySet()) {
            System.out.println("📂 " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
