package pl.tomasz.project.rental.rental.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.tomasz.project.rental.rental.interfaces.MovieType;
import pl.tomasz.project.rental.rental.mapper.MovieMapper;
import pl.tomasz.project.rental.rental.repository.MovieRepository;
import pl.tomasz.project.rental.rental.repository.RentedMoviesRepository;
import pl.tomasz.project.rental.rental.repository.UserRepository;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MovieServiceLogicTest {

    private MovieService movieService;
    @Mock private MovieRepository movieRepository;
    @Mock private UserRepository userRepository;
    @Mock private RentedMoviesRepository rentedMoviesRepository;
    @Mock private RentedMovieService rentedMovieService;

    @Before
    public void setUp() {
        movieService = new MovieService(new MovieMapper(), movieRepository, userRepository, rentedMoviesRepository, rentedMovieService);
    }

    // Teste 1: Lógica de Preço para Filmes Novos (Dias * Preço Base)
    @Test
    public void shouldCalculatePriceForNewMoviesCorrectly() {
        // New Movie (assume-se base alta). Ex: 5 dias
        int price = movieService.priceOfMovie(MovieType.NEW_MOVIE, 5);
        assertEquals(40, price); // Verifique se 40 é o valor correto na sua lógica atual
    }

    // Teste 2: Lógica de Preço para Filmes Antigos
    @Test
    public void shouldCalculatePriceForOldMoviesCorrectly() {
        int price = movieService.priceOfMovie(MovieType.OLD_MOVIE, 5);
        assertEquals(20, price); // Verifique se 20 é o valor correto
    }

    // Teste 3: Lógica de Preço Zero (0 Dias)
    @Test
    public void shouldReturnZeroForZeroDays() {
        int price = movieService.priceOfMovie(MovieType.NEW_MOVIE, 0);
        assertEquals(0, price);
    }
}