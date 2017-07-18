package Teste

import groovy.entity.Caixa
import groovy.entity.Carrinho
import org.junit.Test
import static org.junit.Assert.*

/**
 *
 * @author pedro
 */
class Teste {

    private Carrinho carrinho
    private Caixa caixa

    @Test
    void teste1() {
        carrinho = new Carrinho()
        caixa = new Caixa(carrinho)

        carrinho.add("A")
        assertEquals(50, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(100, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(130, caixa.getTotalPrice(), 0)
        assertEquals(20, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(180, caixa.getTotalPrice(), 0)
        assertEquals(20, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(230, caixa.getTotalPrice(), 0)
        assertEquals(20, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(260, caixa.getTotalPrice(), 0)
        assertEquals(40, caixa.getTotalDiscount(), 0)
        carrinho.remove("A")
        assertEquals(230, caixa.getTotalPrice(), 0)
        assertEquals(20, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(260, caixa.getTotalPrice(), 0)
        assertEquals(40, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(300, caixa.getTotalPrice(), 0)
        assertEquals(50, caixa.getTotalDiscount(), 0)
    }

    @Test
    void teste2() {
        carrinho = new Carrinho()
        caixa = new Caixa(carrinho)

        carrinho.add("D")
        assertEquals(15, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(65, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("B")
        assertEquals(95, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(145, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("B")
        assertEquals(160, caixa.getTotalPrice(), 0)
        assertEquals(15, caixa.getTotalDiscount(), 0)
        carrinho.add("A")
        assertEquals(190, caixa.getTotalPrice(), 0)
        assertEquals(35, caixa.getTotalDiscount(), 0)
        carrinho.remove("A")
        assertEquals(160, caixa.getTotalPrice(), 0)
        assertEquals(15, caixa.getTotalDiscount(), 0)
        carrinho.remove("B")
        assertEquals(145, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
    }

    @Test
    void teste3() {
        carrinho = new Carrinho()
        caixa = new Caixa(carrinho)

        carrinho.add("C")
        assertEquals(20, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("C")
        assertEquals(40, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("C")
        assertEquals(40, caixa.getTotalPrice(), 0)
        assertEquals(20, caixa.getTotalDiscount(), 0)
        carrinho.add("C")
        assertEquals(60, caixa.getTotalPrice(), 0)
        assertEquals(20, caixa.getTotalDiscount(), 0)
        carrinho.remove("C")
        assertEquals(40, caixa.getTotalPrice(), 0)
        assertEquals(20, caixa.getTotalDiscount(), 0)
        carrinho.remove("C")
        assertEquals(40, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)

    }

    @Test
    void teste4() {
        carrinho = new Carrinho()
        caixa = new Caixa(carrinho)

        carrinho.add("C")
        assertEquals(20, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("B")
        assertEquals(50, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
        carrinho.add("B")
        assertEquals(65, caixa.getTotalPrice(), 0)
        assertEquals(15, caixa.getTotalDiscount(), 0)
        carrinho.remove("B")
        assertEquals(50, caixa.getTotalPrice(), 0)
        assertEquals(0, caixa.getTotalDiscount(), 0)
    }
}