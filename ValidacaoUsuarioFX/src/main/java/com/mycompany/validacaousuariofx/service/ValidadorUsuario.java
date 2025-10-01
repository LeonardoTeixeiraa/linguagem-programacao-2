/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validacaousuariofx.service;

/**
 *
 * @author leonardo-teixeira
 */
public class ValidadorUsuario {

    /**
     * Valida um nome de usuário de acordo com as regras de negócio. Esta classe
     * não conhece o JavaFX. É 100% lógica pura.
     *
     * @param username O nome de usuário a ser validado.
     * @return Uma String com a mensagem de sucesso ou erro.
     */
    public String validar(String username) {
        if (username == null || username.trim().isEmpty()) {
            return "Erro: O nome de usuário não pode ser vazio.";
        }
        if (username.trim().length() <= 3) {
            return "Erro: O nome de usuário deve ter mais de 3 caracteres.";
        }
        // A expressão regular [a-zA-Z0-9]+ verifica se a string contém APENAS letras e numeros
        if (!username.matches("[a-zA-Z0-9]+")) {
            return "Erro: O nome de usuário não pode ter caracteres especiais.";
        }

        return "Sucesso: O nome de usuário é válido!";
    }
}
