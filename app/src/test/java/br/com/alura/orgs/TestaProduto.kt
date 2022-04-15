package br.com.alura.orgs

import br.com.alura.orgs.model.Produto
import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal

class TestaProduto {

    @Test
    fun aoCriarUmProdutoComOValorCertoOValorDeveriaSerValido() {
        val produtoValido = Produto(
            nome = "Banana",
            descricao = "Banana prata",
            valor = BigDecimal("6.99")
        )

        val valorEhValido = produtoValido.valorEhValido

        assertTrue(valorEhValido)
    }

    @Test
    fun seOValorForMaiorQueCemReaisDeveDarErro() {
        //Arrange - Arrumar
        val produtoInvalido = Produto(
            nome = "Carambola",
            descricao = "Amarela",
            valor = BigDecimal("105.99")
        )

        //Act - Agir
        val valorEhValido = produtoInvalido.valorEhValido

        //Assert - Afirme
        assertFalse(valorEhValido)
    }

    @Test
    fun quandoOValorForMenorOuIgualAZeroValorEhValidoDeveSerFalso() {
        val produtoComValorIgualAZero = Produto(
            nome = "Lichia",
            descricao = "Doce",
            valor = BigDecimal("0")
        )
        val produtoComValorMenorQueZero = Produto(
            nome = "Uva",
            descricao = "Thompson",
            valor = BigDecimal("-10.99")
        )

        val valorIgualAZeroEhValido = produtoComValorIgualAZero.valorEhValido
        val valorMenorQueZeroEhValido = produtoComValorMenorQueZero.valorEhValido

        assertFalse(valorIgualAZeroEhValido)
        assertFalse(valorMenorQueZeroEhValido)
    }
}