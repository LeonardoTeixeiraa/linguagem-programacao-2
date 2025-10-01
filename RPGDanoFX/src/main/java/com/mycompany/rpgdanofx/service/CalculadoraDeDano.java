package com.mycompany.rpgdanofx.service;

import com.mycompany.rpgdanofx.model.Alvo;
import com.mycompany.rpgdanofx.model.Atacante;

public class CalculadoraDeDano {

    public int calcularDano(Atacante atacante, Alvo alvo, boolean isCritico) {
        // TODO: Implemente a lógica de cálculo de dano aqui.
        // 1. Calcule o dano base (força - defesa). O dano mínimo é 0.
        int danoBase = atacante.getForca() - alvo.getDefesa();
        if (danoBase < 0) {
            danoBase = 0;
        }
        // 2. Se for um acerto crítico (isCritico == true), duplique o dano base.
        if (isCritico) {
            danoBase *= 2;
        }
        // 3. Calcule o dano final com base nas fraquezas e resistências:
        
        // - Se o tipoAtaque do atacante for igual à fraqueza do alvo, duplique o dano.
        
        // - Se o tipoAtaque for igual à resistência, reduza o dano pela metade.
        
        // 4. Retorne o dano final como um inteiro.
        {
            return 0; // Apague esta linha e retorne seu cálculo.
        }
    }
