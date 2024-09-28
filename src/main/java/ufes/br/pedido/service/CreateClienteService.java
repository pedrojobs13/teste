package ufes.br.pedido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufes.br.pedido.Cliente;
import ufes.br.pedido.repository.ClienteRepository;

@Service
public class CreateClienteService {
    @Autowired  private ClienteRepository clienteRepository;

    public void createClient(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
