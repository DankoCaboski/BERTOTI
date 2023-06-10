package Aplicacao.Back.Models;

import java.util.LinkedList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

import Aplicacao.Cliente.Cliente;
import org.junit.jupiter.api.Test;

class MesaTest {
    @Test
    public void testIsNotOccupied() {
        Mesa mesa = new Mesa();

        // Testando quando a quantidade de pessoas é zero
        mesa.setNpessoas(0);
        assertTrue(mesa.isNotOccupied());

        // Testando quando a quantidade de pessoas é maior que zero
        Random random = new Random();
        int randomNumber = random.nextInt(30) + 1;
        mesa.setNpessoas(randomNumber);
        assertFalse(mesa.isNotOccupied());
    }

    @Test
    public void testSetPedidosdamesa() {
        Cliente cliente = new Cliente();
        Random random = new Random();
        //obtem uma messa aleatoria
        cliente.setMinhamesaIns(Salao.locMesa(random.nextInt(30) + 1));

        LinkedList<String> pedidos = new LinkedList<>();
        pedidos.add("Prato7");
        pedidos.add("Prato4");
        int randomNumber = random.nextInt(60) + 31;
        //Adiciona pedido inexistente
        pedidos.add("Prato"+ Integer.toString(randomNumber));
        cliente.getMinhamesaIns().setPedidosdamesa(pedidos);

        // Verificando se os pedidos foram adicionados corretamente na lista de pedidos da mesa
        assertEquals(3, cliente.getMinhamesaIns().getPedidosdamesa().size());

        // Verificando se os pedidos adicionados são os esperados
        assertEquals("Prato7", cliente.getMinhamesaIns().getPedidosdamesa().get(0).getNome());
        assertEquals("Prato4", cliente.getMinhamesaIns().getPedidosdamesa().get(1).getNome());
        assertEquals("PratoNaoCadastrado", cliente.getMinhamesaIns().getPedidosdamesa().get(2).getNome());

    }
}