package br.com.mechanic.challenge.swapichallenge.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoResponse
{
    private Long codigo;
    private String nome;
    private String email;

}
