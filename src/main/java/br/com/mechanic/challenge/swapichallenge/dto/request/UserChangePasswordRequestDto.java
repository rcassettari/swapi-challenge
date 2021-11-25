package br.com.mechanic.challenge.swapichallenge.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserChangePasswordRequestDto {

    @Size( max = 50 , min = 5)
    @NotEmpty
    @Email
    private String email;
    @Size( max = 150 )
    @NotEmpty
    private String novaSenha;

    @Size( max = 150 )
    @NotEmpty
    private String confirmacaoSenha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }

    public String getConfirmacaoSenha() {
        return confirmacaoSenha;
    }

    public void setConfirmacaoSenha(String confirmacaoSenha) {
        this.confirmacaoSenha = confirmacaoSenha;
    }
}
