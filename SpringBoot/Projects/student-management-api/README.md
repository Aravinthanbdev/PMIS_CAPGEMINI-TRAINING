# Student Management REST API

A Spring Boot 3 REST API using the requested layered structure and in-memory storage.

## Technology
- Java 17
- Spring Boot 3.4.5
- Maven
- Spring Web
- Jakarta Bean Validation
- `ConcurrentHashMap` for in-memory storage (no database)

## Project structure

```text
src/main/java/com/example/studentmanagement/
├── StudentManagementApplication.java
├── entity/
│   └── Student.java
├── controller/
│   ├── GetAllStudentsController.java
│   ├── GetStudentByIdController.java
│   ├── CreateStudentController.java
│   ├── UpdateStudentController.java
│   └── DeleteStudentController.java
├── service/
│   └── StudentService.java
└── repository/
    └── StudentRepository.java
```

Each HTTP operation has its own controller file. Controllers delegate to the service;
the service contains application logic; the repository owns in-memory storage.

## Run the application

Requirements: JDK 17+ and Maven 3.6+.

From the project root:

```bash
mvn clean spring-boot:run
```

The API starts at `http://localhost:8080`.

## Initial data

Two students are loaded automatically whenever the application starts:

```json
[
  {
    "id": 1,
    "name": "Rahul Sharma",
    "email": "rahul@example.com",
    "course": "Java"
  },
  {
    "id": 2,
    "name": "Priya Singh",
    "email": "priya@example.com",
    "course": "Spring Boot"
  }
]
```

**Storage note:** this project does not use MySQL or any other database. All records are
held in application memory. New or updated data is lost when the application stops.

## API endpoints

| Method | URL | Operation | Success status |
|---|---|---|---|
| GET | `/students` | Get all students | 200 OK |
| GET | `/students/{studentId}` | Get one student | 200 OK |
| POST | `/students` | Add a student | 201 Created |
| PUT | `/students/{studentId}` | Update a student | 200 OK |
| DELETE | `/students/{studentId}` | Delete a student | 204 No Content |

Missing student IDs return `404 Not Found`. POST and PUT accept JSON request bodies.
Student IDs are read using `@PathVariable`.

## Test with curl

### 1. Get all students

```bash
curl http://localhost:8080/students
```

### 2. Get student ID 1

```bash
curl http://localhost:8080/students/1
```

### 3. Add a student (201 Created)

```bash
curl -i -X POST http://localhost:8080/students \
  -H "Content-Type: application/json" \
  -d '{"name":"Amit Patil","email":"amit@example.com","course":"REST API"}'
```

### 4. Update student ID 2 (200 OK)

```bash
curl -i -X PUT http://localhost:8080/students/2 \
  -H "Content-Type: application/json" \
  -d '{"name":"Priya Deshmukh","email":"priya.new@example.com","course":"Advanced Spring Boot"}'
```

### 5. Delete student ID 1 (204 No Content)

```bash
curl -i -X DELETE http://localhost:8080/students/1
```

## Validation

The API rejects blank names, emails, or courses and rejects invalid email addresses
with HTTP 400 Bad Request.
