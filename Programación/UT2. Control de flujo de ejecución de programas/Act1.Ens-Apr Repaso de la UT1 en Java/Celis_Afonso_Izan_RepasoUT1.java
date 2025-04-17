import java.util.Scanner;

public class HelloWorld{

    public static void main(String []args){
   // 1. Comentarios.
        // Así son los comentarios en Java
        /* Y así */

// =============================================================================================
// =============================================================================================

   // 2. Declaración y uso de variables
        System.out.println("2. Declaracion y uso de variables");
        int edad = 20;
        String nombre = "Izan";
        System.out.println(nombre);
        System.out.println(edad);

// =============================================================================================
// =============================================================================================

   // 3. Datos primitivos
        System.out.println("\n------------------------------------------------------");
        System.out.println("3. Datos primitivos");
        // Entero <- int
        int i = 16;
        System.out.println("int: " + i);
        // Booleano <- Boolean
        Boolean mayor_de_edad = false;
        System.out.println("Booleano: " + mayor_de_edad);
        // Real <- float
        float dinero = 25;
        System.out.println("float: " + dinero);
        // Cadena <- String
        String accede = "No, no puede acceder por ser menor";
        System.out.println("String: " + accede);
        // Double <- double
        double d = 12;
        System.out.println("double: " + d);
        // Caracter <- char
        char c = 's';
        System.out.println("char: " + c);
        // long
        long l = 22L;
        System.out.println("long: " + l);
        // short
        short s = 9;
        System.out.println("short: " + s);
        // byte
        byte b = 10;
        System.out.println("byte: " + b);
        System.out.println("\n------------------------------------------------------");

// =============================================================================================
// =============================================================================================

    // 4. Operadores de asignación y aritméticos
        // asignar o igualar : =
        // suma y asigna : +=
        // resta y asigna : -=
        // multiplica y asigna : *=
        // divide y asigna : /=
        // modulo y asigna : %=
        // suma : +
        // resta : -
        // division : /
        // resto de división : %
        // multiplicación : *
        // Falso : false
        // Verdadero : true
        // incremento : ++
        // decremento : --
        
// =============================================================================================
// =============================================================================================

    // 5. Realiza operaciones aritméticas básicas
        System.out.println("5. Operaciones aritmeticas basicas");
        int num1 = 12;
        int num2 = 2;
        int suma = num1 + num2;
        System.out.println("suma: " + num1 + " + " + num2 + " = " + suma);
        int resta = num1 - num2;
        System.out.println("resta: " + num1 + " - " + num2 + " = " + resta);
        int multiplicacion = num1 * num2;
        System.out.println("multiplicacion: " + num1 + " x " + num2 + " = " + multiplicacion);
        int division = num1 / num2;
        System.out.println("division: " + num1 + " / " + num2 + " = " + division);
        int resto = num1 % num2;
        System.out.println("resto o modulo: " + num1 + " % " + num2 + " = " + resto);
        System.out.println("\n------------------------------------------------------");
        
// =============================================================================================
// =============================================================================================

    // 6. Operadores relacionales y lógicos
        // mayor que : >
        // mayor o igual que : >=
        // menor que : <
        // menor o igual que : <=
        // igual que : ==
        // distinto que : !=
        
// =============================================================================================
// =============================================================================================
    
    // 7. Estructuras condicionales
        System.out.println("7. Estructuras condicionales");
        int a = 2;
        int z = 2;
        // if (...) {}
        if (a == z) {
            System.out.println(a + " y " + z + " son iguales.");
        }
        // else if (...) {}
        else if (a > z) {
            System.out.println(a + " es mayor que " + z);
        }
        // else {}
        else {
            System.out.println(a + " y " + z + " no son iguales.");
        }
        System.out.println("\n------------------------------------------------------");
        
// =============================================================================================
// =============================================================================================
        
    // 8. Estructura de bucle
        System.out.println("8. Estructuras de bucle");
        // while (...) {}
        int bucle = 1;
        while(bucle <= 10) {
            System.out.print(bucle + " ");
            bucle += 1;
        }
        
        
        // for (...) {}
        System.out.println(" ");
        
        
        for(int y = 1; y <= 10; y++) {
            System.out.print(y + " ");
        }
        
// =============================================================================================
// =============================================================================================
        
        // 10. Lectura de datos
        System.out.println(" ");
        System.out.println("\n------------------------------------------------------");
        System.out.println("10. Lectura de datos");
        int v;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Dame un numero entero: ");
        v = input.nextInt();
        
        System.out.println("El numero introducido es: " + v);
        
        input.close();
    }
}