package br.com.mechanic.challenge.swapichallenge.service;

import br.com.mechanic.challenge.swapichallenge.dto.*;

public interface StarWarsService {

    public FilmsResultDto getFilms();

    public FilmDto getFilm(Long id);

    public PeopleResultDto getPeople();

    public PeopleDto getPeopleByCode(Long id);

    public PlanetResultDto getPlanets();

    public PlanetDto getPlanet(Long id);

}
