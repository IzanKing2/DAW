# 📝 Actividad 5: Documentación, Aserciones y Depuración en Java

## 🎯 Objetivo

Comprender y aplicar la documentación con **Javadoc**, el uso de **aserciones**, y las técnicas de **depuración** en un programa Java. Además, practicarás la compilación y ejecución del programa desde la terminal, documentando todo el proceso en un archivo PDF.

---

## 📋 Instrucciones

### 1️⃣ Escribir el código
1. Implementa un programa que incluya:
   - Una **variable global**.
   - Una **función** que realice una tarea específica (por ejemplo, verificación de login).
   - Un **método adicional**.
   - **Aserciones** que verifiquen el resultado esperado de la función.

---

### 2️⃣ Agregar comentarios Javadoc
1. Documenta el código utilizando **Javadoc**:
   - Describe la clase, la variable global, el método y la función.
   - Usa las etiquetas `@param` y `@return` para explicar los parámetros y el valor de retorno de la función.

---

### 3️⃣ Generar la documentación Javadoc
1. Genera la documentación Javadoc:
   - **Desde NetBeans**: Haz clic derecho sobre el proyecto y selecciona `Generate Javadoc`, o utiliza el menú `Run > Generate Javadoc`.
   - **Desde la terminal**: Usa el comando:
     ```bash
     javadoc -d directorio_salida NombreDeArchivo.java
     ```
2. Abre el archivo `index.html` en tu navegador para verificar la documentación generada.
3. 📸 **Captura una pantalla** del proceso.

---

### 4️⃣ Compilación y ejecución desde la terminal
1. Compila el programa usando `javac`:
   ```bash
   javac NombreDeClase.java
   ```
2. Ejecuta el programa:
   - **Con aserciones**:
     ```bash
     java -ea NombreDeClase
     ```
   - **Sin aserciones**:
     ```bash
     java NombreDeClase
     ```
3. 📸 **Captura pantallas** de ambos casos y muestra las diferencias en la ejecución.

---

### 5️⃣ Depuración del programa
1. Coloca **puntos de interrupción** en el código utilizando NetBeans (o el IDE que prefieras).
2. Ejecuta el programa en **modo depuración**.
3. Usa herramientas como:
   - **Step Over**
   - **Step Into**
   - **Step Out**
4. Inspecciona las variables y el flujo del programa.
5. 📸 **Captura pantallas** del uso de los breakpoints y la depuración.

---

### 6️⃣ Documentación del proceso en un PDF
1. Crea un documento en PDF que incluya:
   - **Explicación del código**: Describe brevemente qué hace el programa.
   - **Javadoc**: Explica cómo generaste la documentación Javadoc y proporciona capturas de pantalla.
   - **Compilación y ejecución**: Incluye los comandos usados para compilar y ejecutar el programa, mostrando las salidas con y sin aserciones. Adjunta capturas de pantalla.
   - **Depuración**: Describe el proceso de depuración y los puntos clave donde colocaste breakpoints. Incluye capturas de pantalla.
   - **Resultados de las aserciones**: Explica qué sucedió cuando las aserciones se activaron o no, y qué errores detectaste.

---

## 🌟 Consejos
- Usa emojis para hacer tu PDF más atractivo. 🎨
- Asegúrate de que las capturas de pantalla sean claras y estén bien organizadas.
- Revisa tu código y documentación antes de entregarlo. ✅

¡Buena suerte! 🚀
