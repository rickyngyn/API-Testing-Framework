package com.api.testing;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

@Epic("API Testing")
@Feature("User Operations")
@Story("DELETE User")
@Severity(SeverityLevel.TRIVIAL)

public class DeleteUserTest {

    @Test
    public void deleteUserTest() {
        given()
            .baseUri("https://reqres.in")
        .when()
            .delete("/api/users/2")
        .then()
            .statusCode(204);
    }
}
