package com.api.testing;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Epic("API Testing")
@Feature("User Operations")
@Story("POST Create User")
@Severity(SeverityLevel.NORMAL)

public class CreateUserTest {
    @Test
    public void createUserTest() {
        given()
            .baseUri("https://reqres.in")
            .header("Content-Type", "application/json")
            .body("{ \"name\": \"John\", \"job\": \"developer\" }")
        .when()
            .post("/api/users")
        .then()
            .statusCode(201)
            .body("name", equalTo("John"))
            .body("job", equalTo("developer"));
    }
}
