package com.mycompany.agenciaespectral;

import com.mycompany.agenciaespectral.interfaces.Interagivel;
import com.mycompany.agenciaespectral.interfaces.Psiquico;
import com.mycompany.agenciaespectral.model.detetives.DetetiveCientista;
import com.mycompany.agenciaespectral.model.detetives.DetetiveParanormal;
import com.mycompany.agenciaespectral.model.evidencias.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {

    private List<Evidencia> pistasDoCaso = new ArrayList<>();
    private DetetiveCientista cientista;
    private DetetiveParanormal paranormal;

    private Evidencia evidenciaSelecionada;

    @FXML private RadioButton radioCientista;
    @FXML private RadioButton radioParanormal;
    @FXML private ListView<Evidencia> listViewEvidencias;
    @FXML private TextArea textAreaDetalhes;
    @FXML private Button btnAnalisar;
    @FXML private Button btnInteragir;
    @FXML private Button btnSentir;
    @FXML private ListView<String> listViewLogs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cientista = new DetetiveCientista("Dr. Aris Thorne");
        paranormal = new DetetiveParanormal("Luna Seraphina");

        criarPistasDoCaso();

        listViewEvidencias.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            evidenciaSelecionada = newVal;
            atualizarPainelDeAcoes();
        });
    }

    private void criarPistasDoCaso() {
        pistasDoCaso.add(new ObjetoAmaldicoado("Estátua Rachada", "Sótão", "Uma pequena estátua com marcas estranhas."));
        pistasDoCaso.add(new SusurroEspectral("Sussurros no Vento", "Corredor", "Vozes distantes ecoam."));
        pistasDoCaso.add(new ManuscritoAntigo("Manuscrito de Blackwood", "Biblioteca", "Texto antigo em latim."));
        pistasDoCaso.add(new PegadaEctoplasmatica("Pegadas Brilhantes", "Jardim", "Pegadas que brilham sob a lua."));
        pistasDoCaso.add(new VisaoFugaz("Aparição Passageira", "Salão Principal", "Uma figura fantasmagórica aparece por instantes."));

        atualizarListaVisual();
    }

    private void atualizarListaVisual() {
        listViewEvidencias.getItems().setAll(pistasDoCaso);
    }

    @FXML
    private void analisarPista() {
        if (evidenciaSelecionada != null) {
            adicionarLog(evidenciaSelecionada.analisar());
        }
    }

    @FXML
    private void interagirComPista() {
        if (evidenciaSelecionada instanceof Interagivel) {
            Interagivel inter = (Interagivel) evidenciaSelecionada;
            adicionarLog(inter.coletarAmostra(cientista.getNome()));
        }
    }

    @FXML
    private void sentirEnergiaDaPista() {
        if (evidenciaSelecionada instanceof Psiquico) {
            Psiquico psi = (Psiquico) evidenciaSelecionada;
            adicionarLog(psi.sentirEnergia(paranormal.getNome()));
        }
    }

    private void atualizarPainelDeAcoes() {
        if (evidenciaSelecionada == null) {
            btnAnalisar.setDisable(true);
            btnInteragir.setDisable(true);
            btnSentir.setDisable(true);
            textAreaDetalhes.clear();
            return;
        }

        textAreaDetalhes.setText(evidenciaSelecionada.getDescricao());
        btnAnalisar.setDisable(false);

        boolean isCientista = radioCientista.isSelected();
        boolean isParanormal = radioParanormal.isSelected();

        btnInteragir.setDisable(!(isCientista && evidenciaSelecionada instanceof Interagivel));
        btnSentir.setDisable(!(isParanormal && evidenciaSelecionada instanceof Psiquico));
    }

    private void adicionarLog(String mensagem) {
        listViewLogs.getItems().add(mensagem);
    }
}
