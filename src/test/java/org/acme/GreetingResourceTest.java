package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void test1() {
        given()
          .when()
          .contentType(ContentType.JSON)
          .body("{}")
          .post("/hello")
          .then()
             .statusCode(200)
             .body(is(""));
    }

}