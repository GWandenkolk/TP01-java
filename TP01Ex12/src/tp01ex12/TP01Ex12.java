/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex12;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
 */
public class TP01Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do cone:");
        double altura = scanner.nextDouble();

        System.out.println("Digite o raio da base do cone:");
        double raio = scanner.nextDouble();

        double volume = (Math.PI * raio * raio * altura) / 3;

        System.out.println("O volume do cone é: " + volume + " unidades cúbicas.");
    }
    
}
