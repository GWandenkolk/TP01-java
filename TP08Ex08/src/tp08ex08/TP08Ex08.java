/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp08ex08;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
 */
public class TP08Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de milhas marítimas:");
        double milhasMaritimas = scanner.nextDouble();

        double quilometros = milhasMaritimas * 1852 / 1000;

        System.out.println(milhasMaritimas + " milhas marítimas equivalem a " + quilometros + " quilômetros.");
    }
    
}
