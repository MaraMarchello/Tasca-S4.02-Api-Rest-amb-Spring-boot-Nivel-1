# Ejemplos de Peticiones API

Este directorio contiene archivos JSON de ejemplo para probar los endpoints de la API de Frutas.

## Peticiones Disponibles

1. `fruit-add.json` - Ejemplo de petición para POST /fruit/add
2. `fruit-update.json` - Ejemplo de petición para PUT /fruit/update/{id}

## Cómo Usar

### Usando cURL

```bash
# Añadir nueva fruta
curl -X POST http://localhost:8080/fruit/add \
-H "Content-Type: application/json" \
-d @fruit-add.json

# Actualizar fruta existente
curl -X PUT http://localhost:8080/fruit/update/1 \
-H "Content-Type: application/json" \
-d @fruit-update.json

# Obtener todas las frutas
curl http://localhost:8080/fruit/getAll

# Obtener una fruta
curl http://localhost:8080/fruit/getOne/1

# Eliminar fruta
curl -X DELETE http://localhost:8080/fruit/delete/1
```

### Usando Postman
1. Importar los archivos JSON a Postman
2. Establecer el método HTTP apropiado (POST, PUT, GET, DELETE)
3. Establecer el encabezado Content-Type a "application/json"
4. Usar el contenido JSON en el cuerpo de la petición

Nota: Para las peticiones GET y DELETE no necesitamos archivos JSON ya que no tienen cuerpo en la petición.