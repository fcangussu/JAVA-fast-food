package com.fiap.application.ports.out;

import com.fiap.domain.dto.modelsMS.ClienteRequestDTO;
import com.fiap.domain.dto.provedorBD.ClienteBDRequestDTO;
import com.fiap.domain.dto.provedorBD.ClienteBDResponseDTO;


// @jpa implmenta interface JPA
public interface ClientePortOut {

    public ClienteBDResponseDTO createCliente(ClienteRequestDTO clienteRequestDTO);

}
