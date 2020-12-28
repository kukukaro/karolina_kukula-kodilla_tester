package com.kodilla.rest.service;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class RestAssuredTest {

    @Test
    public void someTest() {
        RestAssured.baseURI = "https://ta-ebookrental-be.herokuapp.com";

        RestAssured
                .given()
                .basePath("titles")
                .queryParam("userId", "11388")
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .extract().response().prettyPrint();

    }
}
