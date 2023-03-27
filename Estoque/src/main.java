import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);
        System.out.println("retorne 0 ou 1");
        if(sc.nextLine() != null){
            System.out.println("Informe o nome: ");
            String nome = sc.nextLine();
            System.out.println("Informe o preço: ");
            Double preco = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha deixada pelo nextDouble()
            Produto produto = new Produto(nome, preco);
            estoque.addProduto(produto);
            System.out.println("Produto adicionado com sucesso!");
            System.out.println(estoque.getProdutos());
        }
    }
}
