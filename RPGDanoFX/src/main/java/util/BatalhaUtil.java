/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.mycompany.rpgdanofx.model.Atacante;
import java.util.Random;

/**
 *
 * @author leonardo-teixeira
 */
public class BatalhaUtil {
    Random random = new Random();
    
    public static boolean calculaAtaqueCritico(Atacante atacante){
        return random.nextDouble() < atacante.isAtaqueCritico();
    }
}
