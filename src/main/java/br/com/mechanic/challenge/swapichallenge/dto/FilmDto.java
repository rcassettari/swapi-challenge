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
public class FilmDto {

    @JsonProperty("titulo")
    private String titulo;
    @JsonProperty("episodio_codigo")
    private Integer episodioCodigo;
    @JsonProperty("prologo")
    private String prologo;
    @JsonProperty("diretor")
    private String diretor;
    @JsonProperty("produtor")
    private String produtor;
    @JsonProperty("data_entrega")
    private String dataEntrega;
    @JsonProperty("personagens")
    private List<String> personagens = null;
    @JsonProperty("planetas")
    private List<String> planetas = null;
    @JsonProperty("naves_espaciais")
    private List<String> navesEspaciais = null;
    @JsonProperty("veiculos")
    private List<String> veiculos = null;
    @JsonProperty("especies")
    private List<String> especies = null;
    @JsonProperty("data_criacao")
    private String dataCriacao;
    @JsonProperty("data_edicao")
    private String dataEdicao;
    @JsonProperty("url")
    private String url;

}
