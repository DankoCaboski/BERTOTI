package Aplicacao.Back.Models;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;
class CardapioTest {
    @Test
    public void testGetCardapio() {
        List<Pedido> cardapio = Cardapio.getCardapio();
        Assert.assertNotNull(cardapio);
        Assert.assertEquals(30, cardapio.size());
    }

    @Test
    public void testGetPrato() {
        Pedido prato1 = Cardapio.getPrato("Prato1");
        Assert.assertNotNull(prato1);
        Assert.assertEquals("Prato1", prato1.getNome());
        Assert.assertEquals(Double.valueOf(1), prato1.getPreco());

        Pedido prato15 = Cardapio.getPrato("Prato15");
        Assert.assertNotNull(prato15);
        Assert.assertEquals("Prato15", prato15.getNome());
        Assert.assertEquals(Double.valueOf(15), prato15.getPreco());

        Pedido pratoNaoCadastrado = Cardapio.getPrato("PratoNaoCadastrado");
        Assert.assertNotNull(pratoNaoCadastrado);
        Assert.assertNull(pratoNaoCadastrado.getPreco());
    }
}