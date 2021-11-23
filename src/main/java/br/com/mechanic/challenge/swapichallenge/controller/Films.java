package br.com.mechanic.challenge.swapichallenge.controller;

import br.com.mechanic.challenge.swapichallenge.dto.FilmDto;
import br.com.mechanic.challenge.swapichallenge.dto.FilmsResultDto;
import br.com.mechanic.challenge.swapichallenge.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/films")
public class Films {

    @Autowired
    StarWarsService starWarsService;

    @GetMapping
    public FilmsResultDto getFilms()
    {
        return starWarsService.getFilms();
    }

    @GetMapping("/{id}")
    public FilmDto getFilm( @PathVariable Long id )
    {
        return starWarsService.getFilm(id);
    }

}
