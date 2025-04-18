import java.util.Scanner;

// CONVERSIÓN DE TEMPERATURA
public class Celis_Afonso_Izan_UT2Act4Ej2 {
    public static void menu(){
        System.out.println("___TEMPERATURAS___:");
        System.out.println("1. Celsius: entre -30ºC y 50ºC.");
        System.out.println("2. Fahrenheit: entre -22ºF y 122ºF.");
        System.out.println("3. Kelvin: entre 243 K y 323 K.");
        System.out.println("4. Acabar programa");
        System.out.print("\nSelecciona una opción: ");
    }

    public static int generarTemp(int opcion) {
        int temp;
        double fahrenheit;
        double kelvin;
        double celsius;
        System.out.println("\n___CONVIRTIENDO___");
        switch (opcion) {
            case 1: // Celsius
                temp = (int)(50 * Math.random() + -30);
                fahrenheit = celsiusToFahrenheit(temp); // Celsius a Fahrenheit
                kelvin = celsiusToKelvin(temp); // Celsius a Kelvin
                System.out.println("Temperatura en Celsius: " + temp + "ºC");
                System.out.println("Teperatura en Fahrenheit: " + fahrenheit + "ºF");
                System.out.println("Temperatura en Kelvin: " + kelvin + " K\n");
                return temp;
                case 2: // Fahrenheit
                temp = (int)(122 * Math.random() + -22);
                celsius = fahrenheitToCelsius(temp); // Fahrenheit a Celsius
                kelvin = fahrenheitToKelvin(temp); // Fahrenheit a Kelvin
                System.out.println("Temperatura en Fahrenheit: " + temp + "ºF");
                System.out.println("Temperatura en Celsius: " + celsius + "ºC");
                System.out.println("Temperatura en Kelvin: " + kelvin + " K\n");
                return temp;
            case 3: // Kelvin
                temp = (int)(323 * Math.random() + 243);
                celsius = kelvinToCelsius(temp);
                fahrenheit = kelvinToFahrenheit(temp);
                System.out.println("Temperatura en Kelvin: " + temp + " K");
                System.out.println("Temperatura en Celsius: " + celsius + "ºC");
                System.out.println("Temperatura en Fahrenheit: " + fahrenheit + "ºF\n");
                return temp;
            case 4: // Acabar programa
                System.out.println("Finalizando...");
                opcion = 4;
                return opcion;
            default: // Celsius por defecto
                System.out.println("Valor fuera de rango! Finalizando...");
                opcion = 4;
                return opcion;
        }
    }

    public static double celsiusToFahrenheit (int temp) {
        double fahrenheit = temp * 9.0 / 5 + 32;
        return fahrenheit;
    }

    public static double celsiusToKelvin (int temp) {
        double kelvin = temp + 273.15;
        return kelvin;
    }

    public static double fahrenheitToCelsius(int temp) {
        return (temp - 32) * 5.0 / 9;
    }

    public static double fahrenheitToKelvin(int temp) {
        return (temp + 459.67) * 5.0 / 9;
    }

    public static double kelvinToCelsius(int temp) {
        return temp - 273.15;
    }

    public static double kelvinToFahrenheit(int temp) {
        return temp * 9.0 / 5 - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int opcion;
            do {
                menu();
                opcion = scanner.nextInt();
                generarTemp(opcion);
            } while (opcion > 0 && opcion < 4);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
