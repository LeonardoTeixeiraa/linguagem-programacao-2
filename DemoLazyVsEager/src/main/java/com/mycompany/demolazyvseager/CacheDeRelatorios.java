/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demolazyvseager;

/**
 *
 * @author leonardo-teixeira
 */
public class CacheDeRelatorios {

// Método Eager
 private String dadosDoRelatorio;
 private CacheDeRelatorios() {
 // Construtor privado que simula um trabalho pesado
 System.out.println(">>> [EAGER] Singleton CacheDeRelatorios está sendo criado...");
 try {
 // Simula uma busca demorada no banco de dados ou processamento de dados
 Thread.sleep(3000); // Pausa de 3 segundos
 this.dadosDoRelatorio = "Relatório de Vendas de Setembro gerado com sucesso!";
 } catch (InterruptedException e) {
 Thread.currentThread().interrupt();
 }
 System.out.println(">>> [EAGER] ...criação concluída!");
 }

 /**
 * Este é o nosso gatilho "Eager" acionado pelo botão.
 * Ele força a criação da instância antes do uso final.
 */
 public static void preCarregar() {
//Comparar instâncias
 }
 /**
 * O método getInstance() tradicional. Se o pré-carregamento já ocorreu,
 * ele retorna a instância instantaneamente. Se não, ele fará a carga pesada.
 */
 public static CacheDeRelatorios getInstance() {
 if (instancia == null) {
 instancia = new CacheDeRelatorios(); // Carga preguiçosa como fallback
 }
 return instancia;
 }

 public String getDadosDoRelatorio() { return this.dadosDoRelatorio; }
}
