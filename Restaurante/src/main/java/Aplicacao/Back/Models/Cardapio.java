package Aplicacao.Back.Models;

import java.util.LinkedList;
import java.util.List;


public class Cardapio {
    private static boolean ini = false;
     private static List<Pedido> cardapio = new LinkedList();

    public static List<Pedido> getCardapio() {
        if (!ini) {
            for (int i = 0; i < 30; i++) {
                Pedido pedido = new Pedido();
                pedido.setNome("Prato"+String.valueOf(i+1));
                pedido.setPreco(Double.valueOf(i+1));
                cardapio.add(pedido);
            }
            ini = !ini;
        }
        return cardapio;
    }
    public static Pedido getPedido(String pedido) {
        for (Pedido i : cardapio) {
            if (i.getNome().equals(pedido)) {
                return cardapio.get(cardapio.indexOf(i));
            }
        }
        return null;
    }
}
