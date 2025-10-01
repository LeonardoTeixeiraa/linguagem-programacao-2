package com.mycompany.agenciaespectral.model.evidencias;

import com.mycompany.agenciaespectral.interfaces.Interagivel;

public class ManuscritoAntigo extends Evidencia implements Interagivel {

    public ManuscritoAntigo(String nome, String localizacao, String descricao) {
        super(nome, localizacao, descricao);
    }

    @Override
    public String analisar() {
        return "As páginas falam de rituais proibidos e símbolos estranhos...";
    }

    @Override
    public String coletarAmostra(String nomeDetetive) {
        return nomeDetetive + " analisou cuidadosamente o manuscrito e fez anotações.";
    }
}
