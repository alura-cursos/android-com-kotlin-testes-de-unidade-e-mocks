package br.com.alura.orgs.database.repository

import br.com.alura.orgs.database.dao.UsuarioDao
import br.com.alura.orgs.database.repository.UsuarioRepository
import br.com.alura.orgs.model.Usuario
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Test

class UsuarioRepositoryTests {
    private val mockDao = mockk<UsuarioDao>()
    private val usuario: Usuario = Usuario(
        id = "teste",
        email = "emailValido@email.com",
        senha = "senhaForte"
    )

    @Test
    fun `deve salvar um usuario quando chamado o salva do repository`() = runTest {
        coEvery { mockDao.salva(usuario) } returns Unit
        val usuarioRepository = UsuarioRepository(mockDao)

        usuarioRepository.salva(usuario)

        coVerify(exactly = 1) {
            mockDao.salva(usuario)
        }
    }

    @Test
    fun `deve logar um usuario quando chamado o autentica do repository`() = runTest {
        coEvery {
            mockDao.autentica(usuario.id, usuario.senha)
        } returns mockk()

        val usuarioRepository = UsuarioRepository(mockDao)
        usuarioRepository.autentica(usuario.id, usuario.senha)

        coVerify(exactly = 1) {
            mockDao.autentica(usuario.id, usuario.senha)
        }
    }
}