// src/test/java/steps/Hooks.java
package steps;

import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;

public class Hooks {

    @BeforeAll
    public static void setup() {
        System.out.println("✅ Configurando BaseURI global...");
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}