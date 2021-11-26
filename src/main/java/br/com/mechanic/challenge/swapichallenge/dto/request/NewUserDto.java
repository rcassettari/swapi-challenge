package br.com.mechanic.challenge.swapichallenge.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class NewUserDto {

    private Long codigo;
    @Size( max = 50 )
    @NotEmpty
    private String nome;
    @Size( max = 50 , min = 5)
    @NotEmpty
    @Email
    private String email;
    @Size( max = 150 )
    @NotEmpty
    private String senha;
    @Size( max = 150 )
    @NotEmpty
    private String confirmacaoSenha;

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

    public String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }

    public void setConfirmacaoSenha(String confirmacaoSenha) {
        this.confirmacaoSenha = confirmacaoSenha;
    }
}
