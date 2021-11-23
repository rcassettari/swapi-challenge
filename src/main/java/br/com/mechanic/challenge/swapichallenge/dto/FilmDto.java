package br.com.mechanic.challenge.swapichallenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEpisodioCodigo() {
        return episodioCodigo;
    }

    public void setEpisodioCodigo(Integer episodioCodigo) {
        this.episodioCodigo = episodioCodigo;
    }

    public String getPrologo() {
        return prologo;
    }

    public void setPrologo(String prologo) {
        this.prologo = prologo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public List<String> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(List<String> planetas) {
        this.planetas = planetas;
    }

    public List<String> getNavesEspaciais() {
        return navesEspaciais;
    }

    public void setNavesEspaciais(List<String> navesEspaciais) {
        this.navesEspaciais = navesEspaciais;
    }

    public List<String> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<String> veiculos) {
        this.veiculos = veiculos;
    }

    public List<String> getEspecies() {
        return especies;
    }

    public void setEspecies(List<String> especies) {
        this.especies = especies;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
