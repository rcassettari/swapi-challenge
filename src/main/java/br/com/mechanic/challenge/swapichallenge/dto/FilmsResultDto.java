package br.com.mechanic.challenge.swapichallenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FilmsResultDto {

    @JsonProperty("contagem")
    private Integer contagem;
    @JsonProperty("proximo")
    private String proximo;
    @JsonProperty("anterior")
    private String anterior;
    @JsonProperty("resultados")
    private List<FilmDto> resultados;

    public Integer getContagem() {
        return contagem;
    }

    public void setContagem(Integer contagem) {
        this.contagem = contagem;
    }

    public String getProximo() {
        return proximo;
    }

    public void setProximo(String proximo) {
        this.proximo = proximo;
    }

    public String getAnterior() {
        return anterior;
    }

    public void setAnterior(String anterior) {
        this.anterior = anterior;
    }

    public List<FilmDto> getResultados() {
        return resultados;
    }

    public void setResultados(List<FilmDto> resultados) {
        this.resultados = resultados;
    }
}


