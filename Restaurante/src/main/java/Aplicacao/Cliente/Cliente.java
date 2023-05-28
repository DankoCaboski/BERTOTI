package Aplicacao.Cliente;

import Aplicacao.Back.Models.Mesa;
import Aplicacao.Back.Models.Cardapio;
import Aplicacao.Back.Models.Pedido;
import Aplicacao.Back.Models.Salao;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    public static Mesa minhamesa;
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
    private static String decisao() {
        leitor.nextLine();
        String decisao = leitor.nextLine().toLowerCase();
        if (decisao.equals("s") || decisao.equals("n")) {
            return decisao;
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

        System.out.println("Informe o número da mesa: ");
        int escolha = escolha();
        for(Mesa mesa : Salao.getMesas()){
            if(mesa.getNmesa() == escolha){
                minhamesa = mesa;
                mesa.setNpessoas(pessoas);
                break;
            }
        }

        System.out.println("Mesa "+minhamesa.getNmesa()+ " reservada!");
    }
    private static void pedirCardapio() {
        System.out.println("Pratos da casa:");
        for (Pedido prato : Cardapio.getCardapio()) {
            System.out.println(prato.getNome() + " R$" + prato.getPreco());
        }
        if (minhamesa == null) {
            System.out.println("Para pedir um prato você precisa escolher uma mesa");
            System.out.println("Pedir mesa? (s/n)");
            if (decisao().equals("s")) {
                System.out.println("Pedir mesa");
                pedirMesa();
                pedirCardapio();

            }
            if (decisao().equals("n")) {
                System.out.println("Saindo");
                painelCliente();
            }
        } else {
            leitor.nextLine();
            System.out.println("Pedir prato (s/n)");
            switch (leitor.nextLine().toLowerCase()) {
                case "s": {
                    LinkedList<String> pedidos = fazerPedido();
                    System.out.println("Aqui");
                    minhamesa.setPedidosdamesa(pedidos);
                    break;
                }
                case "n": {
                    System.out.println("Saindo");
                    painelCliente();
                }
            }
        }
    }
    private static LinkedList<String> pedidos = new LinkedList<String>();
    private static LinkedList<String> fazerPedido() {
        if (minhamesa == null) {
            System.out.println("Para fazer pedido você precisa de uma mesa");
            System.out.println("Pedirr mesa(s/n)");
            switch (leitor.nextLine().toLowerCase()) {
                case "s": {
                    System.out.println("Pedir mesa");
                    pedirMesa();
                }
                case "n": {
                    System.out.println("Saindo");
                    painelCliente();
                }
            }
        } else {
            leitor.nextLine();
            System.out.println("Cardapio:");
            for(Pedido prato:Cardapio.getCardapio()){
                System.out.println(prato.getNome());
            }
            System.out.println("Informe o nome do pedido");
            pedidos.add(leitor.nextLine());
            pedidos.addAll(novoPedido());
            System.out.println("Anotado(s) "+pedidos.size()+" pedido(S)");

        }
        return pedidos;
    }
    private static List<String> novoPedido() {
        List<String> pedidos = new LinkedList<String>();
        pedidos.clear();
        System.out.println("Mais algum pedido?(s/n)");
        switch (leitor.nextLine().toLowerCase()){
            case "n":{
                return pedidos;
            }
            case "s":{
                String decisao = "s";
                while (decisao.equals("s")) {
                    System.out.println("Informe o nome do pedido");
                    pedidos.add(leitor.nextLine());
                    System.out.println("Mais algum pedido?(s/n)");
                    decisao = leitor.nextLine().toLowerCase();
                }
            }
        }
        return pedidos;
    }
    private static void fecharConta(){
        Double conta = 0.0;
        double zero = 0.0;
        if(minhamesa!=null) {
            for (Pedido pedido : minhamesa.getPedidosdamesa()) {
                conta = conta + pedido.getPreco();
            }
            if (!conta.equals(zero) && conta >= 50) {
                double percentual = 10.00;
                conta = conta - (percentual / 100); //10% de desconto
            }
        }if(conta.equals(zero)||minhamesa==null){
            System.out.println("Nada foi consumido");
        }else {
            System.out.println("Valor total da conta: " + conta);
        }
    }
}
