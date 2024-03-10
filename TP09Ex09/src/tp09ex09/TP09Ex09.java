/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp09ex09;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 */
public class TP09Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da resistência (em ohms):");
        double resistencia = scanner.nextDouble();

        System.out.println("Digite o valor da corrente elétrica (em ampères):");
        double corrente = scanner.nextDouble();

        double tensao = resistencia * corrente;

        System.out.println("A tensão no circuito é: " + tensao + " volts.");
    }
    
}
