package ufes.br.pedido.repository.impl;

import org.springframework.stereotype.Component;
import ufes.br.pedido.Cliente;
import ufes.br.pedido.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ClienteRepositoryImpl implements ClienteRepository {
    private Collection<Cliente> clientes = new ArrayList<>();

    @Override
    public void save(Cliente cliente) {
        clientes.add(cliente);
    }
    @Override
    public List<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }
    @Override
    public Cliente getById(Long id) {
        return clientes.stream().toList().get(Math.toIntExact(id));
    }
}
