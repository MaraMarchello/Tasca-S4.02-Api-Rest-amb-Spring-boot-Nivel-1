# Tasca-S4.02-Api-Rest-amb-Spring-boot Nivel 1

## 📄 Descripción
Este proyecto implementa una API RESTful para la gestión de frutas utilizando Spring Boot. Proporciona operaciones CRUD básicas (Crear, Leer, Actualizar, Eliminar) para entidades de frutas, con validación de datos y manejo de errores.

### Características Principales:
- Operaciones CRUD para frutas
- Validación de datos
- Manejo de excepciones
- Endpoints RESTful
- Integración con base de datos H2

## 💻 Tecnologías Utilizadas
- Java 21
- Spring Boot 3.4.7
- Spring Data JPA
- Spring Validation
- Lombok
- Base de datos H2
- Gradle
- JUnit

## 📋 Requisitos
- Java JDK 21 o superior
- Gradle 8.x
- IDE con soporte para Lombok (IntelliJ IDEA, Eclipse, VS Code)

## 🛠️ Instalación
1. Clonar el repositorio:
```bash
git clone https://github.com/MaraMarchello/Tasca-S4.02-Api-Rest-amb-Spring-boot-Nivel-1
cd S04T02N01
```

2. Construir el proyecto:
```bash
./gradlew build
```

3. Configurar el IDE para Lombok:
- Instalar el plugin de Lombok
- Habilitar el procesamiento de anotaciones

## ▶️ Implementación
1. Iniciar la aplicación:
```bash
./gradlew bootRun
```

2. La API estará disponible en `http://localhost:8080`

### Endpoints Disponibles:
- POST `/fruit/add` - Añadir nueva fruta
- PUT `/fruit/update/{id}` - Actualizar fruta existente
- DELETE `/fruit/delete/{id}` - Eliminar fruta
- GET `/fruit/getOne/{id}` - Obtener fruta específica
- GET `/fruit/getAll` - Obtener todas las frutas

## 🌐 Despliegue
1. Construir el JAR de producción:
```bash
./gradlew build
```

2. Ejecutar el archivo JAR:
```bash
java -jar build/libs/S04T02N01-0.0.1-SNAPSHOT.jar
```

## 🤝 Contribución
1. Hacer un fork del repositorio
2. Crear una rama para la nueva funcionalidad
3. Realizar los cambios
4. Hacer push a la rama
5. Crear un Pull Request 
