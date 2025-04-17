Algoritmo Ejercicio_2
	Definir n, i Como Entero;
	
	Escribir "Dame un número límite:";
	Leer n;
	
	Para i <- 1 Hasta n Hacer
		Si i Mod 2 = 0 Entonces
			Escribir i, " es par";
		SiNo
			Escribir i, " es impar";
		FinSi
		Si i Mod 3 = 0 Entonces
			Escribir i, " es múltiplo de 3";
		FinSi
		Si i Mod 4 = 0 Entonces
			Escribir i, " es múltiplo de 4";
		FinSi
		Si i Mod 5 = 0 Entonces
			Escribir i, " es múltiplo de 5";
		FinSi
	FinPara
FinAlgoritmo
