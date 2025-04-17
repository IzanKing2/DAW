# 🧮 Calculadora Básica en PSeInt

Este proyecto consiste en la creación de un programa en **PSeInt** que simula el funcionamiento de una **calculadora básica**, permitiendo realizar operaciones matemáticas como suma, resta, multiplicación y división.

---

## 🎯 Objetivo

Desarrollar un algoritmo interactivo que:

- Solicite datos al usuario.
- Permita seleccionar la operación matemática a realizar.
- Muestre el resultado correspondiente.
- Valide la entrada de datos (especialmente en caso de división).
- Permita repetir el proceso cuantas veces desee el usuario.

---

## 📋 Instrucciones

### 1. Entrada de datos
- El programa pedirá al usuario que introduzca **dos números**.
- Luego, solicitará elegir una operación:
  - `1` → Suma
  - `2` → Resta
  - `3` → Multiplicación
  - `4` → División

### 2. Proceso
- Se ejecuta la operación matemática seleccionada.
- En caso de **división**, se comprobará que el **segundo número no sea cero**.
  - Si lo es, se mostrará un **mensaje de error** y se volverá a pedir la entrada.

### 3. Salida de resultados
- Se muestra el **resultado de la operación** elegida.

### 4. Repetición
- El programa preguntará si se desea realizar **otro cálculo** (`S` para sí, `N` para no).
- Si el usuario responde que sí, el proceso se repite.

### 5. Buenas prácticas
- Uso de **comentarios explicativos** en cada sección del código.
- Variables con **nombres significativos**.
- Aplicación de las **convenciones de programación** aprendidas durante la unidad.

---

## ✅ Requisitos adicionales

- Implementación correcta de las operaciones matemáticas usando los operadores de **PSeInt**.
- Control del flujo del programa con estructuras repetitivas y condicionales.
- Validación de entrada para evitar errores como **división por cero**.

---

## 💡 Ejemplo de funcionamiento

Ingrese el primer número: 8
Ingrese el segundo número: 2
Seleccione la operación (1 = suma, 2 = resta, 3 = multiplicación, 4 = división): 1
El resultado de la suma es: 10
¿Desea realizar otro cálculo? (S/N): S