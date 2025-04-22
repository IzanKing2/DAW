# 🛒 Gestión de Productos con Programación Orientada a Objetos

## 🎯 Objetivo
Desarrollar y gestionar una clase `Producto` utilizando los conceptos de **encapsulación**, **validación** y **manejo de atributos** relacionados con un caso del mundo real.  
Además, se implementará el atributo `fechaCreacion` para registrar automáticamente la fecha en que se crea cada producto.

---

## 📝 Instrucciones

### 1️⃣ Diseñar la clase `Producto`:
- Implementar los siguientes **atributos privados**:
  - `id` (entero): Identificador único del producto.
  - `nombre` (String): Nombre del producto.
  - `descripcion` (String): Descripción breve del producto.
  - `precio` (double): Precio unitario del producto.
  - `stock` (int): Cantidad en inventario.
  - `categoria` (String): Tipo de producto.
  - `proveedor` (String): Nombre del proveedor.
  - `fechaCreacion` (LocalDate): Fecha en que se creó el producto (debe inicializarse automáticamente).

### 2️⃣ Implementar métodos **getter** y **setter**:
- Los **getter** deben permitir consultar los valores de los atributos.
- Los **setter** deben permitir modificar los valores, aplicando las siguientes validaciones:
  - El `precio` debe ser **mayor que 0**.
  - El `stock` no puede ser **negativo**.
  - Los atributos `nombre`, `categoria` y `proveedor` no pueden estar **vacíos** ni ser `null`.

### 3️⃣ Agregar métodos adicionales:
- **`mostrarInformacion()`**:
  - Imprime todos los datos del producto en el siguiente formato:
    ```
    ID: 101
    Nombre: Laptop
    Descripción: Portátil de 14 pulgadas
    Precio: $1000.0€
    Stock: 10
    Categoría: Electrónica
    Proveedor: TechSupplier
    Fecha de creación: 2025-01-10
    ```
- **`ajustarStock(int cantidad)`**:
  - Incrementa o disminuye el stock del producto según el valor de `cantidad`.
  - No permite que el stock quede negativo.

### 4️⃣ Probar la clase en el `main`:
- Crear al menos **3 objetos** de la clase `Producto` con valores iniciales diferentes.
- Usar los métodos **getter** y **setter** para modificar atributos como el `precio` y el `stock`.
- Probar el método **`ajustarStock()`** simulando ventas o ingresos al inventario.
- Llamar a **`mostrarInformacion()`** para imprimir los detalles de cada producto.

---

## 💻 Ejemplo de Uso
```java
Producto producto1 = new Producto(1, "Laptop", "Portátil de alta gama", 1200.50, 10, "Electrónica", "TechSupplier");
producto1.mostrarInformacion();

producto1.ajustarStock(-2); // Simula una venta
producto1.setPrecio(1150.00); // Actualiza el precio
producto1.mostrarInformacion();
```

---

## 🚀 Tecnologías Utilizadas
- **Java**: Lenguaje de programación orientado a objetos.
- **LocalDate**: Para manejar fechas de creación de los productos.

---

## 📚 Aprendizajes Esperados
- Aplicar los principios de **POO**: encapsulación, validación y manejo de atributos.
- Implementar y validar métodos `getter` y `setter`.
- Diseñar clases que simulen casos del mundo real.
- Manejar fechas y realizar operaciones básicas con atributos.

---

¡Diviértete programando! 😄✨
