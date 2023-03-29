import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);
            System.out.println("Informe o nome: ");
            String nome = sc.nextLine();
            System.out.println("Informe o preço: ");
            Double preco = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha deixada pelo nextDouble()
            Produto produto = new Produto(nome, preco, new Localizacao("a", 3));
            estoque.addProduto(produto);
            System.out.println("Produto adicionado com sucesso!");
            //System.out.println(estoque.getProdutos());
            System.out.println(produto.getLocalizacao().getCorredor());
    }
}
