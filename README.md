Here's a README for your GitHub repository [EncurtadorURL](https://github.com/pdrotmz/EncurtadorURL):

---

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

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

This README provides a comprehensive overview of your project, including setup instructions, API usage, and contribution guidelines. Make sure to update the details as necessary, especially the configuration section, to match your project's setup.
