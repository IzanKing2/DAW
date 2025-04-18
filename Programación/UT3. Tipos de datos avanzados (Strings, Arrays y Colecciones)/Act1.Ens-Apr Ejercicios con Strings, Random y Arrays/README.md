# 📝 Ejercicios con Strings, Random y Arrays

## 🎯 Objetivo

Aplicar conceptos básicos de Java, como **Strings**, **arrays**, **condicionales**, y la clase **Random**, para resolver problemas comunes y reforzar habilidades de programación.

---

## 🧩 Ejercicios

### **Ejercicio 1: Contar Vocales** 🔤

1. Solicita al usuario que ingrese una frase o palabra.
2. Crea un programa que:
   - Cuente cuántas vocales (`a, e, i, o, u`) contiene la frase, ignorando mayúsculas o minúsculas.
   - Cuente cada tipo de vocal por separado.

**Resultado esperado:**
```
Número total de vocales: 8
Número de 'a': 3
Número de 'e': 1
Número de 'i': 0
Número de 'o': 3
Número de 'u': 1
```

---

### **Ejercicio 2: Palíndromo** 🔄

1. Pide al usuario que introduzca una palabra o frase.
2. Crea un programa que verifique si la entrada es un **palíndromo** (se lee igual de izquierda a derecha que de derecha a izquierda), ignorando espacios y mayúsculas/minúsculas.

**Resultado esperado:**
```
La frase "La ruta natural" es un palíndromo.
```

---

### **Ejercicio 3: Juego de Piedra, Papel y Tijeras contra la máquina** ✊📄✂️

1. Permite al usuario elegir entre **Piedra**, **Papel** o **Tijeras**.
2. La máquina elige una opción aleatoria usando la clase `Random`.
3. Juega 5 rondas y muestra:
   - El ganador de cada ronda.
   - El ganador final (jugador o máquina) o si hay empate.
4. Al finalizar, pregunta al usuario si quiere jugar otra partida.

**Reglas de Victoria:**
- **Piedra** gana contra **Tijeras**.
- **Tijeras** gana contra **Papel**.
- **Papel** gana contra **Piedra**.
- Si ambos eligen la misma opción, es un empate.

**Resultado esperado:**
```
Ronda 1:
Elige: Piedra, Papel o Tijeras: Piedra
Máquina eligió: Tijeras
Resultado: ¡Ganaste esta ronda!
...
Tú: 2 | Máquina: 2
Es un empate después de 5 rondas.
¿Quieres jugar otra partida? (sí/no): no
```

---

### **Ejercicio 4: Bisiestos con Array** 📅

1. Solicita al usuario un año inicial.
2. Crea un programa que:
   - Calcule cuántos años bisiestos hubo en la década que comienza con el año ingresado.
   - Use un array para almacenar los años bisiestos y los muestre.

**Resultado esperado:**
```
Años bisiestos en la década de 2010:
- 2012
- 2016
Número total de años bisiestos: 2
```

---

### **Ejercicio 5: Invertir Array** 🔄📋

1. Solicita al usuario que elija un tipo de datos para el array (**enteros**, **decimales** o **palabras**).
2. Llena el array con datos proporcionados por el usuario.
3. Crea un programa que invierta el orden del array y muestre el resultado.

**Resultado esperado:**
```
Elige el tipo de datos del array (1 = enteros, 2 = decimales, 3 = palabras): 3
¿Cuántos elementos tendrá el array?: 3
Introduce los elementos:
Elemento 1: Hola
Elemento 2: Mundo
Elemento 3: Java
Array original: [Hola, Mundo, Java]
Array invertido: [Java, Mundo, Hola]
```

---

¡Diviértete programando y resolviendo estos ejercicios! 🚀✨
