package br.com.mechanic.challenge.swapichallenge.service;

import br.com.mechanic.challenge.swapichallenge.dto.FilmDto;
import br.com.mechanic.challenge.swapichallenge.dto.FilmsResultDto;
import br.com.mechanic.challenge.swapichallenge.model.Film;
import br.com.mechanic.challenge.swapichallenge.model.FilmsResult;
import br.com.mechanic.challenge.swapichallenge.restClient.StarWarsApiClient;
import br.com.mechanic.challenge.swapichallenge.service.impl.StarWarsServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static br.com.mechanic.challenge.swapichallenge.utils.FilmsResultUtils.*;
import static br.com.mechanic.challenge.swapichallenge.utils.FilmUtils.*;

@ExtendWith(MockitoExtension.class)
public class SwApiChallengeServiceTests {

    @Mock
    private static StarWarsApiClient starWarsApiClient;

    @InjectMocks
    private static StarWarsService starWarsService;

    @BeforeAll
    public static void setUp() throws Exception {
        starWarsService = new StarWarsServiceImpl(starWarsApiClient);
    }

    @Test
    void testGivenNoDataThenReturnAllFilmsRegistered() {

        FilmsResult expectedRegisteredFilmsResult = createFakeFilmsResultModel();
        FilmsResultDto filmsResultDto = createFakeFilmsResultDto();

        when(starWarsApiClient.getFilms()).thenReturn(expectedRegisteredFilmsResult);

        FilmsResultDto expectedFilmsResultDto = starWarsService.getFilms();

        assertFalse(expectedFilmsResultDto.getResultados().isEmpty());
        assertEquals(expectedFilmsResultDto.getContagem(), filmsResultDto.getContagem());
    }

    @Test
    void testGivenValidFilmIdThenReturnThisFilm()  {

        Film expectedRegisteredFilm = createFakeFilmModel();
        FilmDto expectedFilmDto = createFakeFilmDto();
        Long filmIdToGet = 1l;

        when(starWarsApiClient.getFilm(filmIdToGet)).thenReturn(expectedRegisteredFilm);

        FilmDto receivedFilmDto = starWarsService.getFilm(filmIdToGet);

        assertEquals(receivedFilmDto, expectedFilmDto);
    }

    @Test
    void testGivenInvalidFilmIdThenThrowException() {
        var invalidFilmId = 1000L;
        when(starWarsApiClient.getFilm(invalidFilmId))
                .thenThrow(feign.FeignException.NotFound.class);

        assertThrows(feign.FeignException.NotFound.class, () -> starWarsService.getFilm(invalidFilmId));
    }

}
