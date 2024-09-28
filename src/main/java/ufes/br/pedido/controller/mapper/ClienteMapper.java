package ufes.br.pedido.controller.mapper;

import org.springframework.stereotype.Component;
import ufes.br.pedido.Cliente;
import ufes.br.pedido.controller.dto.ClienteRequestDto;

@Component
public class ClienteMapper {
    public static Cliente toModel(ClienteRequestDto clienteRequestDto) {
        return new Cliente(clienteRequestDto.getNome(),
                clienteRequestDto.getTipo(),
                clienteRequestDto.getFidelidade(),
                clienteRequestDto.getLogradouro(),
                clienteRequestDto.getBairro(),
                clienteRequestDto.getCidade());
    }
}
