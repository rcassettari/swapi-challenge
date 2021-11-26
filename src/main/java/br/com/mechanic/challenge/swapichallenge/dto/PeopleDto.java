package br.com.mechanic.challenge.swapichallenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PeopleDto {

    @JsonProperty("data_nascimento")
    private String dataNascimento;
    @JsonProperty("cor_olho")
    private String corOlho;
    @JsonProperty("filmes")
    private List<String> filmes = null;
    @JsonProperty("genero")
    private String genero;
    @JsonProperty("cor_cabelo")
    private String corCabelo;
    @JsonProperty("altura")
    private String altura;
    @JsonProperty("planeta_natal")
    private String planetaNatal;
    @JsonProperty("peso")
    private String peso;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("cor_pele")
    private String corPele;
    @JsonProperty("data_criacao")
    private String dataCriacao;
    @JsonProperty("data_edicao")
    private String dataEdicao;
    @JsonProperty("especies")
    private List<String> especies = null;
    @JsonProperty("naves_espaciais")
    private List<String> navesEspaciais = null;
    @JsonProperty("url")
    private String url;
    @JsonProperty("veiculos")
    private List<String> veiculos = null;

}
