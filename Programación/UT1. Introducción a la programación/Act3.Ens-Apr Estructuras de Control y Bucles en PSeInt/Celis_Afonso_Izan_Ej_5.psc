Algoritmo Ejercicio_5
	Definir a, b, r Como Entero;
	
	Escribir "Dame el n�mero mayor: " Sin Saltar;
	Leer a;
	Escribir "Dame el n�mero menor: " Sin Saltar;
	Leer b;
	r <- 0;

	Mientras b > 0 Hacer
		r <- a mod b;
		a <- b;
		b <- r;
	FinMientras
	Escribir a;
FinAlgoritmo
