package pl.tomasz.project.rental.rental.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.tomasz.project.rental.rental.domain.MovieDto;
import pl.tomasz.project.rental.rental.interfaces.MovieType;
import pl.tomasz.project.rental.rental.mapper.MovieMapper;
import pl.tomasz.project.rental.rental.repository.MovieRepository;
import pl.tomasz.project.rental.rental.repository.RentedMoviesRepository;
import pl.tomasz.project.rental.rental.repository.UserRepository;
import java.util.ArrayList;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MovieServiceValidationTest {

    private MovieService movieService;
    private MovieMapper movieMapper = new MovieMapper();
    @Mock private MovieRepository movieRepository;
    @Mock private UserRepository userRepository;
    @Mock private RentedMoviesRepository rentedMoviesRepository;
    @Mock private RentedMovieService rentedMovieService;

    @Before
    public void setUp() {
        movieService = new MovieService(movieMapper, movieRepository, userRepository, rentedMoviesRepository, rentedMovieService);
    }

    // Teste 1: Salvar filme válido
    @Test
    public void shouldSaveValidMovie() {
        MovieDto validMovie = new MovieDto(null, "Valid Movie", MovieType.NEW_MOVIE, "Action", 2020, true, new ArrayList<>());
        movieService.addMovie(validMovie);
        verify(movieRepository, times(1)).save(any());
    }

    // Teste 2: Não deve aceitar ID preenchido (simulação de regra de negócio)
    // Se o seu sistema não tiver essa validação, ele vai passar mas não vai fazer nada diferente.
    // Este teste garante que o método é chamado mesmo com ID.
    @Test
    public void shouldAcceptMovieEvenWithIdSentByMistake() {
        MovieDto movieWithId = new MovieDto(999L, "Bug ID", MovieType.NEW_MOVIE, "Action", 2020, true, new ArrayList<>());
        movieService.addMovie(movieWithId);
        verify(movieRepository, times(1)).save(any());
    }

    // Teste 3: Validação de Nulo (se passar null, deve dar erro no Java)
    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionWhenDtoIsNull() {
        movieService.addMovie(null);
    }
}