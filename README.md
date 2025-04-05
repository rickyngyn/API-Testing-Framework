# API Testing Framework (Postman & REST Assured)

## Project Overview
This project automates API testing using **Postman** and **REST Assured**. It validates the functionality and reliability of public APIs like **ReqRes**. The goal is to ensure that APIs return expected responses under different conditions, including edge cases and error scenarios.

## Project Structure
The project is organized into two main components:
- **Postman-Collections**: Contains exported Postman collections for API testing.
- **src**: Contains Java test scripts using REST Assured to validate API responses.
s
### Example Files:
- `Postman-Collections/`: Postman collection files for testing public APIs.
- `src/`: Contains Java classes with REST Assured test scripts.
    - `CreateUserTest.java`
    - `DeleteUserTest.java`
    - `GetUserTest.java`
    - `UpdateUserTest.java`

## Technologies Used
- **Postman**: For manual API testing and automation via collections.
- **REST Assured**: For automated API testing in Java.
- **JUnit**: For running tests in Java.
- **Maven**: For managing dependencies.

## How to Run the Tests

### Postman Tests:
1. Import the Postman collection into Postman.
2. Run the tests within Postman:
   - Open Postman.
   - Click **Import**, select the collection file, and click **Open**.
   - After importing, select the collection and click **Run** to start executing the tests.

### REST Assured Tests:
1. Clone this repository to your local machine.
2. Set up a Java environment.
3. Use Maven to manage dependencies (check for `pom.xml` in the project).
4. Add the following Maven dependencies to your `pom.xml` file if you're using Maven:
   ```xml
   <dependency>
       <groupId>io.rest-assured</groupId>
       <artifactId>rest-assured</artifactId>
       <version>5.4.0</version>
       <scope>test</scope>
   </dependency>
   <dependency>
       <groupId>org.junit.jupiter</groupId>
       <artifactId>junit-jupiter-engine</artifactId>
       <version>5.10.0</version>
       <scope>test</scope>
   </dependency>
5. Run tests
   ```
   mvn test
