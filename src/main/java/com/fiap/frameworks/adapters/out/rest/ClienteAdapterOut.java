package com.fiap.frameworks.adapters.out.rest;

import com.fiap.application.ports.in.ClientePortIn;
import com.fiap.application.ports.out.ClientePortOut;
import com.fiap.domain.dto.modelsMS.ClienteRequestDTO;
import com.fiap.domain.dto.provedorBD.ClienteBDResponseDTO;
import com.fiap.frameworks.adapters.out.Feignclient.ProvedorFeignClient;


/* ClienteAdapterOutImpl implements ClientePortOut */

@Component
public class ClienteAdapterOut implements ClientePortOut {


    @Autowired
    ProvedorFeignClient provedorFeignClient;

    @Override
    public ClienteBDResponseDTO createCliente(ClienteRequestDTO clienteRequestDTO) {

        var clienteRequest =
                ClienteBDRequestDTO.builder().nome(clienteRequestDTO.getNome()).build();
        return provedorFeignClient.verboProvedorCreate(clienteRequest);;
    }
}
