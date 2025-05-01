# AI-code-generator

A Spring Boot web application showcasing the AI landscape with interactive content and comprehensive error handling.

## Overview

The AI-code-generator is a modern web application built with Spring Boot that provides an interactive platform to explore and understand the AI landscape. The application features:

- **Interactive UI**: A clean, responsive interface built with Bootstrap 5
- **AI Information Sections**: Detailed sections covering:
  - Machine Learning fundamentals
  - Natural Language Processing
  - Computer Vision
- **Robust Error Handling**: Comprehensive exception handling with user-friendly error pages
- **Performance Optimized**: Includes server-side optimizations for better user experience

## How to Run the Application

### Prerequisites

Before running the application, ensure you have the following installed:
- Java Development Kit (JDK) 17 or later
- Maven 3.6.x or later
- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

### Steps to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Aravind-pi/AI-code-generator.git
   cd AI-code-generator
   ```

2. **Build the Application**
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```
   Or run the JAR file directly:
   ```bash
   java -jar target/ai-landscape-1.0.0.jar
   ```

4. **Access the Application**
   - Open your web browser and navigate to: http://localhost:8080
   - The application will load the home page with AI landscape information

### Configuration

The application can be configured through `src/main/resources/application.properties`:
- Server port (default: 8080)
- Performance settings (compression, caching)
- Error handling configurations

## How to Contribute

We welcome contributions from the community! Here's how you can contribute to the project:

### Development Workflow

1. **Fork the Repository**
   - Visit the [repository page](https://github.com/Aravind-pi/AI-code-generator)
   - Click the 'Fork' button to create your copy

2. **Clone Your Fork**
   ```bash
   git clone https://github.com/YOUR_USERNAME/AI-code-generator.git
   ```

3. **Create a Feature Branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

4. **Development Guidelines**
   - Follow Java code style guidelines
   - Write clean, documented code
   - Include appropriate unit tests
   - Update documentation as needed

5. **Testing**
   - Run existing tests: `mvn test`
   - Add new tests for new features
   - Ensure all tests pass before submitting

6. **Commit Changes**
   ```bash
   git add .
   git commit -m "Description of your changes"
   ```

7. **Submit a Pull Request**
   - Push your changes to your fork
   - Create a Pull Request from your feature branch
   - Provide a clear description of the changes
   - Reference any related issues

### Code Structure

- `src/main/java/com/aravind/ailandscape/`: Main application code
  - `controller/`: Web controllers
  - `exception/`: Error handling
- `src/main/resources/`:
  - `templates/`: HTML templates
  - `static/`: CSS and static assets

### Branching Strategy

- `master`: Stable production code
- `develop`: Development branch
- `release/*`: Release branches
- `feature/*`: Feature branches
- `bugfix/*`: Bug fix branches

### Getting Help

- Create an issue for bugs or feature requests
- Join discussions in existing issues
- Review the documentation

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgments

- Spring Boot community
- Bootstrap team
- All contributors