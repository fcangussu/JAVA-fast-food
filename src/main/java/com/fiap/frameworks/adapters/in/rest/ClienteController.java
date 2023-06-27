package com.fiap.frameworks.adapters.in.rest;


import com.fiap.application.ports.in.ClientePortIn;
import com.fiap.domain.dto.modelsMS.ClienteRequestDTO;
import com.fiap.domain.dto.modelsMS.ClienteResponseDTO;

@RestController
public class ClienteController {

        @Autowired
        ClientePortIn clientePortIn;

        @PostMapping(path="/cliente")
        public ResponseEntity<ClienteResponseDTO> createClient(@RequestBody ClienteRequestDTO clienteRequestDTO){
                return ResponseEntity.status(Htttp.CREATED).body(clientePortIn.createClient(clienteRequestDTO));
        }

        //host:
        //localhost:8080/

        //base URL:
        //tech-challenge-fast-food-system

        //OPERACAO:  /cliente

        //URL COMPLETA:
        //  localhost:8080/tech-challenge-fast-food-system/cliente

}
