package ufes.br.pedido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufes.br.pedido.Cliente;
import ufes.br.pedido.Item;
import ufes.br.pedido.Pedido;
import ufes.br.pedido.repository.ClienteRepository;
import ufes.br.pedido.repository.PedidoRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public void createPedido(LocalDate data, List<Item> itemList, Long ClientID) {

        Cliente cliente = clienteRepository.getById(ClientID);

        Pedido pedido = new Pedido(data, cliente);
        itemList.forEach(pedido::adicionarItem);


        pedidoRepository.save(pedido);
    }

    public Pedido getPedido(Long id) {
        // TODO
        return null;
    }

    public Pedido processarDescontoPedido(Long id) {
        // TODO
        return null;
    }


}
