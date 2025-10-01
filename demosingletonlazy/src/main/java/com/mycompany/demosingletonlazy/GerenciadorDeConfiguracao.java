/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demosingletonlazy;

/**
 *
 * @author leonardo-teixeira
 */
// GerenciadorDeConfiguracao.java
public class GerenciadorDeConfiguracao {
 private static GerenciadorDeConfiguracao instancia;
 // Construtor privado para evitar new
 private GerenciadorDeConfiguracao() {
 // MENSAGEM CHAVE PARA A DEMONSTRAÇÃO
 System.out.println("=================================================");
 System.out.println("### OBJETO GerenciadorDeConfiguracao CRIADO! ###");
 System.out.println("O construtor foi chamado apenas uma vez.");
 System.out.println("=================================================");
 }
 public static GerenciadorDeConfiguracao getInstance() {
 // A verificação "lazy": só cria se for nulo
 if (instancia == null) {
 instancia = new GerenciadorDeConfiguracao();
 }
 return instancia;
 }
}