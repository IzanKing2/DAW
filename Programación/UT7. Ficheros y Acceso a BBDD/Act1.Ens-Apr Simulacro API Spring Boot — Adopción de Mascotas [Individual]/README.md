# 🐾 Mascotas Adopción API

¡Bienvenido a **Mascotas Adopción API**! Este proyecto es una aplicación backend desarrollada con **Spring Boot** para gestionar un sistema de adopción de mascotas. 🐶🐱

## 🚀 Características

- 📋 CRUD completo para gestionar mascotas.
- 🐕 Información sobre nombre, especie, edad y estado de adopción.
- 🔍 API RESTful para interactuar con los datos.
- 🛠️ Conexión a base de datos MySQL.

## 📂 Estructura del Proyecto

```
mascotas/
├── src/
│   ├── main/
│   │   ├── java/com/mascotasAdopcion/mascotas/
│   │   │   ├── controller/    # Controladores REST
│   │   │   ├── model/         # Entidades JPA
│   │   │   ├── repository/    # Repositorios JPA
│   │   │   ├── service/       # Lógica de negocio
│   │   │   └── MascotasApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/                  # Pruebas unitarias
├── pom.xml                    # Configuración de Maven
└── README.md                  # Documentación del proyecto
```

## 🛠️ Requisitos Previos

- **Java 17** o superior.
- **Maven**.
- **MySQL**.

## ⚙️ Configuración

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/mascotas-adopcion.git
   cd mascotas-adopcion
   ```

2. Configura la base de datos en `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/mascotasdb
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   ```

3. Ejecuta el proyecto:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Accede a la API en: [http://localhost:8080/api/v1/mascotas](http://localhost:8080/api/v1/mascotas)

## 📖 Endpoints

| Método   | Endpoint               | Descripción                     |
|----------|-------------------------|---------------------------------|
| `GET`    | `/api/v1/mascotas`     | Listar todas las mascotas.      |
| `GET`    | `/api/v1/mascotas/{id}`| Obtener una mascota por ID.     |
| `POST`   | `/api/v1/mascotas`     | Crear una nueva mascota.        |
| `PUT`    | `/api/v1/mascotas/{id}`| Actualizar una mascota existente. |
| `DELETE` | `/api/v1/mascotas/{id}`| Eliminar una mascota por ID.    |

## 🐾 Modelo de Mascota

```json
{
  "id": 1,
  "nombre": "Firulais",
  "especie": "Perro",
  "edad": 3,
  "adoptado": false
}
```

## 🧪 Pruebas

Ejecuta las pruebas con:
```bash
./mvnw test
```

## 📜 Licencia

Este proyecto está bajo la licencia **Apache 2.0**. Consulta el archivo `LICENSE` para más detalles.

---

✨ _Desarrollado con ❤️ por Izan Carlo Celis Afonso._
