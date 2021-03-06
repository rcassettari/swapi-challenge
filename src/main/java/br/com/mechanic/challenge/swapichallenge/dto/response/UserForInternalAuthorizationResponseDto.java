package br.com.mechanic.challenge.swapichallenge.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserForInternalAuthorizationResponseDto {

    private Long codigo;
    private String nome;
    private String email;
    private String senha;
    private List<PermissaoDto> permissoes;

}
