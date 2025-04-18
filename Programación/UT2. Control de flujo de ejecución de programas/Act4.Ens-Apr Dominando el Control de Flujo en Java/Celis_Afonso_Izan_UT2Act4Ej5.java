public class Celis_Afonso_Izan_UT2Act4Ej5 {
    public static int participante() {
        return (int) (100 * Math.random() + 1);
    }

    public static int time() {
        return (int) (350 * Math.random() + 1);
    }

    public static void descalificacion(int numero, int tiempo) {
        if (tiempo < 60 || tiempo > 300) {
            System.out.println("- El número " + numero + " está descalificado con tiempo: " + tiempo + "s");
        } else {
            System.out.println("- El número " + numero + " está clasificado con tiempo: " + tiempo + "s");
        }
    }

    public static void main(String[] args) {
        try {
            int mejor_numero = 0;
            int peor_numero = 0;
            int mejor_tiempo = 350;  // Iniciamos con el tiempo máximo permitido
            int peor_tiempo = 1;     // Iniciamos con el tiempo mínimo posible

            System.out.println("___CLASIFICACIÓN___");
            for (int i = 0; i < 10; i++) {
                int numero = participante();
                int tiempo = time();
                
                descalificacion(numero, tiempo);

                // Llamamos a los métodos y actualizamos tanto el número como el tiempo
                if (tiempo < mejor_tiempo) {
                    mejor_numero = numero;
                    mejor_tiempo = tiempo;
                }
                if (tiempo > peor_tiempo) {
                    peor_numero = numero;
                    peor_tiempo = tiempo;
                }
            }
            
            System.out.println("\nEl primer puesto es para: " + mejor_numero + " con tiempo: " + mejor_tiempo + "s");
            System.out.println("El último puesto es para: " + peor_numero + " con tiempo: " + peor_tiempo + "s");

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
