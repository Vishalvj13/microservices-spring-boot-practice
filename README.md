# Microservices Practice Project (Spring Boot & Spring Cloud)

This project is a hands-on practice for building microservices using **Spring Boot** and **Spring Cloud**. It includes multiple services, an API Gateway for centralized routing, and Eureka for service discovery.

## 🚀 Features
- **Spring Boot Microservices** (Quiz Service, Question Service, etc.)
- **API Gateway** using Spring Cloud Gateway
- **Eureka Service Registry & Discovery**
- **Inter-service Communication** via Feign Clients
- **Load Balancing** with Eureka and Gateway
- **Postman Collection** for API Testing

## 📂 Project Structure
```
├── api-gateway/               # API Gateway for routing requests
├── service-registry/          # Eureka Server for service discovery
├── quiz-service/              # Microservice handling quizzes
├── question-service/          # Microservice handling questions
├── postman-collection/        # Postman collection for API testing
└── README.md                  # Project documentation
```

## ⚙️ Setup & Running the Project

### 1️⃣ Prerequisites
- Java 17+ (Ensure compatibility with your Spring Boot version)
- Maven 3.8+
- Postman (optional, for API testing)

### 2️⃣ Clone the Repository
```sh
git clone https://github.com/your-username/microservices-spring-boot-practice.git
cd microservices-spring-boot-practice
```

### 3️⃣ Start Service Registry (Eureka Server)
```sh
cd ServiceRegistry
mvn spring-boot:run
```

### 4️⃣ Start API Gateway
```sh
cd ApiGateway
mvn spring-boot:run
```

### 5️⃣ Start Microservices
Start each service in separate terminals:
```sh
cd QuizService
mvn spring-boot:run
```
```sh
cd QuestionService
mvn spring-boot:run
```

### 6️⃣ Test APIs via Postman
- Import the Postman collection from `Microservices.postman_collection.json`
- Use API Gateway endpoints mentioned above.

## 📌 API Endpoints
| Service | Endpoint | Description |
|---------|---------|-------------|
| Quiz Service | `/quiz/**` | Get quiz details |
| Question Service | `/question/**` | Get question details |

## 🛠️ Configuration
### **application.properties (Quiz Service, Question Service)**
```properties
#db-properties      - Defines the database connection details, such as URL, username, and password.
#jpa-properties     - Configures Hibernate for schema handling, SQL logging, and dialect settings.
#eureka-properties  - Manages service registration and discovery with Eureka.
```
### **application.properties (Service Registry)**
```properties
#eureka-properties  - Manages service registration and discovery with Eureka and ensures the service registers with Eureka for discovery but does not act as a client itself.
```
### **application.properties (API Gateway)**
```properties
#route-configuration  -  API Gateway route configuration for directing requests to the Quiz and Question services.
```

