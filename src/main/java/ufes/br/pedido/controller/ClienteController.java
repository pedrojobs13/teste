package ufes.br.pedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufes.br.pedido.Cliente;
import ufes.br.pedido.controller.dto.ClienteRequestDto;
import ufes.br.pedido.controller.mapper.ClienteMapper;
import ufes.br.pedido.service.CreateClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private CreateClienteService createClienteService;
    @Autowired
    private ClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<?> CreateCliente(@RequestBody ClienteRequestDto clienteRequestDto) {

        Cliente cliente = clienteMapper.toModel(clienteRequestDto);
        createClienteService.createClient(cliente);

        return ResponseEntity.ok().build();
    }
}
