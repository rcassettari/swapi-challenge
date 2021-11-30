package br.com.mechanic.challenge.swapichallenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PeopleResultDto {

    @JsonProperty("contagem")
    private Integer contagem;
    @JsonProperty("proximo")
    private String proximo;
    @JsonProperty("anterior")
    private String anterior;
    @JsonProperty("resultados")
    private List<PeopleDto> resultados;

}
