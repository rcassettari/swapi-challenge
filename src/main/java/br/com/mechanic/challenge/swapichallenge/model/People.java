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
        "birth_year",
        "eye_color",
        "films",
        "gender",
        "hair_color",
        "height",
        "homeworld",
        "mass",
        "name",
        "skin_color",
        "created",
        "edited",
        "species",
        "starships",
        "url",
        "vehicles"
})
@Generated("jsonschema2pojo")
public class People {

    @JsonProperty("birth_year")
    private String birthYear;
    @JsonProperty("eye_color")
    private String eyeColor;
    @JsonProperty("films")
    private List<String> films = null;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("height")
    private String height;
    @JsonProperty("homeworld")
    private String homeworld;
    @JsonProperty("mass")
    private String mass;
    @JsonProperty("name")
    private String name;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("created")
    private String created;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("species")
    private List<String> species = null;
    @JsonProperty("starships")
    private List<String> starships = null;
    @JsonProperty("url")
    private String url;
    @JsonProperty("vehicles")
    private List<String> vehicles = null;

}