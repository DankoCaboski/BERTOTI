public class Produto {
    private String nome;
    private Double preco;
    private Localizacao localizacao;

    public Produto(String nome, Double preco, Localizacao localizacao){
        this.nome = nome;
        this.preco = preco;
        this.localizacao = localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

}
