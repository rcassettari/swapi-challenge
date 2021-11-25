package br.com.mechanic.challenge.swapichallenge.restClient;

import br.com.mechanic.challenge.swapichallenge.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "${swapiClient.feign.name}", url = "${swapiClient.feign.url}")
public interface StarWarsApiClient {

    @GetMapping("/films")
    public FilmsResult getFilms();

    @GetMapping("/films/{id}")
    public Film getFilm(@PathVariable Long id);

    @GetMapping("/people")
    public PeopleResult getPeople();

    @GetMapping("/people/{id}")
    public People getPeopleByCode(@PathVariable Long id);

    @GetMapping("/planets")
    public PlanetResult getPlanets();

    @GetMapping("/planets/{id}")
    public Planet getPlanet(@PathVariable Long id);

}
