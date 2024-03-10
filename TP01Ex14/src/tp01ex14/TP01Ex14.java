/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex14;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
 */
public class TP01Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da esfera (em metros):");
        double raio = scanner.nextDouble();

        System.out.println("Digite a aresta do cubo (em metros):");
        double aresta = scanner.nextDouble();

        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        double volumeCubo = Math.pow(aresta, 3);
        double volumeLivre = volumeCubo - volumeEsfera;

        System.out.println("O volume livre do ambiente é: " + volumeLivre + " metros cúbicos.");
    
    }
    
}
