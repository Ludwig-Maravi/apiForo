# 🚀 apiForo
![Badge-Spring](https://github.com/user-attachments/assets/8e4b9e55-67b7-4d05-9c89-c3e15ebfdca9)

## ¡Bienvenido a API **apiForo**! 🗣️

**apiForo** es una API backend para gestionar un foro en línea, construida con **Spring Boot** y **Java**. Esta API permite la creación, consulta, actualización y eliminación de tópicos del foro, asegurando que los campos sean correctamente validados y que no existan duplicados. **MySQL** es utilizado como sistema de base de datos y **Postman** se ha usado para realizar pruebas exhaustivas de la API.

---

## 📝 Descripción

**apiForo** es un servicio backend de un foros que garantiza a todos los usuario una viavilidad. Además, aplica una regla de negocio que impide la creación de tópicos duplicados, es decir, no se permite el registro de tópicos con el mismo **título** y **mensaje**.

### Reglas de negocio:
1. **Campos obligatorios**: Todos los campos del tópico (título y mensaje) son obligatorios.
2. **Prevención de tópicos duplicados**: La API valida que no existan tópicos con el mismo **título** y **mensaje** antes de permitir su creación.

---

## 🎯 Propósito

El objetivo de **apiForo** es proporcionar una API backend que permita a los usuarios registrar, consultar, actualizar y eliminar tópicos de foro de manera efectiva, asegurando la integridad de los datos y evitando la duplicación de tópicos.

### Funcionalidades principales:
- **Crear un tópico**: El usuario puede crear un nuevo tópico solo si todos los campos están completos y no hay duplicados.
- **Obtener tópicos**: Permite la consulta de todos los tópicos registrados en el sistema.
- **Actualizar un tópico**: Los usuarios pueden actualizar un tópico existente.
- **Eliminar un tópico**: Permite la eliminación de un tópico registrado.
  
---

## 🌟 Características

- **Validación de campos obligatorios**: Verifica que todos los campos necesarios estén completos antes de registrar un nuevo tópico.
- **Prevención de tópicos duplicados**: La API garantiza que no se registren tópicos con el mismo título y mensaje.
- **Base de datos MySQL**: Los datos se almacenan de manera estructurada en **MySQL**.
- **Postman**: Se utilizan colecciones de **Postman** para probar y documentar la API.
- **API RESTful**: El backend está diseñado como una API RESTful utilizando **Spring Boot**.

---

## 🖥️ Tecnologías

- **Spring Boot**: Framework de Java utilizado para desarrollar la API.
- **Java**: Lenguaje de programación utilizado para la lógica del backend.
- **MySQL**: Base de datos relacional utilizada para almacenar los datos.
- **Postman**: Herramienta utilizada para probar y documentar la API.
- **JPA (Java Persistence API)** y **Hibernate**: Para la persistencia de datos en MySQL.
- **Maven**: Herramienta para gestionar dependencias y construcción del proyecto.

---

## ⚙️ Instalación

### 📦 Requisitos previos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:

- **Java 21+**: Requerido para ejecutar el backend en **Spring Boot**.
- **MySQL**: Asegúrate de tener **MySQL** corriendo en tu máquina local o en un servidor.
- **Postman**: Para probar la API.
- **Maven**: Para gestionar las dependencias y compilar el proyecto.

### 🛠️ Pasos para la instalación:

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/Ludwig-Maravi/apiForo.git

2. **Accede a la carpeta del proyecto**:
   ```bash
   cd apiForo
   
3. **Configuración de la Base de Datos**:
  Asegúrate de tener MySQL corriendo en tu máquina local o en un servidor.
  Crea una base de datos para la aplicación (por ejemplo, api_forum).
  Configura la conexión en el archivo application.properties con los parámetros de conexión a tu base de datos MySQL.

4. **Inicia la aplicación**:
   Para ejecutar la aplicación en tu máquina local, usa el siguiente comando:
   ```bash
   mvn spring-boot:run

## 🧑‍💻 Endpoints

### 1. Crear Tópico (POST)
- **URL:** `/api/topico`
- **Método:** `POST`
- **Descripción:** Crea un nuevo tópico con un título y mensaje.

### 2. Obtener Todos los Tópicos (GET)
- **URL:** `/api/topico`
- **Método:** `GET`
- **Descripción:** Obtiene todos los tópicos registrados en el foro.

### 3. Obtener Tópico por ID (GET)
- **URL:** `/api/topico/{id}`
- **Método:** `GET`
- **Descripción:** Obtiene un tópico específico por su ID.

### 4. Actualizar Tópico (PUT)
- **URL:** `/api/topico/{id}`
- **Método:** `PUT`
- **Descripción:** Actualiza un tópico existente.

### 5. Eliminar Tópico (DELETE)
- **URL:** `/api/topico/{id}`
- **Método:** `DELETE`
- **Descripción:** Elimina un tópico por su ID.

## 📧 Contacto

Para cualquier duda o sugerencia, puedes contactarme.

