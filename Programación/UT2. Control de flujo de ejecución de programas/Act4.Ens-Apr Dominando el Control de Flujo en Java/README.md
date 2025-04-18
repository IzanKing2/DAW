# 🚀 Dominando el Control de Flujo en Java

## 🎯 Objetivo

Aplicar los conceptos de **control de flujo**, **bucles**, **excepciones**, **métodos modulares** y **generación de valores aleatorios** vistos en la UT2.  
A través de estos ejercicios, los alumnos desarrollarán su capacidad para escribir código **robusto** y **modular** que manipule números, realice conversiones y resuelva problemas lógicos.

---

## 📋 Instrucciones

1. 🧐 **Lee atentamente** cada uno de los ejercicios.
2. ✍️ **Implementa** cada uno utilizando las estructuras de control, bucles y métodos modulares (organiza el código en funciones).
3. 🎲 **Utiliza `Math.random()`** para generar valores aleatorios en los ejercicios que lo requieran, respetando los rangos indicados.
4. ⚠️ **Maneja las excepciones** en los ejercicios donde sea necesario.
5. 🚫 **No utilices arrays ni manipulación avanzada de strings** para estos ejercicios.
6. ✅ **Verifica los resultados**, especialmente en los casos donde hay generación de valores aleatorios.
7. 🛠️ **Organiza el código** de manera modular, en funciones y métodos según lo visto en la unidad.

---

## 📝 Ejercicios

### 1️⃣ Números perfectos
Escribe un programa que solicite al usuario un número e imprima si ese número es un **número perfecto**.  
Un número perfecto es aquel que es igual a la suma de sus divisores propios.  
**Ejemplo:** 6 es un número perfecto porque 1 + 2 + 3 = 6.  

---

### 2️⃣ Conversión de temperatura con bucles y excepciones
Crea un programa que permita al usuario elegir entre **Celsius**, **Fahrenheit**, o **Kelvin**, y luego genere un valor aleatorio en la escala seleccionada:

- 🌡️ **Celsius:** entre -30°C y 50°C.
- 🌡️ **Fahrenheit:** entre -22°F y 122°F.
- 🌡️ **Kelvin:** entre 243 K y 323 K.

Después, convierte ese valor generado a las otras escalas.  
🔄 Usa bucles para permitir múltiples conversiones y ⚠️ maneja errores como entradas inválidas.

---

### 3️⃣ Simulador de cajero automático
Crea un simulador de **cajero automático**. Al iniciar el programa, genera un saldo inicial aleatorio entre **100€ y 1000€**.  
Permite al usuario realizar las siguientes operaciones:

- 💰 **Consultar saldo.**
- 💸 **Retirar dinero** (verificar que el monto no exceda el saldo disponible).
- 💵 **Depositar dinero.**

⚠️ Maneja errores como intentar retirar más dinero del que se tiene o ingresar montos no válidos.  
🛠️ Implementa el código de manera modular, utilizando métodos para cada operación del cajero.

---

### 4️⃣ Número Capicúa
Escribe un programa que solicite un número y determine si es un **número capicúa**.  
Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda (por ejemplo, 121 o 3443).  

---

### 5️⃣ Carrera de autos generando número de vehículo y tiempos aleatorios
Escribe un programa que simule una **carrera** con un máximo de **10 participantes**.  
Cada participante recibe:

- 🚗 Un número de vehículo generado aleatoriamente (entre 1 y 100).
- ⏱️ Un tiempo en segundos generado aleatoriamente (entre 1 y 350).

⚠️ Si el tiempo es menor a 60 o mayor a 300, el participante es **descalificado**.  
El programa debe mostrar al final:

- 🏆 El participante con el **tiempo más bajo** (ganador).
- 🕒 El participante con el **tiempo más alto**.

🛠️ El código debe ser modular, con métodos para generar el número de vehículo, los tiempos, y determinar el ganador.
