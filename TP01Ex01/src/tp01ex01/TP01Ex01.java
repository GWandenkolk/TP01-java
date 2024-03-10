/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex01;

import java.util.Scanner;

/**
 * * @author Gabriela Otilia Wandenkolk Monteiro
 * 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
 */
public class TP01Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor da base do retângulo:");
        double base = scanner.nextDouble();
        
         System.out.println("Digite o valor da altura do retângulo:");
        double altura = scanner.nextDouble();
    
        double area = base * altura;
    
        System.out.println("A área do retângulo é: " + area);
    }
}


