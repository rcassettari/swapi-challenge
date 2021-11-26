package br.com.mechanic.challenge.swapichallenge.mapper;

import br.com.mechanic.challenge.swapichallenge.dto.FilmDto;
import br.com.mechanic.challenge.swapichallenge.dto.FilmsResultDto;
import br.com.mechanic.challenge.swapichallenge.model.Film;
import br.com.mechanic.challenge.swapichallenge.model.FilmsResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmMapper {

    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

    @Mappings({
            @Mapping(source = "title", target = "titulo"),
            @Mapping(source = "episodeId", target = "episodioCodigo"),
            @Mapping(source = "openingCrawl", target = "prologo"),
            @Mapping(source = "director", target = "diretor"),
            @Mapping(source = "producer", target = "produtor"),
            @Mapping(source = "releaseDate", target = "dataEntrega"),
            @Mapping(source = "characters", target = "personagens"),
            @Mapping(source = "planets", target = "planetas"),
            @Mapping(source = "starships", target = "navesEspaciais"),
            @Mapping(source = "vehicles", target = "veiculos"),
            @Mapping(source = "species", target = "especies"),
            @Mapping(source = "created", target = "dataCriacao"),
            @Mapping(source = "edited", target = "dataEdicao"),
            @Mapping(source = "url", target = "url")
    })
    FilmDto filmToFilmDto(Film car);

    List<FilmDto> filmsToFilmsDto(List<Film> car);

    @Mappings({
            @Mapping(source = "count", target = "contagem"),
            @Mapping(source = "next", target = "proximo"),
            @Mapping(source = "previous", target = "anterior"),
            @Mapping(source = "results", target = "resultados")
    })
    FilmsResultDto filmsResultToFilmsResultDto(FilmsResult filmsResult);

}
