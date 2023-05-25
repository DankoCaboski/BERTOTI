package Aplicacao.Back.Models;

import Aplicacao.Cliente.Cliente;

import java.util.LinkedList;
import java.util.List;

public class Mesa {
    Integer npessoas;
    int nmesa;
    private List<Pedido> pedidosdamesa = new LinkedList();
    private List<Cliente> clientes  = new LinkedList<Cliente>();

    public Integer getNpessoas() {
        return npessoas;
    }

    public void setNpessoas(Integer npessoas) {
        this.npessoas = npessoas;
    }

    public int getNmesa() {
        return nmesa;
    }

    public void setNmesa(int nmesa) {
        this.nmesa = nmesa;
    }

    public boolean isOcuped(){
        if(npessoas>0) return false;
        else{
            return true;
        }
    }

    public List<Pedido> getPedidosdamesa() {
        return pedidosdamesa;
    }

    public void setPedidosdamesa(String pedido) {
        this.pedidosdamesa.add(Cardapio.getPrato(pedido));
    }

    public void imprimePedidos() {
        if (pedidosdamesa.size() != 0) {
            for (Pedido pedido : pedidosdamesa) {
                System.out.println(pedido.getNome());
            }
        }
    }

}

