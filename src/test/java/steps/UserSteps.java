package steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class UserSteps {
    private Response response;

    @Given("que a API está disponível")
    public void apiDisponivel() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @When("eu faço uma requisição GET para {string}")
    public void requisicaoGET(String endpoint) {
        response = get(endpoint);
    }

    @Then("o status da resposta deve ser {int}")
    public void verificarStatus(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @Then("o nome do usuário deve ser {string}")
    public void verificarNome(String nomeEsperado) {
        String nome = response.jsonPath().getString("name");
        assertEquals(nomeEsperado, nome);
    }
}