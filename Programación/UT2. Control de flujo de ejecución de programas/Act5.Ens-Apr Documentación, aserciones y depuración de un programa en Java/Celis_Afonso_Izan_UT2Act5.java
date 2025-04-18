/**
 * Clase que simula un sistema de intentos de login con un contador global de intentos.
 * Incluye verificación de contraseñas y restablecimiento de intentos.
 */
public class Celis_Afonso_Izan_UT2Act5 {
    /**
     * Variable global que almacena el número de intentos de login realizados.
     */
    static int intentos = 0;

    /**
     * Método principal que ejecuta la simulación de intentos de login.
     * Realiza dos intentos de login, uno fallido y otro exitoso.
     * Luego restablece el contador de intentos.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        System.out.println("Inicio de la simulación de login");

        // Intento 1: contraseña incorrecta
        boolean resultadoLogin = verificarLogin("incorrecto");
        assert resultadoLogin : "El login debería fallar con una contraseña incorrecta";

        // Intento 2: contraseña correcta
        resultadoLogin = verificarLogin("correcto");
        assert resultadoLogin : "El login debería ser exitoso con la contraseña correcta";

        // Restablecer el contador de intentos
        restablecerIntentos();

        System.out.println("Simulación terminada. Intentos después de restablecer: " + intentos);
    }

    /**
     * Método para restablecer el contador de intentos a 0.
     */
    public static void restablecerIntentos() {
        intentos = 0;
        System.out.println("Contador de intentos restablecido a: " + intentos);
    }

    /**
     * Función que simula la verificación de un intento de login.
     * Incrementa el contador de intentos en cada llamada y comprueba si la contraseña es correcta.
     *
     * @param password Contraseña proporcionada por el usuario.
     * @return true si la contraseña es "correcto", false en caso contrario.
     */
    public static boolean verificarLogin(String password) {
        intentos++;
        System.out.println("Intento número: " + intentos);

        // Comprobación de contraseña
        if ("correcto".equals(password)) {
            System.out.println("Login exitoso.");
            return true;
        } else {
            System.out.println("Contraseña incorrecta.");
            return false;
        }
    }
}