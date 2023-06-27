package com.fiap.domain.dto.modelsMS;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ClienteRequestDTO {
    @JsonProperty("nome")
    private String nome;

}
