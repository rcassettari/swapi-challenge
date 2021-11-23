package br.com.mechanic.challenge.swapichallenge.model;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }

    @JsonProperty("eye_color")
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @JsonProperty("films")
    public List<String> getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(List<String> films) {
        this.films = films;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }

    @JsonProperty("hair_color")
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("homeworld")
    public String getHomeworld() {
        return homeworld;
    }

    @JsonProperty("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    @JsonProperty("mass")
    public String getMass() {
        return mass;
    }

    @JsonProperty("mass")
    public void setMass(String mass) {
        this.mass = mass;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }

    @JsonProperty("skin_color")
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(String edited) {
        this.edited = edited;
    }

    @JsonProperty("species")
    public List<String> getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(List<String> species) {
        this.species = species;
    }

    @JsonProperty("starships")
    public List<String> getStarships() {
        return starships;
    }

    @JsonProperty("starships")
    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("vehicles")
    public List<String> getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

}