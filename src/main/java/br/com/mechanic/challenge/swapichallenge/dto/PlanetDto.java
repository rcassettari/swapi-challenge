package br.com.mechanic.challenge.swapichallenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public List<String> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<String> filmes) {
        this.filmes = filmes;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(String periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public List<String> getResidentes() {
        return residentes;
    }

    public void setResidentes(List<String> residentes) {
        this.residentes = residentes;
    }

    public String getPeriodoRotacao() {
        return periodoRotacao;
    }

    public void setPeriodoRotacao(String periodoRotacao) {
        this.periodoRotacao = periodoRotacao;
    }

    public String getAguaSuperficie() {
        return aguaSuperficie;
    }

    public void setAguaSuperficie(String aguaSuperficie) {
        this.aguaSuperficie = aguaSuperficie;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
