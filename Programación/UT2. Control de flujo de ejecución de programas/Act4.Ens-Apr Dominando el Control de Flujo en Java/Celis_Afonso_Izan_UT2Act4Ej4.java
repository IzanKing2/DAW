import java.util.Scanner;


// ---- NÚMERO CAPICÚA
public class Celis_Afonso_Izan_UT2Act4Ej4 {
    public static int capicua(int num) {
        int numCopy;
        int ultimoDigito;
        int invertido = 0;
        numCopy = num;

        while (numCopy > 0) {
            ultimoDigito = numCopy % 10; // Obtenemos el último dígito
            invertido = invertido * 10 + ultimoDigito; // Vamos construyendo el número invertido
            numCopy /= 10; // Eliminamos el último dígito de numCopy
        }
        return invertido;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int num;

            do {
                System.out.print("Dame un número entero de al menos 2 dígitos y > 0: ");
                num = scanner.nextInt();
            } while (num <= 0);
            int invertido = capicua(num);
            
            if (num == invertido) {
                System.out.println("El número " + num + " es capicúa.");
                System.out.println("Númeor original: " + num);
                System.out.println("Número invertido: " + invertido);
            } else {
                System.out.println("El número " + num + " NO es capicúa.");
                System.out.println("Númeor original: " + num);
                System.out.println("Número invertido: " + invertido);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}