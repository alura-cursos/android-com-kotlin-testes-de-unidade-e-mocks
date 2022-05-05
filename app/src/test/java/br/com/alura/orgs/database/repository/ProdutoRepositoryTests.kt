package br.com.alura.orgs.database.repository

import android.content.Context
import br.com.alura.orgs.database.AppDatabase
import br.com.alura.orgs.database.dao.ProdutoDao
import br.com.alura.orgs.extensions.toast
import br.com.alura.orgs.model.Produto
import io.mockk.InternalPlatformDsl.toArray
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

import org.junit.Assert.*
import java.math.BigDecimal

class ProdutoRepositoryTests {

    @Test
    fun salva() {
        //Arrange - Config
        val dao = mockk<ProdutoDao>()
        val produtoRepository = ProdutoRepository(dao)
        val produto = Produto(
            nome = "Banana",
            descricao = "Banana prata",
            valor = BigDecimal("6.99")
        )
        //Act
        produtoRepository.salva(produto)

        verify {
            dao.salva(produto)
        }
    }
}