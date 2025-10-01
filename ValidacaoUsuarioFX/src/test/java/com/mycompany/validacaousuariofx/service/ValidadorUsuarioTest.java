/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.validacaousuariofx.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leonardo-teixeira
 */
public class ValidadorUsuarioTest {

    // Teste 1: Username vazio ou com espaços
    @Test
    public void testValidarDeveRetornarErroParaUsernameVazio() {
        // Arrange (Arrumar)
        ValidadorUsuario validador = new ValidadorUsuario();
        String inputVazio = "";
        String inputComEspacos = " ";
        String esperado = "Erro: O nome de usuário não pode ser vazio.";

        // Act (Agir)
        String resultadoVazio = validador.validar(inputVazio);
        String resultadoComEspacos = validador.validar(inputComEspacos);

        // Assert (Verificar)
        assertEquals(esperado, resultadoVazio);
        assertEquals(esperado, resultadoComEspacos);
    }

    // Teste 2: Username curto
    @Test
    public void testValidarDeveRetornarErroParaUsernameCurto() {
        // Arrange
        ValidadorUsuario validador = new ValidadorUsuario();
        String input = "abc";
        String esperado = "Erro: O nome de usuário deve ter mais de 3 caracteres.";

        // Act
        String resultado = validador.validar(input);

        // Assert
        assertEquals(esperado, resultado);
    }

//     Teste 3: Username com caracteres especiais
    @Test
    public void testValidarDeveRetornarErroParaUsernameComCaracteresEspeciais() {
        // Arrange
        ValidadorUsuario validador = new ValidadorUsuario();
        String input = "user@123";
        String esperado = "Erro: O nome de usuário não pode ter caracteres especiais.";

        // Act
        String resultado = validador.validar(input);

        // Assert
        assertEquals(esperado, resultado);
    }
    // Teste 4: Username válido

    @Test
    public void testValidarDeveRetornarSucessoParaUsernameValido() {
        // Arrange
        ValidadorUsuario validador = new ValidadorUsuario();
        String input = "UsuarioValido123";
        String esperado = "Sucesso: O nome de usuário é válido!";

        // Act
        String resultado = validador.validar(input);

        // Assert
        assertEquals(esperado, resultado);
    }

    /**
     * TESTE PROJETADO PARA FALHAR. O objetivo é ver como o JUnit reporta um
     * erro quando o resultado obtido é DIFERENTE do resultado esperado.
     */
//    @Test
//    public void testValidarDeveFalharPropositalmente() {
//        // Arrange (Arrumar)
//        ValidadorUsuario validador = new ValidadorUsuario();
//        String inputCurto = "ab";
//
//        // PONTO-CHAVE: Aqui está o erro intencional.
//        // A lógica correta retorna "Erro: O nome de usuário deve ter mais de 3 caracteres.",
//        // mas nós vamos "esperar" uma mensagem completamente diferente.
//        String esperadoErrado = "SUCESSO! O NOME É VÁLIDO!";
//
//        // Act (Agir)
//        String resultadoObtido = validador.validar(inputCurto);
//
//        // Assert (Verificar)
//        // O JUnit vai comparar o 'resultadoObtido' com o 'esperadoErrado'.
//        // Como eles são diferentes, o teste irá FALHAR.
//        assertEquals(esperadoErrado, resultadoObtido);
//    }

}
