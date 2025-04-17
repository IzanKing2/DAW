Algoritmo Ejercicio_1
	Definir x, n, i, suma Como Entero;
	
	Escribir "Dame un número base:";
	Leer x;
	Escribir "Dame un número límite:";
	Leer n;
	
	suma <- 0;
	
	Para i <- 1 Hasta n Hacer
		Si i mod x = 0 Entonces
			suma <- suma + i;
		FinSi
	FinPara
	Escribir "La suma de los múltiplos de ", x, " hasta ", n, " es: ", suma;
FinAlgoritmo
