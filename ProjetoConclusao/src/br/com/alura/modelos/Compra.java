package br.com.alura.modelos;

public class Compra {

    // Visibilidade, tipo e atributo
    private String descricao;
    private double valor;

    // Método construtor
    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    // Método Getter
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    // Método toString
    @Override
    public String toString() {
        return "COMPRA: descricao=" + descricao + ", valor=" + valor;
    }
}
