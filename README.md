# Student Management System

A Spring Boot application for managing student data with PostgreSQL database.

## Prerequisites

- Java 17 JDK
- PostgreSQL 12+
- Maven 3.6+

## Tech Stack

- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Lombok
- Spring Web

## Installation

1. Clone repository:
```bash
git clone [repository-url]
cd [project-directory]
```

2. Configure PostgreSQL:
```bash
# Create database
createdb student_db

# Update application.properties with your credentials:
spring.datasource.url=jdbc:postgresql://localhost:5432/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Build project:
```bash
mvn clean install
```

4. Run application:
```bash
mvn spring-boot:run
```

## API Endpoints

### Students

- GET `/api/students` - List all students
- GET `/api/students/{id}` - Get student by ID
- POST `/api/students` - Create new student
- PUT `/api/students/{id}` - Update student
- DELETE `/api/students/{id}` - Delete student

### Request Body Example

```json
{
  "namaDepan": "John",
  "namaBelakang": "Doe",
  "tanggalLahir": "2000-01-01"
}
```

## Development

1. Run PostgreSQL:
```bash
sudo service postgresql start
```

2. Run application in dev mode:
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```
