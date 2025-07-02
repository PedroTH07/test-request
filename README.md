# Test Request API

This is a test API project where you can send requests using the four main HTTP methods: **GET**, **POST**, **PUT** and **DELETE**.

![API Status](https://img.shields.io/badge/Test%20API-Ready%20to%20Request-green?style=for-the-badge&logo=server)

> Try sending GET ✅, POST ✍️, PUT ♻️ and DELETE ❌ to see how this API responds!


## Endpoints

| Request                                     | Response                                                                                  |
|---------------------------------------------|-------------------------------------------------------------------------------------------|
| `GET /api`                                  | Status code: **200**,<br/> body: `{ "message" : "ok" }`                                   |
| `POST /api` <br/> <br/>`Body: { any json }` | Status code: **200**, <br/> body: `{ id: (random number 1 - 10), data: <original body> }` |
| `PUT /api` <br/> <br/> `Body: { any json }` | Status code: **204**  (No Content)                                                        |
| `DELETE /api/**`                            | Status code: **204**  (No Content)                                                        |

## 🚀 How to run on your machine

### 📦 Prerequisites

- Java 21

### 🛠️ Build

1. clone the repository
```bash
git clone https://github.com/PedroTH07/test-request.git
cd test-request
```

2. Run the project using the Maven Wrapper
```bash
./mvnw spring-boot:run
```

The application will run on `localhost:8080`