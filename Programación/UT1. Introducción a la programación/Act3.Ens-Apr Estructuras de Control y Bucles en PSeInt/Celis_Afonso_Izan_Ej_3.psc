Algoritmo Ejercicio_3
	Definir n, i, cont Como Entero;
	
	Escribir "Dame un n�mero:";
	Leer n;
	
	cont <- 0;
	
	Para i <- 1 Hasta n Hacer
		Si n Mod i = 0 Entonces
			Escribir i, " es divisor de ", n;
			cont <- cont + 1;
		FinSi
	FinPara

	Escribir "El n�mero ", n, " tiene ", cont, " divisores.";
FinAlgoritmo
