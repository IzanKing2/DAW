Algoritmo Ejercicio_1
	Definir numero Como Entero;
	Definir index Como Entero;
	
	Leer numero;
	index <- 0;
	Si numero < 0 Entonces
		Escribir "Error! El número debe ser positivo";
	SiNo
		Mientras index <= numero Hacer
			Escribir index;
			index <- index + 2;
		FinMientras
	FinSi
FinAlgoritmo
