package br.com.mechanic.challenge.swapichallenge.mapper;

import br.com.mechanic.challenge.swapichallenge.dto.PlanetDto;
import br.com.mechanic.challenge.swapichallenge.dto.PlanetResultDto;
import br.com.mechanic.challenge.swapichallenge.model.Planet;
import br.com.mechanic.challenge.swapichallenge.model.PlanetResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlanetMapper {

    PlanetMapper INSTANCE = Mappers.getMapper(PlanetMapper.class);

    @Mappings({
            @Mapping(source = "climate", target = "clima"),
            @Mapping(source = "created", target = "dataCriacao"),
            @Mapping(source = "diameter", target = "diametro"),
            @Mapping(source = "edited", target = "dataEdicao"),
            @Mapping(source = "films", target = "filmes"),
            @Mapping(source = "gravity", target = "gravidade"),
            @Mapping(source = "name", target = "nome"),
            @Mapping(source = "orbitalPeriod", target = "periodoOrbital"),
            @Mapping(source = "population", target = "populacao"),
            @Mapping(source = "residents", target = "residentes"),
            @Mapping(source = "rotationPeriod", target = "periodoRotacao"),
            @Mapping(source = "surfaceWater", target = "aguaSuperficie"),
            @Mapping(source = "terrain", target = "terreno"),
            @Mapping(source = "url", target = "url")
    })
    PlanetDto planetToPlanetDto(Planet planet);

    List<PlanetDto> planetListToPlanetDtoList(List<Planet> planetList);

    @Mappings({
            @Mapping(source = "count", target = "contagem"),
            @Mapping(source = "next", target = "proximo"),
            @Mapping(source = "previous", target = "anterior"),
            @Mapping(source = "results", target = "resultados")
    })
    PlanetResultDto planetResultToPlanetResultDto(PlanetResult planetResult);

}
