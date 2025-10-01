package com.mycompany.agenciaespectral.model.evidencias;

import com.mycompany.agenciaespectral.interfaces.Psiquico;

public class SusurroEspectral extends Evidencia implements Psiquico {

    public SusurroEspectral(String nome, String localizacao, String descricao) {
        super(nome, localizacao, descricao);
    }

    @Override
    public String analisar() {
        return "O som registrado é quase imperceptível, mas parece humano...";
    }

    @Override
    public String sentirEnergia(String nomeDetetive) {
        return nomeDetetive + " percebe uma presença tentando se comunicar através dos sussurros.";
    }
}
