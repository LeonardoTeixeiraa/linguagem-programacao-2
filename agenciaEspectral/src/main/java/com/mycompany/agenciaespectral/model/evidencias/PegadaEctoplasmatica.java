package com.mycompany.agenciaespectral.model.evidencias;

import com.mycompany.agenciaespectral.interfaces.Interagivel;

public class PegadaEctoplasmatica extends Evidencia implements Interagivel {

    public PegadaEctoplasmatica(String nome, String localizacao, String descricao) {
        super(nome, localizacao, descricao);
    }

    @Override
    public String analisar() {
        return "As pegadas brilham levemente sob luz ultravioleta.";
    }

    @Override
    public String coletarAmostra(String nomeDetetive) {
        return nomeDetetive + " coletou uma amostra da substância ectoplasmática.";
    }
}
