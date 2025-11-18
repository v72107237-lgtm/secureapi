🔐 Secure API (Spring Boot + H2 Database)

A simple, production-style Java Spring Boot REST API that stores and retrieves user data using an in-memory H2 database.
This project demonstrates:

REST API design

JSON request/response handling

Spring Data JPA

H2 database

Docker support

Clean Model → Controller → Repository flow

This matches typical backend tasks used in cloud & compute engineering roles.

🚀 Features

Add a user (email + role)

Get all users

Auto-created H2 database (in-memory)

JPA entity mapping

Simple layered backend architecture

Dockerized Spring Boot app

🛠️ Tech Stack

Java 17 (or your version)

Spring Boot

Spring Web

Spring Data JPA

H2 Database

Maven

Docker

📌 API Endpoints


➤ Create User
POST /api/users

Request Body:
{
  "email": "vaibhavi@example.com",
  "role": "DEVELOPER"
}

Response:
{
  "id": 1,
  "email": "vaibhavi@example.com",
  "role": "DEVELOPER"
}

➤ Get All Users
GET /api/users

Example Response:
[
  {
    "id": 1,
    "email": "vaibhavi@example.com",
    "role": "DEVELOPER"
  }
]

🗄️ Database (H2 Console)

H2 Console URL:

http://localhost:8080/h2-console


JDBC URL:

jdbc:h2:mem:testdb


Tables:

APP_USERS


📁 Project Structure
src/main/java/com/vaibhavi/secureapi
│── model/AppUser.java
│── controller/AppUserController.java
│── repository/AppUserRepository.java
│── SecureApiApplication.java
src/main/resources
│── application.yaml
Dockerfile
README.md

▶️ Run Locally
1. Run using Maven
mvn spring-boot:run


API runs at:

http://localhost:8080

🐳 Run with Docker

Build:

docker build -t secureapi .


Run:

docker run -p 8080:8080 secureapi

🧪 Example Usage (cURL)

Get all users:

curl -X GET http://localhost:8080/api/users


Create user:

curl -X POST http://localhost:8080/api/users \
-H "Content-Type: application/json" \
-d '{"email":"vaibhavi@example.com","role":"DEVELOPER"}'

🔮 Future Enhancements

Add PUT/DELETE

Add validation

Add exception handlers

Swagger (OpenAPI)

Switch H2 → PostgreSQL

Add authentication (JWT)

👤 Author

Vaibhavi Gothe
Backend Developer | Java | SQL | REST APIs
GitHub: your link
LinkedIn: your link
