package com.fiap.application.services;

import com.fiap.application.ports.in.ClientePortIn;
import com.fiap.domain.dto.modelsMS.ClienteRequestDTO;
import com.fiap.domain.dto.modelsMS.ClienteResponseDTO;
import com.fiap.domain.dto.provedorBD.ClienteBDResponseDTO;


@Service
public class ClientePortInImpl implements ClientePortIn {



    @AutoWired
    ClientePortOut clientePortOut;

    @Override
    public ClienteResponseDTO createClient(ClienteRequestDTO clienteRequestDTO) {


        ClienteBDResponseDTO clienteBDResponseDTO =  clientePortOut.createCliente(clienteRequestDTO);
        //transformacao para volta:


        return ClienteResponseDTO.builder(clienteBDResponseDTO.getId()).id().build();
    }
}
