package Aplicacao.Back.Models;

public class Pedido {
    String nome;
    int pessoasserve;
    Double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPessoasserve() {
        return pessoasserve;
    }

    public void setPessoasserve(int pessoasserve) {
        this.pessoasserve = pessoasserve;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
