import java.util.Scanner;

public class Celis_Afonso_Izan_Act3Ejercicio3 {
    public static void main(String[] args) {
        try {
            // ------- MENÚ
            System.out.println("___MENÚ___");
            System.out.println("1. Fácil: 10 intentos");
            System.out.println("2. Media: 5 intentos");
            System.out.println("3. Difícil: 3 intentos");
            // ---------------------------------------------------

            // ------- DEFINICIONES
            Scanner scanner = new Scanner(System.in);
            int dif_select, intentos, num, num_user;
            // ---------------------------------------------------

            // ------- SELECCIÓN DE DIFICULTAD
            System.out.print("\nSeleccione la dificultad: ");
            dif_select = scanner.nextInt();
            switch (dif_select) {
                
                // Facil: 10 intentos
                case 1:
                    intentos = 10;
                    break;

                // Media: 5 intentos
                case 2:
                    intentos = 5;
                    break;

                // Dificil: 3 intentos
                case 3:
                    intentos = 3;
                    break;
                    
                // Por defecto dificultad media: 5 intentos
                default:
                    intentos = 5;
            }
            // ---------------------------------------------------
            
            // Creamos un número aleatorio del 1 al 100
            num = (int)(Math.random() * 100) + 1;

            // ------- BUCLE DE ADIVINANZA
            while (intentos > 0) {
                System.out.print("\nAdivina el número del 1 al 100: ");
                num_user = scanner.nextInt();
                
                // Si acierta
                if (num_user == num) {
                    System.out.println("\nFelicidades has acertado!!!");
                    break;

                // Si falla
                } else {
                    intentos --; // Resta el número de intentos
                    if (num_user < num) {
                        System.out.println("\nHas fallado, prueba otra vez, te quedan: " + intentos + " intentos");
                        System.out.println("**Pista!! estas por debajo");
                    } else {
                        System.out.println("\nHas fallado, prueba otra vez, te quedan: " + intentos + " intentos");
                        System.out.println("**Pista, estas por encima");
                    }
                }
            }
            // ---------------------------------------------------

            // Mensaje cuando se queda sin intentos
            if (intentos == 0) {
                System.out.println("\nHas perdido!!!! Te has quedado sin intentos");
                System.out.println("El número correcto era el: " + num);
            }
            scanner.close();
        
        // Excepción de errores
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }   
}
