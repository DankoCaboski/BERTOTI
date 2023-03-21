import java.util.LinkedList;
import java.util.List;

public class Estoque {
    List<Produto> estoque = new LinkedList<Produto>();

    public void addProduto(Produto adicionado) {
        estoque.add(adicionado);
    }
}
