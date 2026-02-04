# 🧾 Order Management System – Spring Boot CRUD REST API

## 📌 Project Overview

The Order Management System is a Spring Boot-based RESTful application designed to perform complete CRUD (Create, Read, Update, Delete) operations on order data. This project demonstrates how to build a scalable backend service using industry-standard layered architecture including Controller, Service, Repository, and Entity layers.

The application interacts with a MySQL database using Spring Data JPA and Hibernate, enabling seamless data persistence without writing complex SQL queries. It follows best practices for clean code, maintainability, and real-world backend development.

---

## 🚀 Features

✔ Create new orders
✔ Retrieve all orders
✔ Get order details by ID
✔ Update existing orders
✔ Delete orders
✔ RESTful API design
✔ Layered architecture for better code organization
✔ Automatic table creation using Hibernate
✔ Proper HTTP responses using ResponseEntity

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Maven
* Lombok
* Postman (for API testing)

---

## 📂 Project Architecture

The project follows a structured layered architecture:

```
com.example.order_management
│
├── controller   → Handles client requests and returns responses  
├── service      → Contains business logic  
├── repository   → Communicates with the database  
├── entity       → Represents database tables  
```

This architecture improves code readability, scalability, separation of concerns, and maintainability.

---

## ⚙️ Setup & Installation

### ✅ Prerequisites

Make sure the following are installed:

* Java 17 or higher
* Maven
* MySQL Server
* IntelliJ / Eclipse
* Postman (optional but recommended)

---

### ✅ Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/order-management.git
cd order-management
```

---

### ✅ Database Setup

Create a MySQL database:

```sql
CREATE DATABASE order_db;
```

---

### ✅ Configure Application Properties

Navigate to:

```
src/main/resources/application.properties
```

Update with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/order_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### ✅ Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main class:

```
OrderManagementApplication.java
```

The server will start at:

```
http://localhost:8080
```

Hibernate will automatically create the required table.

---

## 📬 API Endpoints

| Method | Endpoint       | Description              |
| ------ | -------------- | ------------------------ |
| POST   | `/orders`      | Create a new order       |
| GET    | `/orders`      | Retrieve all orders      |
| GET    | `/orders/{id}` | Retrieve order by ID     |
| PUT    | `/orders/{id}` | Update an existing order |
| DELETE | `/orders/{id}` | Delete an order          |

---

## 🧪 Sample Request (POST)

**URL:**

```
POST http://localhost:8080/orders
```

**Body:**

```json
{
  "productName": "Laptop",
  "quantity": 2,
  "price": 75000
}
```

---

## ✅ Expected Outcome

* Orders are stored in MySQL.
* APIs can be tested using Postman.
* Data persistence is handled automatically by JPA.

---

## 🔥 Key Learning Outcomes

* Building REST APIs using Spring Boot
* Database integration with JPA/Hibernate
* Implementing layered backend architecture
* Using Dependency Injection
* Designing professional APIs
* Testing APIs with Postman

---

## ⭐ Future Enhancements

* Add global exception handling
* Implement request validation
* Integrate Swagger for API documentation
* Add authentication & authorization
* Dockerize the application

---

## 📜 License

This project is created for learning purposes and is open for improvements.
