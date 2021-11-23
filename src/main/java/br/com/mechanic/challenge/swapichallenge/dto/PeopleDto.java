package br.com.mechanic.challenge.swapichallenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCorOlho() {
        return corOlho;
    }

    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }

    public List<String> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<String> filmes) {
        this.filmes = filmes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPlanetaNatal() {
        return planetaNatal;
    }

    public void setPlanetaNatal(String planetaNatal) {
        this.planetaNatal = planetaNatal;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public List<String> getEspecies() {
        return especies;
    }

    public void setEspecies(List<String> especies) {
        this.especies = especies;
    }

    public List<String> getNavesEspaciais() {
        return navesEspaciais;
    }

    public void setNavesEspaciais(List<String> navesEspaciais) {
        this.navesEspaciais = navesEspaciais;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<String> veiculos) {
        this.veiculos = veiculos;
    }
}
