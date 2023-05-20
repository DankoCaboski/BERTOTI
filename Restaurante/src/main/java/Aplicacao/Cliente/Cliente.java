package Aplicacao.Cliente;

import Aplicacao.Back.Models.Mesa;
import Aplicacao.Back.Models.Cardapio;
import Aplicacao.Back.Models.Pedido;
import Aplicacao.Back.Models.Salao;


import java.util.Scanner;

public class Cliente {
    public Mesa mesa = new Mesa();

    public static void painelCliente(){
        System.out.println("Bem vindo cliente!");
        System.out.println("'1' para pedir mesa, '2' para cardapio");
        System.out.println("'3' para fazer pedido, '4' para fechar conta");

        switch (escolha()) {
            case 1: {
                pedirMesa();
            }

            case 2: {
                pedirCardapio();
            }
            case 3: {
                fazerPedido();
            }
            case 4: {
                fecharConta();
            }
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
    private static void pedirCardapio(){
        System.out.println("Pratos da casa:");
        for (Pedido prato : Cardapio.getCardapio()){
            System.out.println(prato.getNome()+" R$"+ prato.getPreco());
        }
    }
    private static void fazerPedido(){
        System.out.println("Informe o nome do pedido e a quantidade");
    }
    private static void fecharConta(){

    }
}
