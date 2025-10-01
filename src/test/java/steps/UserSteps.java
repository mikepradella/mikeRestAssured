// src/test/java/steps/UserSteps.java
package steps;

import io.cucumber.java.pt.*;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserSteps {
    private Response response;

    @Dado("que a API está disponível")
    public void queAApiEstaDisponivel() {
        System.out.println("api disponivel");
    }

    @Quando("eu faço uma requisição GET para {string}")
    public void euFacoUmaRequisicaoGETPara(String endpoint) {
        response = RestAssured.get(endpoint);
    }

    @Então("o status da resposta deve ser {int}")
    public void oStatusDaRespostaDeveSer(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @E("o nome do usuário deve ser {string}")
    public void oNomeDoUsuarioDeveSer(String nomeEsperado) {
        String nome = response.jsonPath().getString("name");
        assertEquals(nomeEsperado, nome);
    }

    @E("a resposta deve conter pelo menos {int} comentários")
    public void aRespostaDeveConterPeloMenosXComentarios(int quantidadeMinima) {
        List<?> comentarios = response.jsonPath().getList("$");
        assertTrue(comentarios.size() >= quantidadeMinima);
    }

    @E("o título do álbum deve ser {string}")
    public void oTituloDoAlbumDeveSer(String tituloEsperado) {
        String titulo = response.jsonPath().getString("title");
        assertEquals(tituloEsperado, titulo);
    }

    @E("a resposta deve conter pelo menos {int} álbum")
    public void aRespostaDeveConterPeloMenosXAlbuns(int quantidadeMinima) {
        List<?> albuns = response.jsonPath().getList("$");
        assertTrue(albuns.size() >= quantidadeMinima);
    }
}
