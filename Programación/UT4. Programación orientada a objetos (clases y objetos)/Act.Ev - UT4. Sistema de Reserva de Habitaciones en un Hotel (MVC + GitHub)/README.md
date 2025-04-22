# 🏨 Sistema de Reserva de Habitaciones en un Hotel

## 📋 Objetivo
Desarrollar un sistema de reserva de habitaciones en un hotel utilizando **Java** y el patrón **MVC**. Este sistema permitirá gestionar:
- **Habitaciones** 🛏️
- **Clientes** 👤
- **Reservas** 📅

El proyecto será gestionado con **Git** y subido a **GitHub**.

---

## 🏢 Contextualización
Trabajaremos con un hotel de **3 plantas**, cada una con **5 habitaciones** numeradas de la siguiente manera:
- **Planta 1:** 101 - 105
- **Planta 2:** 201 - 205
- **Planta 3:** 301 - 305

### Tipos de habitación y precios por noche:
- **INDIVIDUAL:** 50€ 🛏️
- **DOBLE:** 80€ 🛌
- **SUITE:** 150€ 🛋️

---

## 🛠️ Funcionalidades
### Información de la Habitación
Cada habitación incluye:
- Número único (Ej: 101, 202).
- Tipo de habitación: `INDIVIDUAL`, `DOBLE`, `SUITE`.
- Precio por noche según el tipo.
- Estado: `DISPONIBLE`, `RESERVADA`, `OCUPADA`.
- Descripción opcional (Ej: "Vista al mar").

### Información del Cliente
Cada cliente tiene:
- ID único.
- Nombre completo.
- Historial de reservas pasadas.
- Máximo de **3 reservas activas** al mismo tiempo.

### Información de la Reserva
Cada reserva incluye:
- ID único.
- Habitación reservada.
- Cliente que realiza la reserva.
- Fechas de **check-in** y **check-out**.
- Precio total basado en el número de noches.

---

## 🚧 Restricciones
- Un cliente puede tener **máximo 3 reservas activas**.
- Máximo de **90 días** por reserva.
- No se permiten reservas en fechas pasadas.
- El **check-out** no puede ser antes del **check-in**.
- Una habitación solo puede tener una reserva activa en un rango de fechas.
- Reservas canceladas liberan la habitación.
- Solo se pueden cancelar reservas si el **check-in** no ha comenzado.

---

## 📂 Estructura del Proyecto
El sistema sigue el patrón **MVC**:
- **Modelo:** Representa habitaciones, clientes y reservas.
- **Controladores:** Gestionan la lógica del sistema.
- **Vista:** Consola para mostrar datos e interactuar con el usuario.

---

## ⚙️ Requerimientos Adicionales
- **Validaciones y Excepciones:**
  - Evitar reservas en fechas pasadas.
  - Impedir más de 3 reservas activas por cliente.
  - Excepciones personalizadas como:
    - `ReservaNoDisponibleException`
    - `ClienteNoEncontradoException`
  - Uso de excepciones estándar de Java (`IllegalArgumentException`, etc.).

- **Uso de Git y GitHub:**
  - Control de versiones con **Git**.
  - Subir el código a un repositorio en **GitHub**.
  - Commits con mensajes claros (Ej: "Añadida clase Reserva y validaciones de fechas").

---

## 🚀 Instrucciones de Ejecución
1. Clona el repositorio:
   ```bash
   git clone https://github.com/usuario/sistema-reservas-hotel.git
   ```
2. Abre el proyecto en tu IDE favorito (Ej: IntelliJ, Eclipse).
3. Compila y ejecuta el archivo principal (`Main.java`).
4. Sigue las instrucciones en la consola para interactuar con el sistema.

---

## 📖 Ejemplo de Uso
### Crear una reserva:
1. Selecciona una habitación disponible.
2. Introduce los datos del cliente.
3. Especifica las fechas de **check-in** y **check-out**.
4. Confirma la reserva y obtén el precio total.

### Consultar el estado del hotel:
- **Resumen de habitaciones:** Lista todas las habitaciones y su estado actual.
- **Resumen de clientes:** Muestra los clientes registrados y sus reservas activas.

---

## 📝 Notas
- Asegúrate de usar el archivo `.gitignore` proporcionado para evitar subir archivos innecesarios.
- Sigue las buenas prácticas de programación y realiza pruebas exhaustivas.

---

¡Disfruta desarrollando este proyecto y aprendiendo sobre programación orientada a objetos! 🎉
