package br.com.mechanic.challenge.swapichallenge.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NewUserResponseDto
{
    private Long codigo;
    private String nome;
    private String email;

}
