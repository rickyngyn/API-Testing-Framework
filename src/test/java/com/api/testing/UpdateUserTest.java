package com.api.testing;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Epic("API Testing")
@Feature("User Operations")
@Story("PUT Update User")
@Severity(SeverityLevel.MINOR)

public class UpdateUserTest {
    @Test
    public void updateUserTest() {
        given()
            .baseUri("https://reqres.in")
            .header("Content-Type", "application/json")
            .body("{ \"name\": \"John\", \"job\": \"manager\" }")
        .when()
            .put("/api/users/2")
        .then()
            .statusCode(200)
            .body("job", equalTo("manager"));
    }
}
