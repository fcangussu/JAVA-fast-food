package com.fiap.domain.dto.provedorBD;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ClienteBDRequestDTO {


    @JsonProperty("nome")
    private String nome;

    @JsonProperty("cpf")
    private String cpf;

}
