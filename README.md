# Book Store Project

## Overview
The **Book Store Project** demonstrates:
- REST API development
- Microservices architecture
- Inter-service communication using OpenFeign
- Containerization with Docker

The project comprises two microservices:
1. **Book Service**: Manages book inventory.
2. **Order Service**: Places orders and fetches book details via Book Service.

---

## Technologies Used
- **Programming Language**: Java
- **Framework**: Spring Boot 3.4.0
- **Database**: H2 (in-memory)
- **Inter-Service Communication**: OpenFeign
- **Containerization**: Docker
- **Build Tool**: Maven

---

## Features
### Book Service
- Add a new book
- Retrieve all books

### Order Service
- Place an order
- Retrieve book details by communicating with Book Service

---

## Project Structure
```
bookstore/
│
├── book-service/
│   ├── src/main/java/com/example/bookservice/
│   │   ├── BookServiceApplication.java
│   │   ├── controller/BookController.java
│   │   ├── model/Book.java
│   │   ├── repository/BookRepository.java
│   │   └── service/BookService.java
│   ├── src/main/resources/
│   │   └── application.yml
│   └── Dockerfile
│
├── order-service/
│   ├── src/main/java/com/example/orderservice/
│   │   ├── OrderServiceApplication.java
│   │   ├── controller/OrderController.java
│   │   ├── model/Order.java
│   │   └── client/BookClient.java
│   ├── src/main/resources/
│   │   └── application.yml
│   └── Dockerfile
│
└── docker-compose.yml

```

---

## Prerequisites
- OpenJDK 21
- Maven
- Docker & Docker Compose

---

## Getting Started

### 1. Clone the Repository
```bash
git clone <repository-url>
cd bookstore
```

### 2. Build the Applications
```bash
mvn clean package
```

### 3. Start the Containers
```bash
docker-compose up --build
```

---

## API Endpoints

### **Book Service**
| HTTP Method | Endpoint        | Description            |
|-------------|-----------------|------------------------|
| GET         | `/api/books`    | Retrieves all books    |
| POST        | `/api/books`    | Adds a new book        |

**Sample Request Body (POST /api/books)**  
```json
{
  "title": "The Lost Symbol",
  "author": "Dan Brown",
  "price": 350.00
}
```

---

### **Order Service**
| HTTP Method | Endpoint           | Description                      |
|-------------|--------------------|----------------------------------|
| POST        | `/api/orders`      | Places an order for a book       |
| GET         | `/api/orders/books`| Fetches books via Book Service   |

**Sample Request Body (POST /api/orders)**  
```json
{
  "bookId": 1,
  "quantity": 2
}
```

---

## Accessing the Services
- **Book Service**: `http://localhost:8081/api/books`
- **Order Service**: `http://localhost:8082/api/orders`

---

## Testing
- Use Postman or a similar API client to interact with the APIs.
- Verify:
  - Books are added and retrieved correctly in Book Service.
  - Orders are placed successfully in Order Service.
  - Order Service retrieves book details from Book Service.

---

## Future Enhancements
- Replace H2 with a persistent database (e.g., MySQL or PostgreSQL).
- Use RabbitMQ or Kafka for asynchronous communication.
- Add unit and integration tests for comprehensive testing.
- Introduce monitoring with Prometheus and Grafana.

---

## Contributing

This repository is contribution friendly. Refer to [Contribution Guidelines](.github/contributing.md).

---

## License
This project is licensed under the GNU General Public License v3.0

---
