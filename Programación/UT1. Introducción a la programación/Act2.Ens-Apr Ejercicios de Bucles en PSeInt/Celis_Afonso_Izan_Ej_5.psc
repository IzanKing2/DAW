Proceso Ejercicio_5
	Definir edad Como Entero;
	
	Escribir "Cual es tu edad:";
	Leer edad;
	Mientras (edad < 1) | (edad > 120) Hacer
		Escribir "Dame una edad v�lida: ";
		Leer edad
	FinMientras
	
	Si edad >= 1 & edad <= 2 Entonces
		Escribir "Beb�";
	FinSi
	Si edad >= 3 & edad <= 12 Entonces
		Escribir "Ni�o";
	FinSi
	Si edad >= 12 & edad <= 17 Entonces
		Escribir "Adolescente"
	FinSi
	Si edad >= 18 & edad <= 65 Entonces
		Escribir "Adulto";
	FinSi
	Si edad >= 66 Entonces
		Escribir "Persona mayor"
	FinSi
FinProceso
