package Aplicacao.Back.Models;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;


public class Cardapio {
    private static boolean ini = false;
     private static List<Pedido> cardapio = new LinkedList();

    public static List<Pedido> getCardapio() {
        if (!ini) {
            for (int i = 0; i < 30; i++) {
                Pedido pedido = new Pedido();
                pedido.setNome("Prato"+ (i + 1));
                pedido.setPreco(Double.valueOf(i+1));
                cardapio.add(pedido);
            }
            ini = !ini;
        }
        return cardapio;
    }
    public static Pedido getPrato(String pedido) {
        Pedido retorno = new Pedido();
        String nomeretorno;
        getCardapio();
        for (Pedido i : cardapio) {
            if (i.getNome().equals(pedido)) {
                retorno.setNome(i.getNome());
                retorno.setPreco(i.getPreco());
                break;
            }
            if(i.getNome().equals(cardapio.get(cardapio.size()-1).getNome()) && !i.getNome().equals(pedido)){
                nomeretorno = "PratoNaoCadastrado";
                retorno.setNome(nomeretorno);
                retorno.setPreco(null);
            }
        }
        return retorno;
    }
}
