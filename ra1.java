package org.example.RestAssured1;

import io.restassured.RestAssured;

public class ra1 {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().get().then().statusCode(201);
    }

}
