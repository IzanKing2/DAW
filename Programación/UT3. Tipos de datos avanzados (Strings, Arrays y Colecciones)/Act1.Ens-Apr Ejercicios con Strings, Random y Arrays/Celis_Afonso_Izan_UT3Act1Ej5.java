import java.util.Arrays;
import java.util.Scanner;

public class Celis_Afonso_Izan_UT3Act1Ej5 {
    /**
     * Método principal
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int opcion, elementos;

            System.out.print("Elige el tipo de datos del array (1 = enteros, 2 = decimales, 3 = palabras): ");
            opcion = sc.nextInt();
            System.out.print("¿Cuántos elementos tendrá el array?: ");
            elementos = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer después de leer un entero

            switch (opcion) {
                case 1:
                    int[] listaInt = new int[elementos];
                    for (int i = 0; i < listaInt.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        listaInt[i] = sc.nextInt();
                    }
                    System.out.println("Array original: " + Arrays.toString(listaInt));
                    invertirArray(listaInt);
                    System.out.println("Array invertido: " + Arrays.toString(listaInt));
                    break;

                case 2:
                    double[] listaDouble = new double[elementos];
                    for (int i = 0; i < listaDouble.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        listaDouble[i] = sc.nextDouble();
                    }
                    System.out.println("Array original: " + Arrays.toString(listaDouble));
                    invertirArray(listaDouble);
                    System.out.println("Array invertido: " + Arrays.toString(listaDouble));
                    break;

                case 3:
                    String[] listaString = new String[elementos];
                    for (int i = 0; i < listaString.length; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        listaString[i] = sc.nextLine();
                    }
                    System.out.println("Array original: " + Arrays.toString(listaString));
                    invertirArray(listaString);
                    System.out.println("Array invertido: " + Arrays.toString(listaString));
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            sc.close();
        } catch(Exception e) {
            System.out.println("Error!!");
        }
    }

    /**
     * Métodos para invertir arrays
     * @param array
     */
    public static void invertirArray(int[] array) { // Array int
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void invertirArray(double[] array) { // Array double
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void invertirArray(String[] array) { // Array String
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}