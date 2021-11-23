package br.com.mechanic.challenge.swapichallenge.mapper;

import br.com.mechanic.challenge.swapichallenge.dto.PeopleDto;
import br.com.mechanic.challenge.swapichallenge.dto.PeopleResultDto;
import br.com.mechanic.challenge.swapichallenge.model.People;
import br.com.mechanic.challenge.swapichallenge.model.PeopleResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PeopleMapper {

    PeopleMapper INSTANCE = Mappers.getMapper(PeopleMapper.class);

    @Mappings({
            @Mapping(source = "birthYear", target = "dataNascimento"),
            @Mapping(source = "eyeColor", target = "corOlho"),
            @Mapping(source = "films", target = "filmes"),
            @Mapping(source = "gender", target = "genero"),
            @Mapping(source = "hairColor", target = "corCabelo"),
            @Mapping(source = "height", target = "altura"),
            @Mapping(source = "homeworld", target = "planetaNatal"),
            @Mapping(source = "mass", target = "peso"),
            @Mapping(source = "name", target = "nome"),
            @Mapping(source = "skinColor", target = "corPele"),
            @Mapping(source = "created", target = "dataCriacao"),
            @Mapping(source = "edited", target = "dataEdicao"),
            @Mapping(source = "species", target = "especies"),
            @Mapping(source = "starships", target = "navesEspaciais"),
            @Mapping(source = "url", target = "url"),
            @Mapping(source = "vehicles", target = "veiculos")
    })
    PeopleDto peopleToPeopleDto(People people);

    List<PeopleDto> peopleListToPeopleDtoList(List<People> peopleList);

    @Mappings({
            @Mapping(source = "count", target = "contagem"),
            @Mapping(source = "next", target = "proximo"),
            @Mapping(source = "previous", target = "anterior"),
            @Mapping(source = "results", target = "resultados")
    })
    PeopleResultDto modelsToDtos(PeopleResult peopleResult);

}
