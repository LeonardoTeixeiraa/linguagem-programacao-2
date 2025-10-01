package com.mycompany.dialogfactoryfx.factory;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/**
* PONTO-CHAVE: A CLASSE FÁBRICA.
* Sua única responsabilidade é criar e configurar objetos (neste caso, Alertas).
* Ela centraliza a lógica de criação, escondendo a complexidade do resto do sistema.
*/
public class AlertaFactory {
 // Enum para definir os tipos de alerta que nossa fábrica pode criar.
 // Usar um enum torna o código mais seguro e legível do que usar Strings.
 public enum TipoAlerta {
 SUCESSO,
 ERRO,
 INFO
 }
 /**
 * Este é o nosso FACTORY METHOD.
 * Ele recebe um "tipo" e retorna um objeto Alert configurado.
 * O Controller que chama este método não precisa saber como um Alert é
 * criado ou configurado, ele apenas pede por um.
 * * @param tipo O tipo de alerta desejado (SUCESSO, ERRO, INFO).
 * @param mensagem A mensagem a ser exibida no corpo do diálogo.
 * @return Um objeto Alert pronto para ser exibido.
 */
 public static Alert criarAlerta(TipoAlerta tipo, String mensagem) {
 Alert alert;
 switch (tipo) {
 case SUCESSO:
 // Cria um alerta do tipo Confirmação (ícone verde)
 alert = new Alert(AlertType.CONFIRMATION);
 alert.setTitle("Sucesso!");
 alert.setHeaderText("Operação concluída com sucesso.");
 break;
 case ERRO:
 // Cria um alerta do tipo Erro (ícone vermelho)
 alert = new Alert(AlertType.ERROR);
 alert.setTitle("Erro!");
 alert.setHeaderText("Ocorreu um erro na operação.");
 break;
 case INFO:
 // Cria um alerta do tipo Informação (ícone azul)
 alert = new Alert(AlertType.INFORMATION);
 alert.setTitle("Informação");
 alert.setHeaderText("Aviso importante.");
 break;
 default:
 // Caso um tipo desconhecido seja passado, cria um alerta genérico.
 alert = new Alert(AlertType.NONE);
 alert.setTitle("Alerta");
 alert.setHeaderText(null);
 }
 // Configuração comum a todos os alertas
 alert.setContentText(mensagem);
 return alert;
 }
}