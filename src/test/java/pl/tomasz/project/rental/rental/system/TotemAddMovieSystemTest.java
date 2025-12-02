package pl.tomasz.project.rental.rental.system;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pl.tomasz.project.rental.rental.domain.MovieDto;
import pl.tomasz.project.rental.rental.interfaces.MovieType;
import java.util.ArrayList;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TotemAddMovieSystemTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    // Teste 1: Cadastro com Sucesso (Caminho Feliz)
    @Test
    public void shouldRegisterMovieViaTotemSuccess() throws Exception {
        MovieDto movie = new MovieDto(null, "Avatar 3", MovieType.NEW_MOVIE, "Sci-Fi", 2025, true, new ArrayList<>());
        mockMvc.perform(post("/movies")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(movie)))
                .andExpect(status().isOk());
    }

    // Teste 2: Cadastro de Filme Antigo (Verifica se o sistema aceita filmes velhos no totem)
    @Test
    public void shouldRegisterOldMovieViaTotem() throws Exception {
        MovieDto movie = new MovieDto(null, "Titanic", MovieType.OLD_MOVIE, "Romance", 1997, true, new ArrayList<>());
        mockMvc.perform(post("/movies")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(movie)))
                .andExpect(status().isOk());
    }

    // Teste 3: Cadastro com JSON Incompleto (Simula falha de rede ou bug no totem)
    // Espera erro 400 (Bad Request) pois o JSON está vazio "{}"
    @Test
    public void shouldFailWhenSendingEmptyJson() throws Exception {
        mockMvc.perform(post("/movies")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}")) 
                .andExpect(status().isBadRequest()); // O Spring valida o corpo da requisição
    }
}