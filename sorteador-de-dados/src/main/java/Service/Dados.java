/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardo-teixeira
 */
public class Dados {

    public int sortearNumeros() {
        return (int) (Math.random() * 6) + 1;
    }

    public int jogarDados(List<Integer> resultados) {
        resultados.clear();
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            int numero = sortearNumeros();
            resultados.add(numero);
            soma += numero;
        }

        if (resultados.get(0).equals(resultados.get(1)) && resultados.get(1).equals(resultados.get(2))) {
            return soma * 3;
        } else if (resultados.get(0).equals(resultados.get(1)) || 
                   resultados.get(0).equals(resultados.get(2)) || 
                   resultados.get(1).equals(resultados.get(2))) {
            return soma * 2;
        } else {
            return soma;
        }
    }
}

