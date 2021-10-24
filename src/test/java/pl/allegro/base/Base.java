package pl.allegro.base;

import io.restassured.response.Response;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;

public abstract class Base {
    public String token;

    @BeforeTest
    public void auth() {
        System.out.println("----Authorization----");
        Response response =
                given()
                        .auth().preemptive().basic("8e4392cd836446eb9cfdd4c56428e6b7", "yMkJTGJ0ynPd7B96vmASLDDn6Pjl3ab7XfQtvLa5jShDNZIqOyB3nVrtGQXuP9xl")
                        .contentType("application/x-www-form-urlencoded")
                        .formParam("grant_type", "client_credentials")
                        .when()
                        .post("https://allegro.pl/auth/oauth/token");

        token = response.jsonPath().get("access_token");
        System.out.println("Token: " + token);
    }

    @AfterTest
    public void tearDown() {
        System.out.println("After test");
    }
}
