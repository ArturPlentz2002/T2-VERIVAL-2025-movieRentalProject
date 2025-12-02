package pl.tomasz.project.rental.rental.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerErrorTest {

    @Autowired
    private MockMvc mockMvc;

    // Teste 1: Buscar filme que não existe (ID inexistente)
    // Espera 404 Not Found ou 200 vazio (dependendo da sua implementação)
    @Test
    public void shouldHandleNonExistentMovieId() throws Exception {
        mockMvc.perform(get("/movies/999999"))
                .andExpect(status().isOk()); // Ajuste para isNotFound() se sua API retornar 404
    }

    // Teste 2: Rota Inválida (Erro 404 do servidor)
    @Test
    public void shouldReturn404ForInvalidRoute() throws Exception {
        mockMvc.perform(get("/rota-que-nao-existe"))
                .andExpect(status().isNotFound());
    }

    // Teste 3: Método HTTP Incorreto (Tentar DELETAR na rota de listar)
    @Test
    public void shouldReturn405ForMethodNotAllowed() throws Exception {
        // Tenta fazer um DELETE na rota raiz /movies (geralmente não permitido sem ID)
        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete("/movies"))
                .andExpect(status().isMethodNotAllowed());
    }
}