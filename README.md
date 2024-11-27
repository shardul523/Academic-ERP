# Academic ERP (Faculty Time Table Display) REST API

## Overview

This is a **Spring Boot** REST API backend for fetching the Course Schedule of a faculty. It provides endpoints for user authentication, fetching timetable, and course-related data. The API is designed to handle data efficiently and follows a **layered architecture**, ensuring a clean separation of concerns between controllers, services, and repositories.

## Features

- **Authentication and Authorization**:
    - Secure login using JSON Web Tokens (JWT).
    - Role-based access control for faculty.

- **Dashboard Data**:
    - API endpoints to fetch user data.

- **Time Table**:
    - Retrieve faculty schedules.

- **Course Students List**:
    - Access and manage the list of students enrolled in each course.

## Architecture

The project adheres to a **layered architecture** for better maintainability and scalability:

1. **Controller Layer**:
    - Handles HTTP requests and sends appropriate responses.
    - Maps endpoints to corresponding service methods.

2. **Service Layer**:
    - Contains business logic and validation.
    - Ensures that controllers and repositories remain loosely coupled.

3. **Repository Layer**:
    - Interacts with the database using Spring Data JPA.
    - Manages data persistence.

4. **Model Layer**:
    - Defines the structure of entities and DTOs (Data Transfer Objects).

## Technologies Used

- **Spring Boot**: Framework for building RESTful APIs.
- **Spring Security**: For authentication and authorization.
- **JWT**: Token-based secure authentication.
- **Spring Data JPA**: For database operations.
- **H2/SQL Database**: Default database for development (can be configured for other databases like MySQL/PostgreSQL).
- **Lombok**: To reduce boilerplate code.
- **Swagger**: API documentation and testing.

---

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven or Gradle
- IDE (e.g., IntelliJ IDEA, Eclipse)
- Postman (for testing API endpoints)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/shardul523/Academic-ERP.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Academic-ERP
    ```

3. Build the project:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```
The API will be available at http://localhost:8080.

---

## API Endpoints

### Authentication

| Endpoint                | Method | Description                                         | Payload                                       |
|-------------------------|--------|-----------------------------------------------------|-----------------------------------------------|
| `/api/v1/auth/employee` | POST   | Authenticates an employee and provides a JWT token. | `{ "email": "string", "password": "string" }` |

### User Details

| Endpoint           | Method | Description               |
|--------------------|--------|---------------------------|
| `/api/v1/employee` | GET    | Fetches data for the logged-in user. |

### Faculty Course Schedule

| Endpoint                   | Method | Description                                        |
|----------------------------|--------|----------------------------------------------------|
| `/api/v1/employee/courses` | GET    | Fetches the faculty's courses and their schedules. |

### Course Students

| Endpoint                               | Method | Description               |
|----------------------------------------|--------|---------------------------|
| `/api/v1/course/{courseCode}/students` | GET    | Retrieves the list of students for a specific course. |


---

## Configuration

### Database Configuration

By default, the API uses a **MySQL database** for development. You can switch to another database (e.g., PostgreSQL) by updating the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/AcademicERP?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=none
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```
---

## Security Configuration
The API uses JWT for secure authentication. Update the secret key in application.properties:

```properties
jwt.secret=your_secret_key
```
