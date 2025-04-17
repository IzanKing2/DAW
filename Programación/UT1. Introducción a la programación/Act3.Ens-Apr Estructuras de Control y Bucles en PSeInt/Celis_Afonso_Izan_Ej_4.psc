Algoritmo Ejercicio_4
	Definir n, a, b, c, i Como Entero;
	
	Escribir "Dame un número:";
	Leer n;
	
	a <- 0;
	b <- 1;
	c <- 0;
	
	Escribir a;
	Para i <- 0 Hasta n - 2 Hacer
		c <- a + b;
		a <- b;
		b <- c;
		Escribir a;
	FinPara
FinAlgoritmo
