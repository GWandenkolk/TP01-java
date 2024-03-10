/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex13;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
 */
public class TP01Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial (em m/s):");
        double velocidadeInicial = scanner.nextDouble();

        System.out.println("Digite a aceleração (em m/s^2):");
        double aceleracao = scanner.nextDouble();

        System.out.println("Digite o tempo de percurso (em s):");
        double tempo = scanner.nextDouble();

        double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        System.out.println("A velocidade final do automóvel é: " + velocidadeFinal + " m/s.");
    
    }
    
}
