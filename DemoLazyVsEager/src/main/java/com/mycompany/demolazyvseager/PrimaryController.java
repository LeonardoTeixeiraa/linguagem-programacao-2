package com.mycompany.demolazyvseager;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
public class PrimaryController {
 @FXML
 private TextArea textAreaLogs;
 @FXML
 private void usarGerenciadorDeTema() {
 log("Botão 'Usar o Tema' clicado...");
 // A instância SÓ SERÁ CRIADA AQUI, na primeira vez.
 GerenciadorDeTema tema = GerenciadorDeTema.getInstance();
 tema.setTema("escuro");
 log("Tema alterado para: " + tema.getTemaAtual());
 log("-----------------------------------");
 }
 @FXML
 private void preCarregarRelatorios() {
 log("Botão 'Pré-carregar' clicado... A aplicação pode parecer travada por 3s.");
 // Chamamos nosso método especial para FORÇAR a criação da instância.
 CacheDeRelatorios.preCarregar();
 log("Pré-carregamento concluído! O objeto de relatório já existe.");
 log("-----------------------------------");
 }
 @FXML
 private void gerarRelatorio() {
 CacheDeRelatorios cache;
 log("Botão 'Gerar Relatório' clicado...");
 // Pedimos a instância. Como ela já foi pré-carregada, o retorno é instantâneo.
 // altera código para receber a instância CacheDeRelatorios cache =
 log("Relatório obtido instantaneamente do cache: " + cache.getDadosDoRelatorio());
 log("-----------------------------------");
 }

 // Método auxiliar para facilitar a escrita no log
 private void log(String message) {
 textAreaLogs.appendText(message + "\n");
 }
}