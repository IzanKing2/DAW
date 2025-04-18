import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Celis_Afonso_Izan_UT3Act3Ej1 {
    /**
     *  Método principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean continuar = true;
        String repetir, tarea;

        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                // Añade una tarea hasta que quieras parar
                case 1:
                    do {
                        System.out.println(">> AÑADIENDO TAREA");
                        System.out.print("Tarea a añadir: ");
                        tarea = sc.nextLine();
                        añadirTarea(hashSet, tarea);
                        System.out.print("¿Quieres añadir otra tarea?(S:N) ");
                        repetir = sc.nextLine().toLowerCase();
                    } while (repetir.equals("s"));
                    System.out.println();
                    break;
                // Muestra la lista de tareas
                case 2:
                    System.out.println("__LISTA DE TAREAS__");
                    System.out.println(hashSet);
                    System.out.println();
                    break;
                // Elimina una tarea hasta que queras parar
                case 3:
                    do {
                        System.out.println(">> ELIMINANDO TAREA");
                        System.out.print("Tarea a eliminar: ");
                        tarea = sc.nextLine();
                        eliminarTarea(hashSet, tarea);
                        System.out.print("¿Quieres eliminar otra tarea?(S:N) ");
                        repetir = sc.nextLine().toLowerCase();
                    } while (repetir.equals("s"));
                    System.out.println();
                    break;
                // Busca una tarea hasta que quieras parar
                case 4:
                    do {
                        System.out.println(">> BUSCANDO TAREA");
                        System.out.print("Tarea a buscar: ");
                        tarea = sc.nextLine().toLowerCase();
                        if (buscarTarea(hashSet, tarea)) {
                            System.out.println("- Tarea " + tarea + " encontrada");
                        } else {
                            System.out.println("- La tarea " + tarea + " NO está en la lista");
                        }
                        System.out.print("¿Quieres buscar otra tarea?(S:N) ");
                        repetir = sc.nextLine().toLowerCase();
                    } while (repetir.equals("s"));
                    System.out.println();
                    break;
                // Comprueba si las tareas están completadas o no
                case 5:
                    System.out.println(">> MARCANDO TAREAS COMPLETADAS");
                    String completada;
                    Iterator<String> iterator = hashSet.iterator(); // Creo un iterador manualmente

                    while (iterator.hasNext()) {
                        String parte = iterator.next();
                        System.out.print("- " + parte + " completada?(S:N) ");
                        completada = sc.nextLine().toLowerCase();
                        if (completada.equals("s")) {
                            iterator.remove();
                        }
                    }
                    System.out.println();
                    break;
                // Finaliza el programa
                case 6:
                    System.out.println("\nFinalizando...");
                    continuar = false;
                    break;
                // Por defecto, finaliza el programa
                default:
                    System.out.println("\nFinalizando...");
                    continuar = false;
            }
        } while (continuar);

        sc.close();
    }

    // METODOS

    /**
     *  Método para mostrar menú
     */
    public static void menu() {
        System.out.println("//__MENÚ DE OPCIONES__//:");
        System.out.println("1. Añadir tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Eliminar tarea");
        System.out.println("4. Buscar tarea");
        System.out.println("5. Marcar tarea como completada");
        System.out.println("6. Salir del programa");
        System.out.print("Selecciona una opción: ");
    }

    /**
     *  Método para añadir una tarea
     * @param agenda
     * @param tarea
     */
    public static void añadirTarea(LinkedHashSet<String> agenda, String tarea) {
        agenda.add(tarea.toLowerCase());
    }

    /**
     *  Método para eliminar una tarea
     * @param agenda
     * @param eliminar
     */
    public static void eliminarTarea(LinkedHashSet<String> agenda, String tarea) {
        agenda.remove(tarea.toLowerCase());
    }

    /**
     *  Método para buscar una tarea
     * @param agenda
     * @param palabra
     * @return true o false
     */
    public static boolean buscarTarea(LinkedHashSet<String> agenda, String palabra) {
        return agenda.contains(palabra.toLowerCase());
    }
}