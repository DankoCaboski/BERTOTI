import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    List<Produto> produtos = new LinkedList<Produto>();

    public void addProduto(Produto adicionar) {
        this.produtos.add(adicionar);
    }

    public String getProdutos() {
        String lista = "";
        for (Produto prod : produtos){
            lista += prod.getNome().toString();
            lista += "";
        }
        return lista;
    }
}
