// src/test/java/steps/UserSteps.java
package steps;

import io.cucumber.java.pt.*;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserSteps {

    private final TestContext context;

    public UserSteps(TestContext context) {
        this.context = context; // 👈 agora o mesmo context é injetado
    }

    @Dado("que a API está disponível")
    public void queAApiEstaDisponivel() {
        System.out.println("api disponivel");
    }

    @Quando("eu faço uma requisição GET para {string}")
    public void euFacoUmaRequisicaoGETPara(String endpoint) {
       Response response = RestAssured.get(endpoint);
         context.setResponse(response);
    }

    @Então("o status da resposta deve ser {int}")
    public void oStatusDaRespostaDeveSer(int statusCode) {
        assertEquals(statusCode, context.getResponse().getStatusCode());
    }

    @E("o nome do usuário deve ser {string}")
    public void oNomeDoUsuarioDeveSer(String nomeEsperado) {
        String nome = context.getResponse().jsonPath().getString("name");
        assertEquals(nomeEsperado, nome);
    }

    @E("a resposta deve conter pelo menos {int} comentários")
    public void aRespostaDeveConterPeloMenosXComentarios(int quantidadeMinima) {
        List<?> comentarios = context.getResponse().jsonPath().getList("$");
        assertTrue(comentarios.size() >= quantidadeMinima);
    }

    @E("o título do álbum deve ser {string}")
    public void oTituloDoAlbumDeveSer(String tituloEsperado) {
        String titulo = context.getResponse().jsonPath().getString("title");
        assertEquals(tituloEsperado, titulo);
    }

    @E("a resposta deve conter pelo menos {int} álbum")
    public void aRespostaDeveConterPeloMenosXAlbuns(int quantidadeMinima) {
        List<?> albuns = context.getResponse().jsonPath().getList("$");
        assertTrue(albuns.size() >= quantidadeMinima);
    }
}
