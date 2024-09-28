package ufes.br.pedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufes.br.pedido.Item;
import ufes.br.pedido.Pedido;
import ufes.br.pedido.controller.dto.PedidoRequestDto;
import ufes.br.pedido.controller.mapper.ItemMapper;
import ufes.br.pedido.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ItemMapper itemMapper;

    @PostMapping
    public void createPedido(@RequestBody PedidoRequestDto pedidoRequestDto) {

        List<Item> itens = itemMapper.toCollectionModel(pedidoRequestDto.getItens());

        pedidoService.createPedido(pedidoRequestDto.getData(), itens, pedidoRequestDto.getClienteId());
    }

    @GetMapping("/{pedidoId}")
    public ResponseEntity<Pedido> getPedidoById(Long id) {

        return getPedidoById(id);
    }

    @PostMapping("/{pedidoId}/processar-descontos")
    public ResponseEntity<?> processarDescontos(Long id) {
        pedidoService.processarDescontoPedido(id);

        return ResponseEntity.ok().build();
    }
}
