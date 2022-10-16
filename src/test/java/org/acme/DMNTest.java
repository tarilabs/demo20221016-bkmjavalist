package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DMNTest {

    @Test
    public void testBasePrice() {
        var JSON = """
            {
              "my numbers": [
                1,
                2,
                3
              ]
            }
            """;
        given()
          .body(JSON)
          .contentType(ContentType.JSON)
          .when()
            .post("/sumwithjava")
          .then()
            .statusCode(200)
            .body("'total sum'", is(6));
    }
}
