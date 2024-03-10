/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02ex02;
import java.util.Scanner;

/**
 *
 *  @author Gabriela Otilia Wandenkolk Monteiro
 * 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será 
digitado. 
 */
public class TP02Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Cria um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o valor da aresta do quadrado
        System.out.print("Digite o valor da aresta do quadrado: ");
        double aresta = scanner.nextDouble();

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();

        // Calcula a área do quadrado
        double area = aresta * aresta;

        // Exibe o resultado
        System.out.println("A área do quadrado é: " + area);
    }
    
}
