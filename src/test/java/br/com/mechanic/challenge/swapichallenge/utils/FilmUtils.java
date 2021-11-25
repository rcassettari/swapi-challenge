package br.com.mechanic.challenge.swapichallenge.utils;

import br.com.mechanic.challenge.swapichallenge.dto.FilmDto;
import br.com.mechanic.challenge.swapichallenge.model.Film;

import java.util.Arrays;
import java.util.List;

public class FilmUtils {

    private static final String TITLE = "A New Hope";
    private static final Integer EPISODE_ID = 4;
    private static final String OPENING_CRAWL = "It is a period of civil war.\r\nRebel spaceships, " +
            "striking\r\nfrom a hidden base, have won\r\ntheir first victory against\r\nthe evil Galactic " +
            "Empire.\r\n\r\nDuring the battle, Rebel\r\nspies managed to steal secret\r\nplans to the " +
            "Empire's\r\nultimate weapon, the DEATH\r\nSTAR, an armored space\r\nstation with enough " +
            "power\r\nto destroy an entire planet.\r\n\r\nPursued by the Empire's\r\nsinister agents, " +
            "Princess\r\nLeia races home aboard her\r\nstarship, custodian of the\r\nstolen plans that can " +
            "save her\r\npeople and restore\r\nfreedom to the galaxy....";
    private static final String DIRECTOR = "George Lucas";
    private static final String PRODUCER = "Gary Kurtz, Rick McCallum";
    private static final String RELEASE_DATE = "1977-05-25";
    private static final List<String> CHARACTERS = Arrays.asList(
            "https://swapi.dev/api/people/1/",
            "https://swapi.dev/api/people/2/",
            "https://swapi.dev/api/people/3/",
            "https://swapi.dev/api/people/4/",
            "https://swapi.dev/api/people/5/",
            "https://swapi.dev/api/people/6/",
            "https://swapi.dev/api/people/7/",
            "https://swapi.dev/api/people/8/",
            "https://swapi.dev/api/people/9/",
            "https://swapi.dev/api/people/10/",
            "https://swapi.dev/api/people/12/",
            "https://swapi.dev/api/people/13/",
            "https://swapi.dev/api/people/14/",
            "https://swapi.dev/api/people/15/",
            "https://swapi.dev/api/people/16/",
            "https://swapi.dev/api/people/18/",
            "https://swapi.dev/api/people/19/",
            "https://swapi.dev/api/people/81/"
            );
    private static final List<String> PLANETS = Arrays.asList(
            "https://swapi.dev/api/planets/1/",
            "https://swapi.dev/api/planets/2/",
            "https://swapi.dev/api/planets/3/"
            );
    private static final List<String> STARSHIPS = Arrays.asList(
            "https://swapi.dev/api/starships/2/",
            "https://swapi.dev/api/starships/3/",
            "https://swapi.dev/api/starships/5/",
            "https://swapi.dev/api/starships/9/",
            "https://swapi.dev/api/starships/10/",
            "https://swapi.dev/api/starships/11/",
            "https://swapi.dev/api/starships/12/",
            "https://swapi.dev/api/starships/13/"
            );
    private static final List<String> VEHICLES = Arrays.asList(
            "https://swapi.dev/api/vehicles/4/",
            "https://swapi.dev/api/vehicles/6/",
            "https://swapi.dev/api/vehicles/7/",
            "https://swapi.dev/api/vehicles/8/"
            );
    private static final List<String> SPECIES = Arrays.asList(
            "https://swapi.dev/api/species/1/",
            "https://swapi.dev/api/species/2/",
            "https://swapi.dev/api/species/3/",
            "https://swapi.dev/api/species/4/",
            "https://swapi.dev/api/species/5/"
            );
    private static final String CREATED = "2014-12-10T14:23:31.880000Z";
    private static final String EDITED = "2014-12-20T19:49:45.256000Z";
    private static final String URL = "https://swapi.dev/api/films/1/";

    public static Film createFakeFilmModel() {
        Film film = new Film();
        film.setTitle(TITLE);
        film.setEpisodeId(EPISODE_ID);
        film.setOpeningCrawl(OPENING_CRAWL);
        film.setDirector(DIRECTOR);
        film.setProducer(PRODUCER);
        film.setReleaseDate(RELEASE_DATE);
        film.setCharacters(CHARACTERS);
        film.setPlanets(PLANETS);
        film.setStarships(STARSHIPS);
        film.setVehicles(VEHICLES);
        film.setSpecies(SPECIES);
        film.setCreated(CREATED);
        film.setEdited(EDITED);
        film.setUrl(URL);
        return film;
    }

    public static FilmDto createFakeFilmDto() {
        FilmDto filmDto = new FilmDto();
        filmDto.setTitulo(TITLE);
        filmDto.setEpisodioCodigo(EPISODE_ID);
        filmDto.setPrologo(OPENING_CRAWL);
        filmDto.setDiretor(DIRECTOR);
        filmDto.setProdutor(PRODUCER);
        filmDto.setDataEntrega(RELEASE_DATE);
        filmDto.setPersonagens(CHARACTERS);
        filmDto.setPlanetas(PLANETS);
        filmDto.setNavesEspaciais(STARSHIPS);
        filmDto.setVeiculos(VEHICLES);
        filmDto.setEspecies(SPECIES);
        filmDto.setDataCriacao(CREATED);
        filmDto.setDataEdicao(EDITED);
        filmDto.setUrl(URL);
        return filmDto;
    }

}
