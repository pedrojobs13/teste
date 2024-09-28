package ufes.br.pedido.repository;

import org.springframework.stereotype.Repository;
import ufes.br.pedido.Cliente;

import java.util.Collection;

@Repository
public interface ClienteRepository {
    void save(Cliente cliente);

    Collection<Cliente> getClientes();

    Cliente getById(Long id);
}
