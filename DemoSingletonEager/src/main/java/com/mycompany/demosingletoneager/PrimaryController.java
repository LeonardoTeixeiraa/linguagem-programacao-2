package com.mycompany.demosingletoneager; // Adapte para o seu pacote
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
public class PrimaryController {
 // Variáveis para guardar as referências ao Singleton
 private ConexaoBancoDeDados con1;
 private ConexaoBancoDeDados con2;
 // Injeção dos componentes do FXML
 @FXML
 private Button btnInstancia1;
 @FXML
 private Button btnInstancia2;
 @FXML
 private Button btnComparar;
 @FXML
 private TextArea textAreaLogs;
 @FXML
 private void pegarInstancia1() {
 textAreaLogs.appendText("Botão 1 clicado. Pedindo instância...\n");
 // Pega a instância Singleton Eager
 con1 = ConexaoBancoDeDados.getInstance();
 textAreaLogs.appendText("Referência guardada em con1: " + con1.toString() + "\n\n");
 }
 @FXML
 private void pegarInstancia2() {
 textAreaLogs.appendText("Botão 2 clicado. Pedindo instância...\n");
 // Pega a mesma instância Singleton Eager
 con2 = ConexaoBancoDeDados.getInstance();
 textAreaLogs.appendText("Referência guardada em con2: " + con2.toString() + "\n\n");
 }
 @FXML
 private void compararInstancias() {
 if (con1 == null || con2 == null) {
 textAreaLogs.appendText("ERRO: Pegue as duas instâncias antes de comparar.\n\n");
 return;
 }

 textAreaLogs.appendText("Comparando as referências com (conf1 == conf2)...\n");
if (con1 == con2) {
textAreaLogs.appendText("RESULTADO: TRUE! As duas variáveis apontam para o MESMO objeto\n\n");
} else {
textAreaLogs.appendText("RESULTADO: FALSE! As variáveis apontam para objetos DIFERENTES (o que não deveria acontecer).\n\n");
}
 }
}