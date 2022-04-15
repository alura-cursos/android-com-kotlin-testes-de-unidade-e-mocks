package br.com.alura.orgs

import br.com.alura.orgs.model.Produto
import org.junit.Assert
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

        Assert.assertEquals(true, valorEhValido)
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
        Assert.assertEquals(false, valorEhValido)
    }
}