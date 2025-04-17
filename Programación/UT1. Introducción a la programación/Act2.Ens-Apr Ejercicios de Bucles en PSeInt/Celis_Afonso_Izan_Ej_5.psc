Proceso Ejercicio_5
	Definir edad Como Entero;
	
	Escribir "Cual es tu edad:";
	Leer edad;
	Mientras (edad < 1) | (edad > 120) Hacer
		Escribir "Dame una edad válida: ";
		Leer edad
	FinMientras
	
	Si edad >= 1 & edad <= 2 Entonces
		Escribir "Bebé";
	FinSi
	Si edad >= 3 & edad <= 12 Entonces
		Escribir "Niño";
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
