package br.com.alura.orgs.database.repository

import br.com.alura.orgs.database.AppDatabase
import org.junit.Test

import org.junit.Assert.*

class ProdutoRepositoryTests {

    @Test
    fun salva() {
        //Arrange - Config
        ProdutoRepository(AppDatabase.instancia())
    }
}