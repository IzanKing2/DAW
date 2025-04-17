Algoritmo Ejercicio_4
	// Definición de variables
	Definir num1, num2, op Como Enteros;
	Definir otro_calculo Como Cadena;
	
	otro_calculo <- "S";
	
	Mientras otro_calculo = "S" Hacer // otro_calculo = S entonces se sigue ejecutando el bucle
		
		Escribir "Ingrese el primer número: "Sin Saltar;
		Leer num1;
		Escribir "Ingrese el segundo número: "Sin Saltar;
		Leer num2;
		Escribir "Seleccone la operación (1 = suma,2 = resta,3 = multiplicación,4 = división): "Sin Saltar;
		Leer op; // Lee la operación a realizar
		
		// Vamos a comprobar que operación quiere realizar el usuario
		Si op = 1 Entonces
			Escribir "El resultado de la suma es: ", num1 + num2;
		FinSi
		Si op = 2 Entonces
			Escribir "El resultado de la suma es: ", num1 - num2;
		FinSi
		Si op = 3 Entonces
			Escribir "El resultado de la multiplicación es: ", num1 * num2;
		FinSi
		Si op = 4 Entonces
			Si num2 = 0 Entonces
				Escribir "Error! División entre 0";
			SiNo
				Escribir "El resultado de la división es: ", num1 / num2;
			FinSi
		FinSi
		
		Escribir "¿Desea realizar otro cálculo? (S/N): "Sin Saltar;
		Leer otro_calculo; // Comprueba si quiere repetir el bucle
	FinMientras
FinAlgoritmo
