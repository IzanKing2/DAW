# 🌟 Explorando el Control de Flujo en Java 🌟

## 🎯 Objetivo

El objetivo de esta actividad es poner en práctica todo lo aprendido durante la **UT2 - Control de flujo de ejecución de programas en Java**, integrando el uso de:

- 📊 Variables
- 🔀 Condicionales
- 🔁 Bucles
- 🚀 Sentencias de salto
- ⚠️ Excepciones
- 🛠️ Funciones

Los estudiantes deberán aplicar la lógica de programación adquirida para resolver problemas específicos.

---

## 📋 Instrucciones

Se propone realizar **tres ejercicios prácticos** que requieren el uso de:

- Estructuras de control
- Modularidad mediante funciones
- Manejo básico de excepciones

Es fundamental que utilices **todas las herramientas vistas hasta ahora**.

💡 **Nota:** En los ejercicios 2 y 3, se hará uso de la función `Math.random()` para generar números aleatorios. Esta función devuelve un número decimal aleatorio entre `0.0` y `1.0`. Para convertir este número en un valor dentro de un rango específico, se debe hacer un ajuste, como se muestra en los ejemplos:

- Para obtener un número aleatorio entre 0 y 50:  
  ```java
  int numero = (int) (Math.random() * 50);
  ```
- Para obtener un número aleatorio entre 1 y 10:  
  ```java
  int numero = (int) (Math.random() * 10) + 1;
  ```

---

## 📝 Ejercicios

### 🧮 Ejercicio 1: Sistema de gestión de notas de estudiantes

Crea un programa que solicite al usuario las calificaciones de un estudiante en tres asignaturas: **Matemáticas**, **Lengua** y **Ciencias**. Luego, el programa debe:

1. 📐 Calcular la media de las tres notas.
2. ✅ Mostrar si el estudiante ha aprobado o suspendido cada asignatura.
3. 🏆 Indicar si el estudiante ha aprobado o suspendido en general.

---

### 🎲 Ejercicio 2: Generador de números aleatorios y clasificación

Crea un programa que:

1. 🔢 Genere números aleatorios del 0 al 200.
2. 🔍 Clasifique cada número como **par** o **impar**.
3. 🔄 Permita al usuario decidir si continuar generando números o detenerse.
4. 📊 Al finalizar, muestre cuántos números fueron **pares** y cuántos fueron **impares**.

---

### 🎮 Ejercicio 3: Juego de adivinanza de números con selección de dificultad

Crea un programa que:

1. 🎯 Genere un número aleatorio entre 1 y 100.
2. ⚙️ Permita al usuario seleccionar la dificultad del juego:
   - **Fácil**: 10 intentos.
   - **Media**: 5 intentos.
   - **Difícil**: 3 intentos.
3. 🤔 Permita al usuario intentar adivinar el número generado.
4. ⏹️ Finalice cuando el usuario adivine el número o se superen los intentos disponibles.
5. ❌ Si no se adivina, muestre cuál era el número generado.

---

✨ ¡Buena suerte y diviértete programando! 🚀
