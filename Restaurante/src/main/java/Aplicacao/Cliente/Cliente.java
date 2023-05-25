package Aplicacao.Cliente;

import Aplicacao.Back.Models.Mesa;
import Aplicacao.Back.Models.Cardapio;
import Aplicacao.Back.Models.Pedido;
import Aplicacao.Back.Models.Salao;


import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Cliente {
    public static Mesa minhamesa = new Mesa();
    public static void painelCliente(){
        System.out.println("Bem vindo cliente!");
        System.out.println("'1' para pedir mesa, '2' para cardapio");
        System.out.println("'3' para fazer pedido, '4' para fechar conta");

        switch (escolha()) {
            case 1: {
                pedirMesa();
                break;
            }

            case 2: {
                pedirCardapio();
                break;
            }
            case 3: {
                fazerPedido();
                break;
            }
            case 4: {
                fecharConta();
                break;
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
        int escolha = escolha();
        for(Mesa mesa : Salao.getMesas()){
            if(mesa.getNmesa() == escolha()){
                mesa.setNpessoas(pessoas);
                minhamesa = Salao.getMesas().get(escolha);
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
        System.out.println("Digite 1 parar fazer um pedido");
        String fazerpedido = null;
        leitor.nextLine();
        while(fazerpedido == null) {
            fazerpedido = leitor.nextLine();
        }
        if(fazerpedido.equals("1")){
            minhamesa.setPedidosdamesa(fazerPedido());
        }
    }
    private static String fazerPedido(){
        leitor.nextLine();
        System.out.println("Informe o nome do pedido e a quantidade");
        return leitor.nextLine();
    }
    private static void fecharConta(){
        Double conta = null;
        for(Pedido pedido :  minhamesa.getPedidosdamesa()){
            conta = conta + pedido.getPreco();
        }
        if (conta.toString() != null && conta >= 50){
            double percentual = 10.00;
            conta = conta - (percentual/100); //concede 10% de desconto
        }if(conta.isNaN()){
            System.out.println("Nada foi consumido");
        }else {
            System.out.println("Valor total da conta: " + conta);
        }
    }
}
