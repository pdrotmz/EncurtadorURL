
![encurtaUrl](https://github.com/user-attachments/assets/9fded2b0-7362-408f-90dc-ef82028e6eee)
![encurtaUrlAprovado](https://github.com/user-attachments/assets/88a2f1d9-7d11-4d82-9e60-7100586936ae)


# EncurtadorURL

EncurtadorURL is a simple URL shortening service built with Spring Boot and Java. It provides an API to shorten long URLs and retrieve the original URLs from the shortened versions. This project demonstrates basic CRUD operations, integration with PostgreSQL, and the use of Docker for containerization.

## Features

- Shorten long URLs
- Retrieve original URLs using short codes
- Dockerized application for easy deployment
- Integration with PostgreSQL database

## Getting Started

### Prerequisites

- JDK 21
- Maven
- Docker
- PostgreSQL

### Running the Application

1. **Clone the repository:**

   ```bash
   git clone https://github.com/pdrotmz/EncurtadorURL.git
   cd EncurtadorURL
   ```

2. **Build the project:**

   ```bash
   mvn clean install
   ```

3. **Run the application:**

   Using Docker:

   ```bash
   docker build -t encurtadorurl .
   docker run -p 8080:8080 encurtadorurl
   ```

   Alternatively, you can run the application directly with Maven:

   ```bash
   mvn spring-boot:run
   ```

### Configuration

The application requires a PostgreSQL database. You can set the database connection details in the `application.properties` file or use environment variables. For example:

```properties
spring.datasource.url=${DATABASE_URL}
spring.datasource.username=${DATABASE_USERNAME}
spring.datasource.password=${DATABASE_PASSWORD}
```

### API Endpoints

- **POST /api/shorten**: Shorten a long URL
- **GET /api/{shortCode}**: Retrieve the original URL using the short code

## Contributing

Feel free to fork this project, submit issues, and send pull requests. Contributions are always welcome!
