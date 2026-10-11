# Open-FaaS — Ecosistema de servicios

Ecosistema de microservicios construido con **Spring Cloud** para la aplicación
*Task Control App*: gestión de controles y calificaciones de alumnos
(`task-control-service`, con PostgreSQL) y calendario de tareas
(`taskcontrolapp-calendar`, con MongoDB), con descubrimiento de servicios,
configuración centralizada y un API gateway como punto único de entrada.

Todo el ecosistema se puede levantar de una vez con Docker Compose.

## Arquitectura

| Servicio | Descripción | Puerto |
|---|---|---:|
| `server-config` | Configuración centralizada (Spring Cloud Config) | 8888 |
| `service-discovery` | Descubrimiento de servicios (Eureka) | 8761 |
| `gateway` | API Gateway, punto único de entrada | 8080 |
| `task-control-service` | Control de tareas/calificaciones (Spring Data JPA + PostgreSQL) | 8098 |
| `task-calendar-service` | Calendario de tareas (Spring Data MongoDB) | 8095 |

Servicios de apoyo: `postgresdb` (PostgreSQL, 5432) y `mongodb`.

Cada microservicio de negocio está organizado como proyecto Maven multimódulo
(`boot`, `controller`, `service`, `repository`, `model`) sobre Spring Boot 2.1
y Spring Cloud Greenwich.

## Estructura del repositorio

- `docker-compose/` — `docker-compose.yml` para levantar todo el ecosistema
- `gateway/` — API Gateway
- `server-config/` — servidor de configuración centralizada
- `service-discovery/` — servidor Eureka de descubrimiento de servicios
- `task-control-service/` — microservicio de control de tareas (PostgreSQL)
- `taskcontrolapp-calendar/` — microservicio de calendario de tareas (MongoDB)
- `quarkus-base-patterns/` — patrones base con Quarkus

## Requisitos

- Java 8 o superior
- Maven 3.x
- Docker y Docker Compose

## Puesta en marcha

### Opción 1: Docker Compose (recomendado)

```bash
cd docker-compose
docker-compose up
```

Levanta las bases de datos y todos los servicios con las imágenes publicadas
(`mtribor/taskcontrolapp-*`, con las credenciales definidas en el propio
`docker-compose.yml`). El gateway queda disponible en http://localhost:8080.

### Opción 2: construir desde el código fuente

Cada servicio es un proyecto Maven multimódulo. Por ejemplo:

```bash
cd task-control-service
mvn clean package
java -jar boot/target/*.jar
```

Los servicios leen su configuración de `server-config` (puerto 8888) y se
registran en Eureka (puerto 8761): levanta esos dos primero.

## Puertos y consolas

- Eureka: http://localhost:8761
- Gateway: http://localhost:8080
- task-control-service: http://localhost:8098
- task-calendar-service: http://localhost:8095

## Licencia

Este proyecto está bajo la **GNU General Public License v3.0**.
Consulta el archivo [LICENSE](LICENSE) para más detalles.
