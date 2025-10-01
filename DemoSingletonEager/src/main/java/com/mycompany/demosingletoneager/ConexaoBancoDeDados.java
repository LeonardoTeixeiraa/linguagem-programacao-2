/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demosingletoneager;

/**
 *
 * @author leonardo-teixeira
 */
// ConexaoBancoDeDados.java
public class ConexaoBancoDeDados {
 // A mágica do Eager acontece aqui:
 // A instância é criada e atribuída assim que a classe é carregada pela JVM.
 private static ConexaoBancoDeDados instancia = new ConexaoBancoDeDados();
 // Construtor privado para evitar `new`
 private ConexaoBancoDeDados() {
 // MENSAGEM CHAVE PARA A DEMONSTRAÇÃO EAGER
 System.out.println("=================================================");
 System.out.println("### OBJETO ConexaoBancoDeDados CRIADO! ###");
 System.out.println("O construtor foi chamado durante o carregamento da classe.");
 System.out.println("=================================================");
 }
 public static ConexaoBancoDeDados getInstance() {
 // Apenas retorna a instância que já foi criada.
 return instancia;
 }
}