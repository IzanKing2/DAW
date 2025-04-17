Algoritmo Ejercicio_4
	// Definici�n de variables
	Definir num1, num2, op Como Enteros;
	Definir otro_calculo Como Cadena;
	
	otro_calculo <- "S";
	
	Mientras otro_calculo = "S" Hacer // otro_calculo = S entonces se sigue ejecutando el bucle
		
		Escribir "Ingrese el primer n�mero: "Sin Saltar;
		Leer num1;
		Escribir "Ingrese el segundo n�mero: "Sin Saltar;
		Leer num2;
		Escribir "Seleccone la operaci�n (1 = suma,2 = resta,3 = multiplicaci�n,4 = divisi�n): "Sin Saltar;
		Leer op; // Lee la operaci�n a realizar
		
		// Vamos a comprobar que operaci�n quiere realizar el usuario
		Si op = 1 Entonces
			Escribir "El resultado de la suma es: ", num1 + num2;
		FinSi
		Si op = 2 Entonces
			Escribir "El resultado de la suma es: ", num1 - num2;
		FinSi
		Si op = 3 Entonces
			Escribir "El resultado de la multiplicaci�n es: ", num1 * num2;
		FinSi
		Si op = 4 Entonces
			Si num2 = 0 Entonces
				Escribir "Error! Divisi�n entre 0";
			SiNo
				Escribir "El resultado de la divisi�n es: ", num1 / num2;
			FinSi
		FinSi
		
		Escribir "�Desea realizar otro c�lculo? (S/N): "Sin Saltar;
		Leer otro_calculo; // Comprueba si quiere repetir el bucle
	FinMientras
FinAlgoritmo
