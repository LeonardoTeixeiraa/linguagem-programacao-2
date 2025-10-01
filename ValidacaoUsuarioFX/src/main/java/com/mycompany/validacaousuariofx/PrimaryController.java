package com.mycompany.validacaousuariofx;

import com.mycompany.validacaousuariofx.service.ValidadorUsuario;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML
    private TextField usernameTextField;
    @FXML
    private Label feedbackLabel;
    // O Controller tem uma instância do nosso serviço de validação.
    private final ValidadorUsuario validador = new ValidadorUsuario();

    @FXML
    private void handleValidar() {
        // 1. Pega os dados da tela
        String username = usernameTextField.getText();

        // 2. Delega a lógica para a classe de serviço
        String resultado = validador.validar(username);

        // 3. Atualiza a tela com o resultado
        feedbackLabel.setText(resultado);

        // Bônus: muda a cor do texto conforme o resultado
        if (resultado.startsWith("Erro:")) {
            feedbackLabel.setTextFill(Color.RED);
        } else {
            feedbackLabel.setTextFill(Color.GREEN);
        }
    }
}
