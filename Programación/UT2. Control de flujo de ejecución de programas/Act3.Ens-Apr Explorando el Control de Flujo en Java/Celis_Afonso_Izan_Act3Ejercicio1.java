import java.util.Scanner;

public class Celis_Afonso_Izan_Act3Ejercicio1 {
    public static String nota_media(double math_mark, double lang_mark, double sc_mark) {
        double total_mark = math_mark + lang_mark + sc_mark;
        double final_mark = total_mark / 3;
        if (final_mark < 5) {
            return String.format("%.2f Suspendido", final_mark);
        } else {
            return String.format("%.2f Aprobado", final_mark);
        }
    }

    public static void main(String[]args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double math_mark, lang_mark, sc_mark;

            do {
                System.out.println("___NOTAS___");
                System.out.print("Nota de Matemáticas: ");
                math_mark = scanner.nextDouble();
                System.out.print("Nota de Lengua: ");
                lang_mark = scanner.nextDouble();
                System.out.print("Nota de Ciencias: ");
                sc_mark = scanner.nextDouble();
            } while (((0 > math_mark) | (math_mark > 10)) | ((0 > lang_mark) | (lang_mark > 10)) | ((0 > sc_mark) | (sc_mark > 10)));

            System.out.println(String.format("La nota final es: " + nota_media(math_mark, lang_mark, sc_mark)));
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error! Debes introducir un número");
        }
    }
}