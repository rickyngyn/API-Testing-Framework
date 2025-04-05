package com.api.testing;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Epic("API Testing")
@Feature("User Operations")
@Story("GET User")
@Severity(SeverityLevel.CRITICAL)
public class GetUserTest {

    @Test
    public void getSingleUserTest() {
        given()
            .baseUri("https://reqres.in")
        .when()
            .get("/api/users/2")
        .then()
            .statusCode(200)
            .body("data.id", equalTo(2));
    }
}
