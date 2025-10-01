package sorteadorDados;

import java.util.Scanner;

import sorteadorDados.model.Jogador;
import sorteadorDados.service.Dados;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();

        final int MAX_JOGADORES = 2;

        for (int i=0; i < MAX_JOGADORES; i++) {
            Jogador jogador = new Jogador();
            System.out.println("Informe o nome do jogador " + i + ": ");
            jogador.setNome(sc.nextLine());

        }

        System.out.print("Informe o nome do primeiro jogador: ");
        String jogador1 = sc.nextLine();

        System.out.print("Informe o nome do segundo jogador: ");
        String jogador2 = sc.nextLine();

        System.out.println("\n--- Jogada de " + jogador1 + " ---");
        int pontuacao1 = dados.jogarDados();
        System.out.println("Pontuação final: " + pontuacao1);

        System.out.println("\n--- Jogada de " + jogador2 + " ---");
        int pontuacao2 = dados.jogarDados();
        System.out.println("Pontuação final: " + pontuacao2);

        System.out.println("\n===== RESULTADO =====");
        if (pontuacao1 > pontuacao2) {
            System.out.println(jogador1 + " venceu!");
        } else if (pontuacao2 > pontuacao1) {
            System.out.println(jogador2 + " venceu!");
        } else {
            System.out.println("Empate!");
        }

        sc.close();
    }
}
