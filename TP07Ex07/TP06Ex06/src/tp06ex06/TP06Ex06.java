/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp06ex06;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão 
digitados. 
 */
public class TP06Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o 1º valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o 2º valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.println("Digite o 3º valor: ");
        double valor3 = scanner.nextDouble();
        
        System.out.println("Digite o 4º valor: ");
        double valor4 = scanner.nextDouble();
        
        double mediaaritmedica = (valor1 * valor2 * valor3 * valor4) / 4;
        
        System.out.println("A média aritmédica é: " + mediaaritmedica);
        
        
    }
    
}
