package com.fiap.domain.dto.modelsMS;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ClienteResponseDTO {

    private String id;
}
