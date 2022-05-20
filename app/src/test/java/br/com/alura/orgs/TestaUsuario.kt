package br.com.alura.orgs

import br.com.alura.orgs.model.Usuario
import org.junit.Assert
import org.junit.Test

class TestaUsuario {

    @Test
    fun `deve aceitar um usuario com email e senha valida`() {
        val usuarioValido = Usuario(
            id = "usuario",
            email = "usuario@valido.com",
            senha = "senhaforte123"
        )

        val resultado = usuarioValido.ehValido()


        Assert.assertTrue(resultado)
    }

    @Test
    fun `deve retornar falso com um usuario com email invalido`() {
        val usuarioInvalido = Usuario(
            id = "usuario",
            email = "usuarioInvalido.com",
            senha = "senhaforte123"
        )

        val resultado = usuarioInvalido.ehValido()

        Assert.assertFalse(resultado)
    }

    @Test
    fun `deve retornar falso com um usuario com senha invalida`() {
        val usuarioInvalido = Usuario(
            id = "usuario",
            email = "usuario@valido.com",
            senha = "fraca"
        )

        val resultado = usuarioInvalido.ehValido()

        Assert.assertFalse(resultado)
    }
}