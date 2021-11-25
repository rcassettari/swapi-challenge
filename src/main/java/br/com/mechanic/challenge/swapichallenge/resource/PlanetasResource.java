package br.com.mechanic.challenge.swapichallenge.resource;

import br.com.mechanic.challenge.swapichallenge.dto.PlanetDto;
import br.com.mechanic.challenge.swapichallenge.dto.PlanetResultDto;
import br.com.mechanic.challenge.swapichallenge.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/planetas")
public class PlanetasResource {

    @Autowired
    StarWarsService starWarsService;

    @GetMapping
    public PlanetResultDto getPlanets()
    {
        return  starWarsService.getPlanets();
    }

    @GetMapping("/{id}")
    public PlanetDto getPlanet( @PathVariable Long id )
    {
        return starWarsService.getPlanet(id);
    }
}