package br.com.mechanic.challenge.swapichallenge.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PlanetResult {

    private Integer count;
    private String next;
    private String previous;
    private List<Planet> results;

}

