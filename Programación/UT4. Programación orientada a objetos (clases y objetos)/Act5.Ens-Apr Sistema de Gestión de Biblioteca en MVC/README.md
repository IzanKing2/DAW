# 📚 Sistema de Gestión de Biblioteca en MVC

## 🎯 Objetivo
Desarrollar un sistema de gestión de biblioteca utilizando **Java** y el patrón **MVC**. Este sistema permitirá:
- Gestionar libros y usuarios.
- Realizar préstamos y devoluciones.
- Mostrar información estructurada mediante métodos específicos.

## 📝 Detalles del Problema

### 📖 Información del Libro
Cada libro debe incluir:
- **ISBN**: Identificador único.
- **Título** y **Autor**.
- **Año de publicación**.
- **Editorial**.
- **Género**: Representado como un `enum` con valores como:
  - `NOVELA`, `CIENCIA_FICCION`, `HISTORIA`, `FANTASIA`, `MISTERIO`, `INFANTIL`, `POESIA`, `OTRO`, etc.
- **Cantidad total de copias** disponibles.
- **Cantidad de copias disponibles para préstamo**.
- **Estado**: Representado como un `enum` con valores:
  - `DISPONIBLE`, `PRESTADO`, `RESERVADO`.

### 👤 Información del Usuario
Cada usuario debe incluir:
- **ID único**.
- **Nombre**.
- **Lista de libros actualmente prestados**.
- **Historial de libros prestados** (libros devueltos).

### ⚠️ Restricciones
- Un usuario no puede tener más de **3 libros prestados** a la vez.
- Un libro no puede ser prestado por más de **30 días**.
- Después de devolver un libro, el usuario debe esperar **7 días** para volver a solicitarlo.

## 🛠️ Tareas

### 📋 Atributos
- Identificar los atributos necesarios para representar libros, usuarios y préstamos.
- Considerar atributos adicionales para mejorar la gestión del sistema.

### 🔄 Métodos
Diseñar métodos para:
- **Prestar un libro**.
- **Devolver un libro**.
- **Reservar un libro**.
- **Buscar libros** por:
  - Título.
  - ISBN.
  - Género.
- Identificar qué usuario tiene un libro actualmente prestado.

### 📊 Resúmenes
- **Resumen de Libros**: Listar todos los libros disponibles junto con su estado actual.
- **Resumen de Usuarios**: Listar todos los usuarios registrados y los libros que tienen actualmente prestados.

### 🏗️ Clase de Gestión de Préstamos
Crear una tercera clase para gestionar los préstamos, que incluya:
- **Fecha de préstamo**.
- **Fecha de vencimiento del préstamo**.
- Métodos necesarios para garantizar el correcto funcionamiento del sistema.

## 🖥️ Implementación de Controladores y Vistas

### 🔧 Controladores
- Gestionar la lógica del sistema y coordinar la interacción entre modelos y vistas.
- Ejemplo: `GestorBiblioteca` para gestionar libros y usuarios.

### 👁️ Vistas
- Mostrar información al usuario mediante una **interfaz de consola** (`Consola.java`).

## ✅ Requerimientos

### 🛡️ Validaciones
- Evitar que se preste un libro ya prestado o reservado.
- Prevenir cambios de estado incorrectos (por ejemplo, devolver un libro que no está prestado).
- Controlar excepciones al intentar prestar más de 3 libros a un usuario.

### ⏳ Restricciones de Tiempo
- Implementar el límite de **30 días** para préstamos.
- Bloquear préstamos por **7 días** después de la devolución.

### 🚨 Manejo de Excepciones
- Crear excepciones personalizadas como:
  - `LibroNoDisponibleException`.
  - `LimitePrestamosExcedidoException`.
- Usar excepciones estándar de Java como:
  - `IllegalArgumentException` para argumentos inválidos.
  - `NullPointerException` para evitar operaciones sobre objetos nulos.

---

¡Buena suerte desarrollando este sistema! 🚀
