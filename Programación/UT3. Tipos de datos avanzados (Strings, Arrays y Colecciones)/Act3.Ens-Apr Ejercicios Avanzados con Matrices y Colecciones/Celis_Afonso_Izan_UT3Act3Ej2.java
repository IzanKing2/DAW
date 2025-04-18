import java.util.HashMap;
import java.util.Scanner;


public class Celis_Afonso_Izan_UT3Act3Ej2 {
    /**
     *  Método principal
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            HashMap<Integer, String> letra_dni = new HashMap<>();
            crearListaDni(letra_dni); // Crea el diccionario con las condiciones que un dni debe cumplir
            HashMap<String, String> registro = new HashMap<>(); // Inicializa el dicconario 'registro'

            String dni, name;
            int opcion;
            boolean continuar = true;
            String repetir = "";

            while (continuar) {
                menu(); // Muestra el menú de opciones
                opcion = sc.nextInt(); // Selecciona la opcion
                sc.nextLine();
                System.out.println();
                System.out.println("······································");
                System.out.println();

                switch (opcion) {
                    // ················ Añadir usuario
                    case 1:
                        do {
                            System.out.println(">>> AÑADIENDO USUARIO <<<");
                            System.out.println("Introduce el DNI"); // Pide el dni del usuario
                            System.out.print("> ");
                            dni = sc.nextLine();
                            if (!validarDni(dni, letra_dni)) {
                                System.out.println("El DNI introducido no es válido ya que no cumple con los requisitos.");
                            } else {
                                System.out.println("Introduce el nombre"); // Pide el nombre del usuario
                                System.out.print("> ");
                                name = sc.nextLine();
                                añadirUsuario(registro, dni, name); // Añade un usuario al registro
                            }
                            System.out.println("¿Quieres añadir otro usuario?(S:N)"); // Repetir?
                            System.out.print("> ");
                            repetir = sc.nextLine().toLowerCase();
                            System.out.println();
                            System.out.println("······································");
                            System.out.println();
                        } while (repetir.equals("s"));
                        break;

                    // ················ Lista todos los usuarios
                    case 2:
                        System.out.println(">>> LISTANDO USUARIOS <<<");
                        listarUsuarios(registro); // Lista todos los usuarios
                        System.out.println();
                        System.out.println("······································");
                        System.out.println();
                        break;

                    // ················ Buscar usuario por dni
                    case 3:
                        do {
                            System.out.println(">>> BUSCANDO USUARIO <<<");
                            System.out.println("Introduce el DNI del usuario a buscar"); // Pide el dni del usuario a buscar
                            System.out.print("> ");
                            dni = sc.nextLine();

                            if (buscarUsuario(registro, dni)) {
                                System.out.println("- Usuario encontrado: " + registro.get(dni)); // Usuario encontrado
                            } else {
                                System.out.println("El usuario buscado no está en el registro."); // No se encuentra el usuario buscado
                            }

                            System.out.println("¿Quieres buscar otro usuario?(S:N)"); // Repetir?
                            System.out.print("> ");
                            repetir = sc.nextLine().toLowerCase();
                            System.out.println();
                            System.out.println("······································");
                            System.out.println();
                        } while (repetir.equals("s"));
                        break;

                    // ················ Modificar usuario
                    case 4:
                        do {
                            System.out.println(">>> MODIFICANDO USUARIO <<<");
                            System.out.println("¿Que usuario quieres modificar?(dni)"); // Selecciona el usuario a modificar
                            System.out.print("> ");
                            dni = sc.nextLine();

                            if (buscarUsuario(registro, dni)) {
                                System.out.println("Introduce el nuevo nombre"); // Cambia el nombre del usuario
                                System.out.print("> ");
                                name = sc.nextLine();
                                modificarUsuario(registro, dni, name); // Modifica el usuario
                            } else {
                                System.out.println("El usuario con dni '" + dni + "' NO se ha encontrado"); // Si no está el usuario que se quiere modificar
                            }

                            System.out.println("¿Quieres modificar otro usuario?(S:N)"); // Repetir?
                            System.out.print("> ");
                            repetir = sc.nextLine().toLowerCase();
                            System.out.println();
                            System.out.println("······································");
                            System.out.println();
                        } while (repetir.equals("s"));
                        break;

                    // ················ Eliminar usuario
                    case 5:
                        do {
                            System.out.println(">>> ELIMINANDO USUARIO <<<");
                            System.out.println("¿Qué usuario quieres eliminar?(dni)"); // Elige el usuario a eliminar
                            listarUsuarios(registro); // Muestra todos los usuarios
                            System.out.println();
                            System.out.print("> ");
                            dni = sc.nextLine();

                            if (buscarUsuario(registro, dni)) { // Si el usuario está en el registro
                                eliminarUsuario(registro, dni); // Elimina el usuario
                                System.out.println("Usuario eliminado correctamente");
                            } else { // Si el usuario no se encuentra en el registro
                                System.out.println("El usuario con dni '" + dni + "' NO está en el registro.");
                            }

                            System.out.println("¿Quieres eliminar otro usuario?(S:N)"); // Repetir?
                            System.out.print("> ");
                            repetir = sc.nextLine().toLowerCase();
                            System.out.println();
                            System.out.println("······································");
                            System.out.println();
                        } while (repetir.equals("s"));
                        break;

                    // ················ Finaliza el programa
                    case 6:
                        System.out.println("Finalizando...");
                        continuar = false;
                        break;

                    // ················ Por defecto, finaliza el programa
                    default:
                        System.out.println("Finalizando...");
                        continuar = false;
                        break;
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("!! Error, ocurrio algún problema inesperado");
        }
    }


// ···································· MÉTODOS

    /**
     *  Método para mostrar el menú
     */
    public static void menu() {
        System.out.println("__MENÚ DE OPCIONES__:");
        System.out.println("1. Añadir usuario");
        System.out.println("2. Listar usuarios");
        System.out.println("3. Buscar usuario");
        System.out.println("4. Modificar usuario");
        System.out.println("5. Eliminar usuario");
        System.out.println("6. Salir del programa");
        System.out.println("\nSelecciona una opción");
        System.out.print("> ");
    }

    /**
     *  Método para crear el dicconario para verificar la letra del DNI
     * @param dni
     */
    public static void crearListaDni(HashMap<Integer, String> dni_lista) {
        int[] numeros = new int[23];
        final String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"}; // Constante de letras
        for (int i = 0; i <= 22; i++) {
            numeros[i] = i;
        }
        for (int i = 0; i < numeros.length; i++) {
            dni_lista.put(numeros[i], letras[i]);
        }
    }

    /**
     *  Método para validar el dni
     * @param dni
     * @param dni_lista
     * @return boolean
     */
    public static boolean validarDni(String dni, HashMap<Integer, String> dni_lista) {
        int result;
        if (dni.length() < 9 || dni.length() > 9) {
            return false;
        }
        if (dni.substring(0, 8).matches("[0-9]{8}") && dni.toLowerCase().substring(8, 9).matches("[a-z]")) {
            String num = dni.substring(0, 8); // Numeros del dni ej(54163650)
            String letra = dni.substring(8, 9); // Letra del dni ej(F)
            int numero = Integer.parseInt(num);

            result = numero % 23;
            String letra_correcta = dni_lista.get(result);
            if (letra.toLowerCase().equals(letra_correcta.toLowerCase())) {
                return true;
            }
        }
        
        return false;
    }

    /**
     *  Método para añadir usuario
     * @param registro
     * @param dni
     * @param name
     */
    public static void añadirUsuario(HashMap<String, String> registro, String dni, String name) {
        registro.put(dni, name);
    }

    /**
     *  Método para listar todos los usuarios
     * @param dni_lista
     */
    public static void listarUsuarios(HashMap<String, String> registro) {
        System.out.println("DNI         Nombre");
        for (String clave : registro.keySet()) {
            System.out.println(clave + "   " + registro.get(clave));
        }
    }

    /**
     *  Método para buscar el usuario
     * @param registro
     * @param dni
     * @return boolean
     */
    public static boolean buscarUsuario(HashMap<String, String> registro, String dni) {
        if (registro.get(dni) == null) {
            return false;
        }
        return true;
    }

    /**
     *  Método para modificar un usuario
     * @param registro
     * @param dni
     * @param name
     */
    public static void modificarUsuario(HashMap<String, String> registro, String dni, String name) {
        registro.put(dni, name);
        System.out.println("Usuario modificado correctamente :)");
        System.out.println("DNI         Nombre");
        System.out.println(dni + "   " + name);
    }

    /**
     *  Método para eliminar un usuario
     * @param registro
     * @param dni
     */
    public static void eliminarUsuario(HashMap<String, String> registro, String dni) {
        registro.remove(dni);
    }
}
