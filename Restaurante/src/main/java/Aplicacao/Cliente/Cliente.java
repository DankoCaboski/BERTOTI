package Aplicacao.Cliente;

import Aplicacao.Back.Models.Mesa;
import Aplicacao.Back.Models.Cardapio;
import Aplicacao.Back.Models.Pedido;
import Aplicacao.Back.Models.Salao;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    public static Mesa minhamesa = new Mesa();
    public static void painelCliente(){
        System.out.println("Bem vindo!");
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
    private static String  decisao() {
        leitor.nextLine();
        String decisao = leitor.nextLine().toLowerCase();
        if (decisao.equals("s") || decisao.equals("n")) {
            return decisao.toLowerCase();
        }else {
            System.out.println("Caracter invalido");
            return null;
        }
    }

    private static void pedirMesa(){
        System.out.print("Informe o número de pessoas: ");
        int pessoas = escolha();
        System.out.println(" ");
        System.out.println("Mesas disponíveis:");
        for (Mesa disponivel : Salao.getMesas()){
            if(disponivel.isNotOccupied()) {
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
    private static void pedirCardapio() {
        System.out.println("Pratos da casa:");
        for (Pedido prato : Cardapio.getCardapio()) {
            System.out.println(prato.getNome() + " R$" + prato.getPreco());
        }
        if (minhamesa.isNotOccupied()) {
            System.out.println("Para pedir um prato você precisa escolher uma mesa");
            System.out.println("Pedir mesa? (s/n)");
            if (decisao().equals("s")) {
                System.out.println("Pedir mesa");
                pedirMesa();
            }
            if (decisao().equals("n")) {
                System.out.println("Saindo");
                painelCliente();
            }
        }
        else{
            System.out.println("Pedir prato (s/n)");
            if (decisao().equals("s")) {
                minhamesa.setPedidosdamesa(fazerPedido());
            }
            if (decisao().equals("n")) {
                System.out.println("Saindo");
                painelCliente();
            }
        }
    }
    private static List fazerPedido(){
        leitor.nextLine();
        List<String> pedidos = new LinkedList<String>();
        System.out.println("Informe o nome do pedido");
        pedidos.add(leitor.nextLine());

        return pedidos;
    }
    private static void fecharConta(){
        Double conta = 0.0;
        double zero = 0.0;
        for(Pedido pedido :  minhamesa.getPedidosdamesa()){
            conta = conta + pedido.getPreco();
        }
        if (!conta.equals(zero) && conta >= 50){
            double percentual = 10.00;
            conta = conta - (percentual/100); //concede 10% de desconto
        }if(conta.equals(zero)){
            System.out.println("Nada foi consumido");
        }else {
            System.out.println("Valor total da conta: " + conta);
        }
    }
}
