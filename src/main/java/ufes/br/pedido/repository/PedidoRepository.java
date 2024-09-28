package ufes.br.pedido.repository;

import org.springframework.stereotype.Repository;
import ufes.br.pedido.Pedido;

@Repository
public interface PedidoRepository {

    void save(Pedido pedido);

}
