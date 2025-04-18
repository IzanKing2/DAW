# 🧩 Actividad: Ejercicios Avanzados con Matrices y Colecciones

## 🎯 **Objetivo**

El propósito de esta actividad es que los estudiantes desarrollen competencias avanzadas en el manejo de **matrices**, **colecciones** y **estructuras de datos** en **Java**.

---

## 📝 **Ejercicios**

### 1️⃣ **Gestión de una ToDo List** 🗒️

Crea un programa para gestionar una lista de tareas pendientes.  
**Funcionalidades del programa:**
- ➕ **Añadir tarea**: Permite al usuario añadir una tarea a la lista, asegurándose de que no esté duplicada.
- 📋 **Listar tareas**: Muestra todas las tareas pendientes en orden de inserción.
- ❌ **Eliminar tarea**: Permite eliminar una tarea por su nombre.
- 🔍 **Buscar tarea**: Permite buscar si una tarea existe en la lista.
- ✅ **Marcar tarea como completada**: Usa un iterador para recorrer la lista y marcar las tareas como completadas. Una vez completada, se elimina de la lista.
- 🚪 **Salir del programa**.

---

### 2️⃣ **Gestión de Usuarios por DNI con Validación y Map en Java** 🆔

Crea un programa para validar un **DNI**, almacenarlo en un **Map** y realizar operaciones administrativas.  
**Funcionalidades del programa:**
- ➕ **Añadir usuario**: Solicitar DNI y nombre, validar y guardar.
- 📋 **Listar usuarios**: Mostrar todos los pares clave-valor.
- 🔍 **Buscar usuario por DNI**: Mostrar el nombre asociado a un DNI.
- ✏️ **Modificar usuario**: Cambiar el nombre asociado a un DNI.
- ❌ **Eliminar usuario**: Quitar un par clave-valor.
- 🚪 **Salir del programa**.

### 🛠️ **Gestión de errores y validación del DNI**

Un **DNI español válido** consta de:
- **8 dígitos numéricos** (ejemplo: `12345678`).
- **Una letra mayúscula** (ejemplo: `Z`).

#### 📐 **Cálculo de la letra del DNI**
1. Divide los 8 dígitos entre 23.
2. Usa el resto para buscar la letra correspondiente en la tabla.
3. Compara la letra calculada con la proporcionada en el DNI.

![img dni](https://www3.gobiernodecanarias.org/medusa/eforma/campus/pluginfile.php/10820806/mod_assign/intro/image%20%282%29.png)

---

### 3️⃣ **Sistema de Reserva de Asientos en Guaguas** 🚌

Desarrolla un sistema que permita a los usuarios reservar asientos en guaguas para diferentes trayectos y horarios.  
**Requisitos del sistema:**
- **Trayectos disponibles**:
  - Madrid - Sevilla
  - Madrid - Coruña
- **Horarios disponibles**:
  - Mañana: 42 asientos
  - Noche: 24 asientos
- **Distribución de asientos**:
  - Mañana: 14 asientos por fila (A1 a A14, B1 a B14, C1 a C14).
  - Noche: 8 asientos por fila (A1 a A8, B1 a B8, C1 a C8).

#### **Funcionalidades del programa:**
- 🪑 **Reservar asiento**: El usuario selecciona el trayecto, horario y los asientos que desea reservar. El sistema genera un ID único para cada reserva.
- ❌ **Cancelar reserva**: El usuario puede cancelar una reserva introduciendo el ID generado al realizarla.
- 🔍 **Consultar reserva**: El usuario introduce el ID y puede visualizar los datos de su reserva (trayecto, horario y asientos reservados).
- 🗺️ **Mostrar asientos disponibles**: Muestra el mapa visual de los asientos libres y ocupados por trayecto y horario.

#### **Ejemplo de mapa de asientos:**
![img ejemplo](https://www3.gobiernodecanarias.org/medusa/eforma/campus/pluginfile.php/10820806/mod_assign/intro/image%20%284%29.png)

#### **Consultar disponibilidad por trayecto y turno:**
Permite verificar la cantidad de asientos libres por trayecto y horario.

#### **Ejemplo de disponibilidad:**
![img ejemplo1](https://www3.gobiernodecanarias.org/medusa/eforma/campus/pluginfile.php/10820806/mod_assign/intro/image%20%286%29.png)

---

🚪 **Salir del programa**
