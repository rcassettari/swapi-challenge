package br.com.mechanic.challenge.swapichallenge.dto.response;

import java.util.List;

public class UserForInternalAuthorizationResponseDto {

    private Long codigo;
    private String nome;
    private String email;
    private String senha;
    private List<PermissaoDto> permissoes;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<PermissaoDto> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<PermissaoDto> permissoes) {
        this.permissoes = permissoes;
    }
}
