# 🍽️ Diseñando la Clase: Pedido de Restaurante

## 🎯 Objetivo

Tu tarea será representar un **Pedido de Restaurante** utilizando una clase en Java. Este pedido deberá registrar información básica sobre el cliente, los artículos solicitados, el precio total y el estado del pedido. Además, implementarás métodos para gestionar y mostrar la información del pedido, aplicando los conceptos de programación orientada a objetos.

---

## 📋 Detalles del Problema

### 🛒 Información del Pedido

Cada pedido debe incluir:

- **Identificador único**: Generado automáticamente.
- **Nombre del cliente**: Quién realizó el pedido.
- **Artículos solicitados** (máximo 5):
  - Nombre del artículo.
  - Cantidad solicitada.
  - Precio por unidad.

### 🔄 Estado del Pedido

El pedido puede tener los siguientes estados gestionados mediante un `enum`:

- `EN_PREPARACION`
- `LISTO_PARA_ENTREGAR`
- `ENTREGADO`

### 💰 Precio Total

El sistema debe calcular automáticamente el **precio total** sumando el precio de todos los artículos.

---

## 🛠️ Tareas

### 🏗️ Atributos

- Identificar los atributos necesarios para representar un pedido.
- Implementar un atributo estático para generar automáticamente el identificador único de cada pedido.

### 🔨 Constructores

- Crear al menos un constructor para inicializar los datos básicos del pedido.

### ✏️ Métodos

Diseñar métodos para:

1. **Calcular el precio total** del pedido.
2. **Cambiar el estado** del pedido utilizando el `enum`.
3. **Mostrar un resumen** del pedido.

### 🚨 Validaciones y Extras

- Asegurarse de que no se puedan agregar más de 5 artículos.
- Controlar que el estado del pedido no pueda retroceder (por ejemplo, de `ENTREGADO` a `EN_PREPARACION`).
- Agregar cualquier atributo o método adicional que mejore la funcionalidad o la organización del pedido.

---

## 🚀 ¡Manos a la obra!

Sigue estas instrucciones para implementar la clase y sus funcionalidades. ¡Buena suerte! 💪
