package br.com.alura.orgs.database.repository

import android.content.Context
import br.com.alura.orgs.database.AppDatabase
import br.com.alura.orgs.extensions.toast
import io.mockk.InternalPlatformDsl.toArray
import io.mockk.mockk
import org.junit.Test

import org.junit.Assert.*

class ProdutoRepositoryTests {

    @Test
    fun salva() {
        //Arrange - Config
        val context = mockk<Context>()
        print(context)
        context.getText(43453)
//        ProdutoRepository(AppDatabase.instancia())
    }
}