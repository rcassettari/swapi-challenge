package br.com.mechanic.challenge.swapichallenge.service.impl;

import br.com.mechanic.challenge.swapichallenge.dto.*;
import br.com.mechanic.challenge.swapichallenge.mapper.FilmMapper;
import br.com.mechanic.challenge.swapichallenge.mapper.PeopleMapper;
import br.com.mechanic.challenge.swapichallenge.mapper.PlanetMapper;
import br.com.mechanic.challenge.swapichallenge.restClient.StarWarsApiClient;
import br.com.mechanic.challenge.swapichallenge.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarWarsServiceImpl implements StarWarsService {

    private StarWarsApiClient starWarsApiClient;

    private final FilmMapper filmMapper = FilmMapper.INSTANCE;

    @Autowired
    private PeopleMapper peopleMapper;

    @Autowired
    private PlanetMapper planetMapper;

    @Autowired
    public StarWarsServiceImpl( StarWarsApiClient starWarsApiClient)
    {
        this.starWarsApiClient = starWarsApiClient;
    }

    @Override
    public FilmsResultDto getFilms() {
        return filmMapper.modelsToDtos(starWarsApiClient.getFilms());
    }

    @Override
    public FilmDto getFilm(Long id) {
        return filmMapper.filmToFilmDto(starWarsApiClient.getFilm(id));
    }

    @Override
    public PeopleResultDto getPeople() {
        return peopleMapper.modelsToDtos(starWarsApiClient.getPeople());
    }

    @Override
    public PeopleDto getPeopleByCode(Long id) {
        return peopleMapper.peopleToPeopleDto(starWarsApiClient.getPeopleByCode(id));
    }

    @Override
    public PlanetResultDto getPlanets() {
        return planetMapper.modelsToDtos(starWarsApiClient.getPlanets());
    }

    @Override
    public PlanetDto getPlanet(Long id) {
        return planetMapper.planetToPlanetDto(starWarsApiClient.getPlanet(id));
    }
}
