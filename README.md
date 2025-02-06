# Student Crud System
A RESTful API for managing student data using Spring Boot and a PostgreSQL database

## Prerequisites
Before running the project, ensure you have the following installed:
- Java 17 JDK
- PostgreSQL 12+

## Tech Stack

- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Lombok
- Spring Web

## Installation

1. Clone repository:
```bash
git clone https://github.com/Saidill/student-backend-java.git
cd student-backend-java
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
./gradlew clean build
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

