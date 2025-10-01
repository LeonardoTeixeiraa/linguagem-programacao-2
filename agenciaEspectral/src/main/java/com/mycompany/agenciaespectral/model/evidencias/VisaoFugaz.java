package com.mycompany.agenciaespectral.model.evidencias;

import com.mycompany.agenciaespectral.interfaces.Psiquico;

public class VisaoFugaz extends Evidencia implements Psiquico {

    public VisaoFugaz(String nome, String localizacao, String descricao) {
        super(nome, localizacao, descricao);
    }

    @Override
    public String analisar() {
        return "A visão dura apenas alguns segundos, mas mostra uma figura espectral.";
    }

    @Override
    public String sentirEnergia(String nomeDetetive) {
        return nomeDetetive + " sente uma energia súbita, como um arrepio intenso.";
    }
}
