/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demolazyvseager;

/**
 *
 * @author leonardo-teixeira
 */
public class GerenciadorDeTema {
 private static GerenciadorDeTema instancia;
 private String temaAtual = "claro";
 private GerenciadorDeTema() {
 // Construtor privado
 System.out.println(">>> [LAZY] Singleton GerenciadorDeTema foi criado AGORA!");
 }
 public static GerenciadorDeTema getInstance() {
     if (instancia == null) {
    instancia = new GerenciadorDeTema();
 }
 return instancia;
 }
 
 public void setTema(String tema) { 
     this.temaAtual = tema; 
 }
 public String getTemaAtual() { 
     return this.temaAtual; 
 }
}