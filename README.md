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



docs/
   h2-screenshot.png
   postman-screenshot.png



   <img width="1045" height="905" alt="Screenshot 2025-11-17 103914" src="https://github.com/user-attachments/assets/64fc9ae3-5b8c-4967-ab65-9fbee1d69982" />
   <img width="1884" height="1005" alt="Screenshot 2025-11-17 103645" src="https://github.com/user-attachments/assets/9b5ac07d-d4f7-4f4e-b96f-f78fd13c2866" />




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
GitHub: https://github.com/v72107237-lgtm/secureapi/tree/main
LinkedIn: https://www.linkedin.com/in/vaibhavi-gothe-24a5b3212?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app
