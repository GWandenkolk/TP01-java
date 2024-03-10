/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03ex03;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado. 
 */
public class TP03Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();
        
        double area = (diagonal * diagonal)/2;
        
        System.out.println("Área do quadrado é: "+area);
        
    }
    
}
