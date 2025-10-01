/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciaespectral.model.evidencias;

/**
 *
 * @author leonardo-teixeira
 */
// TODO: Transforme esta classe em uma CLASSE ABSTRATA.
public abstract class Evidencia {
// TODO: Declare os atributos PROTECTED: String nome, String localizacao, String descricao.
    protected String nome;
    protected String localizacao;

    public String getDescricao() {
        return descricao;
    }
    protected String descricao;
// TODO: Crie um construtor que inicialize todos os atributos.
    public Evidencia(String nome, String localizacao, String descricao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.descricao = descricao;
    }
    
// TODO: Declare um método ABSTRATO chamado analisar() que retorna uma String.
    public abstract String analisar();

    @Override
    public String toString() {
        return this.nome + " (" + this.localizacao + ")";
    }
}
