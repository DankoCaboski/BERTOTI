package Aplicacao.Back.Models;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void testNome() {
        //pedido sem nome
        Pedido pedidoteste = new Pedido();
        assertNull(pedidoteste.getNome());

        //peido com nome
        pedidoteste.setNome("ModeloNomePedido");
        assertNotNull(pedidoteste.getNome());
        assertEquals("ModeloNomePedido",pedidoteste.getNome());
    }

    @Test
    void testPessoasserve() {
        Random random = new Random();
        Pedido pedidoteste = new Pedido();
        pedidoteste.setNome("ModeloNomePedido");

        //teste pessoasserve = null
        assertNotNull(pedidoteste.getPessoasserve());

        //teste setpessoasserve(null)
        pedidoteste.setPessoasserve(null);
        assertNotNull(pedidoteste.getPessoasserve());

        //seta o numero de pessoas que o prato serve
        int nteste = random.nextInt(5)+1;
        pedidoteste.setPessoasserve(nteste);

        //teste retorno pessoasserve
        assertEquals(nteste,pedidoteste.getPessoasserve());
    }

    @Test
    void testPreco() {
        Random random = new Random();
        Pedido pedidoteste = new Pedido();
        assertNull(pedidoteste.getPreco());

        Double preco = random.nextDouble();
        pedidoteste.setPreco(preco);
        assertEquals(preco, pedidoteste.getPreco());
    }
}