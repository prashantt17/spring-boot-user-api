# Spring Boot User API - Detailed Documentation

This document serves as a **comprehensive project guide** for the [spring-boot-user-api](https://github.com/prashantt17/spring-boot-user-api). It is intended for both technical and non-technical readers, covering the **project overview, architecture, execution flow, endpoints, and request/response samples**.

---

## 1. Project Overview

The **Spring Boot User API** is a RESTful microservice designed to manage user data. It follows a clean layered architecture with **Controller, Service, Repository, and Entity layers**.

### Business Use Case

* Provides a backend service to **create, read, update, and delete users**.
* Can be integrated into larger applications such as authentication systems, HR portals, or e-commerce platforms.
* Uses **H2 in-memory database** for persistence (lightweight, requires no setup).

### Key Objectives

* Centralized **user management**.
* Lightweight and **easy to deploy**.
* Extendable with **security, validations, and scalability**.

---

## 2. Tech Stack

* **Java 17+**
* **Spring Boot 3.x** (Web, JPA, Validation)
* **H2 Database** (in-memory for demo/testing)
* **Maven** (build tool)
* **Lombok** (for reducing boilerplate code)

---

## 3. Architecture

```
Client → REST Controller → Service Layer → Repository → Database (H2)
```

### Components

* **Entity (`User`)**: Represents user data mapped to DB.
* **Repository (`UserRepository`)**: Handles DB queries via Spring Data JPA.
* **Service (`UserService`)**: Business logic (validation, transformations).
* **Controller (`UserController`)**: Exposes REST endpoints.
* **Application (`UserApiApplication`)**: Entry point for Spring Boot.

---

## 4. Endpoints & API Specification

### Base URL

```
http://localhost:8080/api/users
```

### Endpoints

#### 1. Get All Users

* **Endpoint:** `GET /api/users`
* **Response:**

```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com"
  }
]
```

#### 2. Get User by ID

* **Endpoint:** `GET /api/users/{id}`
* **Response:**

```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

#### 3. Create User

* **Endpoint:** `POST /api/users`
* **Request:**

```json
{
  "name": "Alice",
  "email": "alice@example.com",
  "password": "secret123"
}
```

* **Response:**

```json
{
  "id": 2,
  "name": "Alice",
  "email": "alice@example.com"
}
```

#### 4. Update User

* **Endpoint:** `PUT /api/users/{id}`
* **Request:**

```json
{
  "name": "Alice Updated",
  "email": "alice.updated@example.com"
}
```

* **Response:**

```json
{
  "id": 2,
  "name": "Alice Updated",
  "email": "alice.updated@example.com"
}
```

#### 5. Delete User

* **Endpoint:** `DELETE /api/users/{id}`
* **Response:**

```json
{
  "message": "User deleted successfully"
}
```

---

## 5. Execution Flow

1. **Client** sends a request (e.g., `POST /api/users`).
2. **Controller** receives the request and validates input.
3. **Service** performs business logic (e.g., encode password).
4. **Repository** interacts with the database using Spring Data JPA.
5. **Entity** maps Java objects to database tables.
6. **Response** is returned in JSON format.

---

## 6. How to Run

### Prerequisites

* Java 17+
* Maven 3+

### Steps

```bash
# Clone repository
git clone https://github.com/prashantt17/spring-boot-user-api.git
cd spring-boot-user-api

# Build project
mvn clean install

# Run application
mvn spring-boot:run
```

Application will start on: [http://localhost:8080](http://localhost:8080)

---

## 7. Possible Improvements

* Add **Spring Security** for authentication/authorization.
* Use **DTOs** instead of exposing entity directly.
* Add **Swagger/OpenAPI** for API documentation.
* Add **Global Exception Handling**.
* Write **Unit & Integration Tests**.
* Use **external database** (MySQL/Postgres) for production.

---

## 8. Conclusion

This project is a **starter microservice** for managing users with Spring Boot. It can serve as a foundation for larger enterprise projects by extending security, validations, and scalability features.
