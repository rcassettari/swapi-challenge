package br.com.mechanic.challenge.swapichallenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanetDto {

    @JsonProperty("clima")
    private String clima;
    @JsonProperty("data_criacao")
    private String dataCriacao;
    @JsonProperty("diametro")
    private String diametro;
    @JsonProperty("data_edicao")
    private String dataEdicao;
    @JsonProperty("filmes")
    private List<String> filmes = null;
    @JsonProperty("gravidade")
    private String gravidade;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("periodo_orbital")
    private String periodoOrbital;
    @JsonProperty("populacao")
    private String populacao;
    @JsonProperty("residentes")
    private List<String> residentes = null;
    @JsonProperty("periodo_rotacao")
    private String periodoRotacao;
    @JsonProperty("agua_de_superficie")
    private String aguaSuperficie;
    @JsonProperty("terreno")
    private String terreno;
    @JsonProperty("url")
    private String url;

}
