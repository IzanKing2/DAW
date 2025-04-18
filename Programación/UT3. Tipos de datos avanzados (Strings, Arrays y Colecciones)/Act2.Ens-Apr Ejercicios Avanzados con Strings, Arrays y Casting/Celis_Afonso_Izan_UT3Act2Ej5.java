import java.util.Arrays;
import java.util.Scanner;


public class Celis_Afonso_Izan_UT3Act2Ej5 {
    /**
     *  Método principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int list_length, min_range, max_range;
        int[] lista_generada;
        double promedio;

        do {
            System.out.print("Dame un tamaño para la lista de números: ");
            list_length = sc.nextInt();
        } while (list_length < 1);

        // Generando la lista de números
        lista_generada = generadorArray(list_length);
        System.out.println(Arrays.toString(lista_generada)); // Muestra la lista generada

        // Hallando el promedio
        System.out.println("\n__SELECCIÓN DE RANGO__:");
        System.out.print("Seleccione el rango mínimo: ");
        min_range = sc.nextInt();
        System.out.print("Seleccione el rango máximo: ");
        max_range = sc.nextInt();

        promedio = hallarPromedio(lista_generada, min_range, max_range);
        System.out.println("Promedio del rango indicado: " + promedio);

        sc.close(); // Cerramos el Scanner
    }


    /**
     *  Método para generar una array con una determinada longitud
     * @param length
     * @return lista ordenada
     */
    public static int[] generadorArray (int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (100 * (Math.random()) + 1);
        }

        Arrays.sort(numbers);
        return numbers;
    }

    /**
     *  Método para hallar el promedio dentro de un rango
     * @param lista
     * @param min
     * @param max
     * @return promedio
     */
    public static double hallarPromedio (int[] lista, int min, int max) {
        int suma = 0;
        int cont = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] >= min && lista[i] <= max) {
                suma += lista[i];
                cont++;
            }
        }

        double result = suma / cont;
        return result;
    }
}
