package ufes.br.pedido.controller.dto;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PedidoRequestDto {
    private LocalDate data;
    private Long clienteId;
    private List<ItensPedidoRequest> itens;
    private String tipo;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public List<ItensPedidoRequest> getItens() {
        return itens;
    }

    public void setItens(List<ItensPedidoRequest> itens) {
        this.itens = itens;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoRequestDto that = (PedidoRequestDto) o;
        return Objects.equals(data, that.data) && Objects.equals(clienteId, that.clienteId) && Objects.equals(itens, that.itens) && Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, clienteId, itens, tipo);
    }
}
