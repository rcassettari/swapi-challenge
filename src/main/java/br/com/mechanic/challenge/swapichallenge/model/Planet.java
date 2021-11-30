package br.com.mechanic.challenge.swapichallenge.model;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "climate",
        "created",
        "diameter",
        "edited",
        "films",
        "gravity",
        "name",
        "orbital_period",
        "population",
        "residents",
        "rotation_period",
        "surface_water",
        "terrain",
        "url"
})
@Generated("jsonschema2pojo")
public class Planet {

    @JsonProperty("climate")
    private String climate;
    @JsonProperty("created")
    private String created;
    @JsonProperty("diameter")
    private String diameter;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("films")
    private List<String> films = null;
    @JsonProperty("gravity")
    private String gravity;
    @JsonProperty("name")
    private String name;
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    @JsonProperty("population")
    private String population;
    @JsonProperty("residents")
    private List<String> residents = null;
    @JsonProperty("rotation_period")
    private String rotationPeriod;
    @JsonProperty("surface_water")
    private String surfaceWater;
    @JsonProperty("terrain")
    private String terrain;
    @JsonProperty("url")
    private String url;

}