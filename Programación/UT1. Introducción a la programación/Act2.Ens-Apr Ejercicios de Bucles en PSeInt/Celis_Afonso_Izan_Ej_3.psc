Proceso Ejercicio_3
	Definir password, pass Como Cadena;
	Definir intentos Como Entero;
	
	password <- "izan35";
	intentos <- 3;

	Mientras intentos > 0 Hacer
		Escribir "Contraseña: ";
		Leer pass;
		Si pass = contraseña Entonces
			Escribir "Acceso concedido";
			intentos <- 0;
		SiNo
			intentos <- intentos - 1;
			Escribir "Contraseña fallida, numero de intentos: ", intentos;
		FinSi
	FinMientras
FinProceso
