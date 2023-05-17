package Back.Models;

import Back.Pedido;

import java.util.LinkedList;
import java.util.List;


public class Cardapio {
     private static List<Pedido> cardapio = new LinkedList<>();

     Cardapio(){
         Integer n = 1;
         for(Pedido opcao : cardapio){
             opcao.setNome("prato "+n);
            opcao.setPreco(n.doubleValue());
            n++;
         }
     }

    public static List<Pedido> getCardapio() {
        return cardapio;
    }
}
