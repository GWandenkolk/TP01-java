/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp04ex04;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 
 */
public class TP04Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        
        double area = (base * altura)/2;
        
        System.out.println("A área do triângulo é: " + area);
    }
    
}
