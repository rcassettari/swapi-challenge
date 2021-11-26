package br.com.mechanic.challenge.swapichallenge.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
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

}
