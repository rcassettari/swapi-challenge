package br.com.mechanic.challenge.swapichallenge.utils;

import br.com.mechanic.challenge.swapichallenge.dto.FilmDto;
import br.com.mechanic.challenge.swapichallenge.dto.FilmsResultDto;
import br.com.mechanic.challenge.swapichallenge.model.Film;
import br.com.mechanic.challenge.swapichallenge.model.FilmsResult;

import java.util.Arrays;
import java.util.List;

public class FilmsResultUtils {

    private static final Integer COUNT = 1;
    private static final String NEXT = null;
    private static final String PREVIOUS = null;
    private static final List<Film> RESULTS = Arrays.asList(
            FilmUtils.createFakeFilmModel()
    );
    private static final List<FilmDto> RESULTSDTO = Arrays.asList(
            FilmUtils.createFakeFilmDto()
    );

    public static FilmsResult createFakeFilmsResultModel() {
        FilmsResult filmsResult = new FilmsResult();
        filmsResult.setCount(COUNT);
        filmsResult.setNext(NEXT);
        filmsResult.setPrevious(PREVIOUS);
        filmsResult.setResults(RESULTS);
        return filmsResult;
    }

    public static FilmsResultDto createFakeFilmsResultDto() {
        FilmsResultDto filmsResultDto = new FilmsResultDto();
        filmsResultDto.setContagem(COUNT);
        filmsResultDto.setProximo(NEXT);
        filmsResultDto.setAnterior(PREVIOUS);
        filmsResultDto.setResultados(RESULTSDTO);
        return filmsResultDto;
    }

}

