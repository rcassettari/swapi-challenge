package br.com.mechanic.challenge.swapichallenge.model;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

    @JsonProperty("climate")
    public String getClimate() {
        return climate;
    }

    @JsonProperty("climate")
    public void setClimate(String climate) {
        this.climate = climate;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("diameter")
    public String getDiameter() {
        return diameter;
    }

    @JsonProperty("diameter")
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(String edited) {
        this.edited = edited;
    }

    @JsonProperty("films")
    public List<String> getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(List<String> films) {
        this.films = films;
    }

    @JsonProperty("gravity")
    public String getGravity() {
        return gravity;
    }

    @JsonProperty("gravity")
    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("orbital_period")
    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @JsonProperty("orbital_period")
    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    @JsonProperty("population")
    public String getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(String population) {
        this.population = population;
    }

    @JsonProperty("residents")
    public List<String> getResidents() {
        return residents;
    }

    @JsonProperty("residents")
    public void setResidents(List<String> residents) {
        this.residents = residents;
    }

    @JsonProperty("rotation_period")
    public String getRotationPeriod() {
        return rotationPeriod;
    }

    @JsonProperty("rotation_period")
    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    @JsonProperty("surface_water")
    public String getSurfaceWater() {
        return surfaceWater;
    }

    @JsonProperty("surface_water")
    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    @JsonProperty("terrain")
    public String getTerrain() {
        return terrain;
    }

    @JsonProperty("terrain")
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

}