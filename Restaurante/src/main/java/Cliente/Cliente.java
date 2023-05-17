package Cliente;

import Back.Models.Cardapio;
import Back.Models.Mesa;
import Back.Models.Salao;
import Back.Pedido;

import java.util.Scanner;

public class Cliente {

    public static void painelCliente(){
        System.out.println("Bem vindo cliente!");
        System.out.println("'1' para pedir mesa, '2' para cardapio");
        System.out.println("'3' para fazer pedido, '4' para fechar conta");

        if(escolha()==1){
            pedirMesa();
        }
        if(escolha()==2){
            cardapio();
        }
        if(escolha()==3){

        }
        if(escolha()==4){

        }
    }

    private static Scanner leitor = new Scanner(System.in);
    private static int  escolha(){
        return leitor.nextInt();
    }

    private static void pedirMesa(){
        System.out.print("Informe o número de pessoas: ");
        int pessoas = escolha();
        System.out.println(" ");
        System.out.println("Mesas disponíveis:");
        for (Mesa disponivel : Salao.getMesas()){
            if(disponivel.isOcuped()) {
                System.out.println(disponivel.getNmesa());
            }
        }

        System.out.print("Informe o número da mesa: ");
        for(Mesa mesa : Salao.getMesas()){
            if(mesa.getNmesa() == escolha()){
                mesa.setNpessoas(pessoas);
                break;
            }
        }

        System.out.println("Mesa reservada!");
    }
    private static void cardapio(){
        System.out.println("Pratos da casa:");
        for (Pedido prato : Cardapio.getCardapio()){
            System.out.println(prato.getNome()+" R$"+ prato.getPreco());
        }
    }
    private void fazerPedido(Pedido pedido, int qunatidade){

    }
    private void fecharConta(){

    }
}
