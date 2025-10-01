package com.mycompany.agenciaespectral.model.evidencias;

import com.mycompany.agenciaespectral.interfaces.Interagivel;
import com.mycompany.agenciaespectral.interfaces.Psiquico;

public class ObjetoAmaldicoado extends Evidencia implements Interagivel, Psiquico {

    public ObjetoAmaldicoado(String nome, String localizacao, String descricao) {
        super(nome, localizacao, descricao);
    }

    @Override
    public String analisar() {
        return "O objeto parece antigo e exala uma energia estranha...";
    }

    @Override
    public String coletarAmostra(String nomeDetetive) {
        return nomeDetetive + " coletou uma amostra do objeto amaldiçoado.";
    }

    @Override
    public String sentirEnergia(String nomeDetetive) {
        return nomeDetetive + " sente uma energia maligna emanando do objeto.";
    }
}
