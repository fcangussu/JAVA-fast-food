package com.fiap.application.ports.in;


//Interface IClienteUseCase

import com.fiap.domain.dto.modelsMS.ClienteRequestDTO;
import com.fiap.domain.dto.modelsMS.ClienteResponseDTO;



public interface ClientePortIn {

    public  ClienteResponseDTO  createClient(ClienteRequestDTO cliente);

}
