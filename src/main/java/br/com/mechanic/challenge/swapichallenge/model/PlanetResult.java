package br.com.mechanic.challenge.swapichallenge.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanetResult {

    private Integer count;
    private String next;
    private String previous;
    private List<Planet> results;

}

