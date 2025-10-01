package com.mycompany.demosingletonlazy; // Adapte para o seu pacote
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
public class PrimaryController {
 // 1. Variáveis para guardar as referências ao Singleton
 private GerenciadorDeConfiguracao conf1;
 private GerenciadorDeConfiguracao conf2;
 // 2. Injeção dos componentes do FXML no Controller
 @FXML
 private Button btnInstancia1;
 @FXML
 private Button btnInstancia2;
 @FXML
 private Button btnComparar;
 @FXML
 private TextArea textAreaLogs;
 // 3. Método chamado ao clicar no primeiro botão
 @FXML
 private void pegarInstancia1() {
 textAreaLogs.appendText("Botão 1 clicado. Pedindo instância...\n");
 // Pega a instância do Singleton pela primeira vez
 conf1 = GerenciadorDeConfiguracao.getInstance();
 // Exibe o endereço de memória do objeto (hashcode)
 textAreaLogs.appendText("Referência guardada em conf1: " + conf1.toString() + "\n\n");
 }
 // 4. Método chamado ao clicar no segundo botão
 @FXML
 private void pegarInstancia2() {
 textAreaLogs.appendText("Botão 2 clicado. Pedindo instância...\n");
 // Pega a instância do Singleton novamente
 conf2 = GerenciadorDeConfiguracao.getInstance();
 textAreaLogs.appendText("Referência guardada em conf2: " + conf2.toString() + "\n\n");
 }
 // 5. Método para comparar as duas referências
 @FXML
 private void compararInstancias() {
 if (conf1 == null || conf2 == null) {
 textAreaLogs.appendText("ERRO: Pegue as duas instâncias antes de comparar.\n\n");
 return;
 }

textAreaLogs.appendText("Comparando as referências com (conf1 == conf2)...\n");
if (conf1 == conf2) {
textAreaLogs.appendText("RESULTADO: TRUE! As duas variáveis apontam para o MESMO objeto\n\n");
} else {
textAreaLogs.appendText("RESULTADO: FALSE! As variáveis apontam para objetos DIFERENTES (o que não deveria acontecer).\n\n");
}
}
}