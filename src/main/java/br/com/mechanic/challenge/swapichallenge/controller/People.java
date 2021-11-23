package br.com.mechanic.challenge.swapichallenge.controller;

import br.com.mechanic.challenge.swapichallenge.dto.PeopleDto;
import br.com.mechanic.challenge.swapichallenge.dto.PeopleResultDto;
import br.com.mechanic.challenge.swapichallenge.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class People {

    @Autowired
    StarWarsService starWarsService;

    @GetMapping
    public PeopleResultDto getPeople()
    {
        return starWarsService.getPeople();
    }

    @GetMapping("/{id}")
    public PeopleDto getPeopleByCode( @PathVariable Long id )
    {
        return starWarsService.getPeopleByCode(id);
    }

}