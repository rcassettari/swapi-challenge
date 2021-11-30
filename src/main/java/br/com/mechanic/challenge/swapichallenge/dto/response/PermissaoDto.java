package br.com.mechanic.challenge.swapichallenge.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PermissaoDto {

    private Long codigo;
    private String descricao;

}
