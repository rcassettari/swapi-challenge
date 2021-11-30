package br.com.mechanic.challenge.swapichallenge.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

}
