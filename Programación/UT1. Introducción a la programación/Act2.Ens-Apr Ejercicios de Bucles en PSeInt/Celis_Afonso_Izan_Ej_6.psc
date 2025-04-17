Proceso Ejercicio_6
	Definir num, i, j, cont Como Entero;
	
	Escribir "Introduzca un número:";
	Leer num;
	
	Para i <- 2 Hasta num Con Paso +1 Hacer
		cont <- 0; // Se reinicia el contador de divisores por cada i
		
		Para j <- 1 Hasta i Con Paso +1 Hacer
			Si i Mod j = 0 Entonces
				cont <- cont + 1; // Contar los divisores de i
			FinSi
		FinPara
		
		Si cont = 2 Entonces // Si solo tiene 2 divisores es primo
			Escribir i;
		FinSi
	Fin Para
FinAlgoritmo
