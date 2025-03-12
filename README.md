# Clean Architecture Project

This project demonstrates the implementation of **Clean Architecture** principles in a Spring Boot application. It separates concerns into distinct layers (e.g., domain, use cases, adapters) to ensure maintainability, scalability, and testability.

---

## File Structure
```
clean_architecture/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com.example.clean_architecture.adapters/
│ │ │ │ ├── controller/ # REST Controllers 
│ │ │ │ ├── repository/ 
│ │ │ ├── com.example.clean_architecture.application/
│ │ │ │ └── CleanArchitectureApplication.java # Main Application Class
│ │ │ ├── com.example.clean_architecture.core/
│ │ │ │ ├── domain/ # Domain Models and Interfaces
│ │ │ │ ├── usecase/ # Business Logic 
│ │ │ ├── com.example.clean_architecture.infrastructure/
│ │ │ │ ├── configuration/ 
│ │ │ │ ├── persistence/ 
│ │ ├── resources/
│ │ │ ├── application.properties # Application Configuration
│ │ │ ├── data.sql # Initial Data Script 
│ │ │ ├── static/ 
│ │ │ └── templates/ 
│ ├── test/ # Unit and Integration Tests
├── Dockerfile # Docker Configuration for the Application
├── docker-compose.yml # Docker Compose Configuration (App + PostgreSQL)
├── pom.xml 
└── README.md 
```


---

## Key Features

- **Clean Architecture Layers**: Clear separation of concerns (domain, use cases, adapters).
- **Dockerized**: Easy setup with Docker and PostgreSQL.
- **REST API**: Exposes endpoints for user management.

---

## Getting Started

1. **Build the Application**:
   ```bash
   mvn clean install
Run with Docker:

   ```bash
   docker-compose up

Technologies Used
Spring Boot: Backend framework.

PostgreSQL: Relational database.

Docker: Containerization for consistent environments.

Maven: Build and dependency management.
