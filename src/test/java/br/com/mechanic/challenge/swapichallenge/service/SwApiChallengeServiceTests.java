package br.com.mechanic.challenge.swapichallenge.service;

import br.com.mechanic.challenge.swapichallenge.dto.FilmsResultDto;
import br.com.mechanic.challenge.swapichallenge.model.FilmsResult;
import br.com.mechanic.challenge.swapichallenge.restClient.StarWarsApiClient;
import br.com.mechanic.challenge.swapichallenge.service.impl.StarWarsServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;
import static br.com.mechanic.challenge.swapichallenge.utils.FilmsResultUtils.*;

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

}
