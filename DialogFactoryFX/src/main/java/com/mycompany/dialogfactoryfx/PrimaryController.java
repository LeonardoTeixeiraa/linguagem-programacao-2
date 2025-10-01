package com.mycompany.dialogfactoryfx;

import com.mycompany.dialogfactoryfx.factory.AlertaFactory;
import com.mycompany.dialogfactoryfx.factory.AlertaFactory.TipoAlerta;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PrimaryController {
    // O Controller não tem nenhum if/else para decidir qual alerta criar.
    // Ele apenas delega a tarefa para a fábrica.

    @FXML
    private void handleSucesso() {
        // 1. Pede um alerta de SUCESSO para a fábrica.
        Alert alerta = AlertaFactory.criarAlerta(TipoAlerta.SUCESSO, "O cadastro foi salvo no banco de dados  !");
 // 2. Exibe o alerta que a fábrica retornou.
 alerta.showAndWait();
    }

    @FXML
    private void handleErro() {
        // 1. Pede um alerta de ERRO para a fábrica.
        Alert alerta = AlertaFactory.criarAlerta(TipoAlerta.ERRO, "Não foi possível conectar ao servidor. Verifique sua conexão.");
 // 2. Exibe.
 alerta.showAndWait();
    }

    @FXML
    private void handleInfo() {
        // 1. Pede um alerta de INFO para a fábrica.
        Alert alerta = AlertaFactory.criarAlerta(TipoAlerta.INFO, "A manutenção do sistema está agendada para às 22h ");
 // 2. Exibe.
 alerta.showAndWait();
    }
}
