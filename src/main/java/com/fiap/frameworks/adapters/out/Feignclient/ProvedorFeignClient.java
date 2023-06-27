package com.fiap.frameworks.adapters.out.Feignclient;

import com.fiap.domain.dto.provedorBD.ClienteBDRequestDTO;
import com.fiap.domain.dto.provedorBD.ClienteBDResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Provedor-client" , url = "${Provedor.endpoint}")
public interface ProvedorFeignClient {

    @PostMapping(value= "api/verbo-provedor-create/teste1")
    ClienteBDResponseDTO verboProvedorCreate(@RequestBody String ClienteBDRequestDTO){

        return null;
    }

}
