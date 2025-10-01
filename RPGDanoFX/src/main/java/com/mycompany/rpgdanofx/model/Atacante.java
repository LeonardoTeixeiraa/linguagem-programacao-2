/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpgdanofx.model;

/**
 *
 * @author leonardo-teixeira
 */
public class Atacante {
    private double ataqueCritico;

    public Atacante(double ataqueCritico, int forca, String tipoAtaque) {
        this.ataqueCritico = ataqueCritico;
        this.forca = forca;
        this.tipoAtaque = tipoAtaque;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public int forca;
    public String tipoAtaque;
}
