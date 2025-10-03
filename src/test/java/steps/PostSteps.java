package steps;


import io.cucumber.java.pt.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class PostSteps {

    private final TestContext context;

    // injeção do mesmo contexto
    public PostSteps(TestContext context) {
        this.context = context;
    }

    private Response response;

    @Quando("eu faço uma requisição POST para {string} com o corpo:")
    public void euFacoUmaRequisicaoPOSTParaComOCorpo(String endpoint, String body) {
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(body)
                .post(endpoint);
        context.setResponse(response);
    }

    @E("o título do post na resposta deve ser {string}")
    public void oTituloDoPostNaRespostaDeveSer(String tituloEsperado) {
        String titulo = context.getResponse().jsonPath().getString("title");
        assertEquals(tituloEsperado, titulo);
    }

    @E("o userId deve ser {int}")
    public void oUserIdDeveSer(int userIdEsperado) {
        int userId = context.getResponse().jsonPath().getInt("userId");
        assertEquals(userIdEsperado, userId);
    }


}
