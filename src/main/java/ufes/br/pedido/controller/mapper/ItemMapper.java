package ufes.br.pedido.controller.mapper;

import org.springframework.stereotype.Component;
import ufes.br.pedido.Item;
import ufes.br.pedido.controller.dto.ItensPedidoRequest;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ItemMapper {

    public List<Item> toCollectionModel(List<ItensPedidoRequest> item) {
        return item.stream()
                .map(itensPedidoRequest -> new Item(itensPedidoRequest.getNome(),
                        itensPedidoRequest.getQuantidade(),
                        itensPedidoRequest.getValorUnitario(),
                        itensPedidoRequest.getTipo()))
                .collect(Collectors.toList());
    }
}
