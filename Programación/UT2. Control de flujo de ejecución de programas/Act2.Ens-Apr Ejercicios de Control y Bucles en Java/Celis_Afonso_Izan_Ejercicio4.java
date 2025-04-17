import java.util.Scanner;

public class Celis_Afonso_Izan_Ejercicio4 {

    // ------- MENÚ
    public static void menu() {
        System.out.println("//// MENÚ DE OPCIONES ////");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División\n");
    }
    // ---------------------------------------------------

    // ------- OPERACIONES
    // Suma
    public static String sumar(int n1, int n2) {
        return n1 + " + " + n2 + " = " + (n1 + n2);
    }

    // Resta
    public static String restar(int n1, int n2) {
        return n1 + " - " + n2 + " = " + (n1 - n2);
    }

    // Multiplicación
    public static String multiplicacion(int n1, int n2) {
        return n1 + " x " + n2 + " = " + (n1 * n2);
    }

    // Division
    public static String division(int n1, int n2) {
        if (n2 == 0) {
            return "Error: División por cero no permitida.";
        } else {
            double resultado = (double) n1 / n2;
            return n1 + " / " + n2 + " = " + resultado;
        }
    }

    // ---------------------------------------------------

    // ------- OPERACIÓN
    public static String operacion(int op, int n1, int n2) {
        switch (op) {
            case 1:
                return sumar(n1, n2);
            case 2:
                return restar(n1, n2);
            case 3:
                return multiplicacion(n1, n2);
            case 4:
                return division(n1, n2);
            default:
                return "Operación incorrecta";
        }
    }

    // ---------------------------------------------------

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op, num1, num2, operar;

        System.out.print("¿Quieres hacer una operación (1: Sí, 0: No)? ");
        operar = scanner.nextInt();

        while (operar == 1) {
            menu();

            System.out.print("¿Qué operación quieres realizar (1, 2, 3, 4)? ");
            op = scanner.nextInt();

            if (op < 1 || op > 4) {
                System.out.println("Opción incorrecta. Por favor, selecciona un número del 1 al 4.");
                continue;
            }

            System.out.print("Dame un número entero: ");
            num1 = scanner.nextInt();
            System.out.print("Dame otro número entero: ");
            num2 = scanner.nextInt();
            System.out.println(operacion(op, num1, num2));

            System.out.print("\n¿Quieres hacer otra operación? (1: Sí, 0: No) ");
            operar = scanner.nextInt();
        }

        System.out.println("Finalizando...");
        scanner.close();
    }
}
