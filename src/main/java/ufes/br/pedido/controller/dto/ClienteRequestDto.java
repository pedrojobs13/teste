package ufes.br.pedido.controller.dto;

public class ClienteRequestDto {
    private String nome;
    private String tipo;
    private Double fidelidade;
    private String logradouro;
    private String bairro;
    private String cidade;

    public ClienteRequestDto(String nome, String tipo, double fidelidade, String logradouro, String bairro, String cidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.fidelidade = fidelidade;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getFidelidade() {
        return fidelidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }
}
