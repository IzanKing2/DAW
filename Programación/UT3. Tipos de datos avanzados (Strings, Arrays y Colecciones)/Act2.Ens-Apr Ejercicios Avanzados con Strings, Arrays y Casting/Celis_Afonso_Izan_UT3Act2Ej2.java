import java.util.Arrays;
import java.util.Scanner;

public class Celis_Afonso_Izan_UT3Act2Ej2 {
    /**
     *  Método principal
     * @param args
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            String parrafo, parrafo_sin_espacios;
            String[] palabras;
            int palabras_totales;
            
            // ---------------------- Pide el parrafo
            do {
                System.out.print("Escribe un párrafo de menos de 256 caracteres: " );
                parrafo = sc.nextLine();
                parrafo_sin_espacios = parrafo.replace(" ", "");

                if (parrafo_sin_espacios.length() > 256) {
                    System.out.println("¡¡ Error !!: El párrafo debe tener menos de 256 caracteres. Inténtalo de nuevo\n");
                }

            } while (parrafo_sin_espacios.length() > 256);


            // --------------------- Crea la lista de palabras
            palabras = parrafo.toLowerCase().replace(",", "").replace(".", "").split(" ");

            // --------------------- Cantidad total de palabras
            palabras_totales = contar_palabras(palabras);
            System.out.println("\n- Número de palabras: " + palabras_totales + "\n");

            // --------------------- Las 5 palabras más usadas
            String[] palabras_repetidas = palabras_mas_usadas(palabras);
            for (int i = 0; i < palabras_repetidas.length; i++) {
                String palabra = palabras_repetidas[i].substring(1, palabras_repetidas[i].length());
                String cont = palabras_repetidas[i].substring(0, 1);
                System.out.println("- " + palabra + ": " + cont + " veces." );
            }

            // --------------------- La palabra más larga
            String palabra_mas_larga = buscar_palabra_mas_larga(palabras);
            System.out.println("\n- Palabra más larga: " + palabra_mas_larga);


            // --------------------- La palabra más corta
            String palabra_mas_corta = buscar_palabra_mas_corta(palabras);
            System.out.println("- Palabra más corta: " + palabra_mas_corta);

            sc.close();
        } catch (Exception e) {
            System.out.println("Error! Se lanzo la excepcion: " + e);
        }
    }


// ================================================= FUNCIONES
// ----------------------------- CONTAR PALABRAS

    /**
     *  Método para contar las palabras que hay
     * @param lista
     * @return total de palabras
     */
    public static int contar_palabras(String[] lista) {
        return lista.length;
    }
// ----------------------------- BUSCAR PALABRA MÁS LARGA

    /**
     *  Método para buscar la palabra más larga
     * @param lista
     * @return palabra mas larga
     */
    public static String buscar_palabra_mas_larga(String[] lista) {
        int longitud_mayor = 0;
        String palabra_mayor = "";
        for (String palabra : lista) {
            int longitud_actual = palabra.length();
            if (longitud_actual > longitud_mayor) {
                longitud_mayor = longitud_actual;
                palabra_mayor = palabra;
            }
        }
        return palabra_mayor.substring(1, palabra_mayor.length());
    }
// ----------------------------- BUSCAR PALABRA MÁS CORTA

    /**
     *  Método para buscar la palabra más corta
     * @param lista
     * @return palabra mas corta
     */
    public static String buscar_palabra_mas_corta(String[] lista) {
        int longitud_menor = 100;
        String palabra_menor = "";
        for (String palabra : lista) {
            int longitud_actual = palabra.length();
            if (longitud_actual < longitud_menor) {
                longitud_menor = longitud_actual;
                palabra_menor = palabra;
            }
        }
        return palabra_menor.substring(1, palabra_menor.length());
    }
// ----------------------------- BUSCAR 5 PALABRAS MÁS USADAS

    /**
     *  Método para contar las 5 palabras que mas se repiten
     * @param lista
     * @return lista String[]
     */
    public static String[] palabras_mas_usadas (String[] lista) {
        // Modifica el array inicial añadiendo el número de veces que se repite cada palabra ej: '[2hola, 1yo, ...]'
        for (int i = 0; i < lista.length; i++) {
            int cont = 1;
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].equals(lista[j])) {
                    cont++;
                }
            }
            lista[i] = cont + lista[i]; // Concatena el contador con la palabra
        }

        Arrays.sort(lista); // Ordena el array de menor a mayor
        String lista_mod = "";

        // Le da la vuelta al array de mayor a menor
        for (int i= lista.length - 1; i >= 0; i--) {
            lista_mod += lista[i] + " ";
        }

        String[] palabras2List = lista_mod.split(" ");
        
        String[] mas_repetidas = new String[5]; // Crea un array de 5 elementos

        // Modifica la lista de 5 elementos añadiendo los más repetidos
        for (int i = 0; i < 5; i++) {
            mas_repetidas[i] = palabras2List[i];
        }
        
        return mas_repetidas;
    }
}