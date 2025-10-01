package sorteadorDados.service;

import java.util.ArrayList;
import java.util.List;

public class Dados {

    public int sortearNumeros() {
        return (int) (Math.random() * 6) + 1;
    }

    public int jogarDados() {
        List<Integer> valores = new ArrayList<>();
        int soma = 0;

        // Sorteia e guarda os valores
        for (int i = 0; i < 3; i++) {
            int numero = sortearNumeros();
            valores.add(numero);
            soma += numero;
            System.out.println("Dado " + (i + 1) + " = " + numero);
        }

        // Regras de pontuação
        if (valores.get(0).equals(valores.get(1)) && valores.get(1).equals(valores.get(2))) {
            System.out.println("Pontuação triplicada.");
            return soma * 3;
        } else if (valores.get(0).equals(valores.get(1)) ||
                valores.get(0).equals(valores.get(2)) ||
                valores.get(1).equals(valores.get(2))) {
            System.out.println("Pontuação dobrada.");
            return soma * 2;
        } else {
            return soma;
        }
    }
}
