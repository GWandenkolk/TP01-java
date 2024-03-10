/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp07ex07;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados. 
 */
public class TP07Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
              Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os dois valores
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Calcula a média geométrica
        double mediaGeometrica = Math.sqrt(valor1 * valor2);

        // Exibe o resultado
        System.out.println("A média geométrica dos valores " + valor1 + " e " + valor2 + " é: " + mediaGeometrica);

        // Fecha o scanner
        scanner.close();1
        
    }
    
}
