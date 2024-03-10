/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp05ex05;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado. 
 */
public class TP05Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do diâmetro: ");
        double diametro = scanner.nextDouble();
        
         double raio = diametro / 2;

        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        
        System.out.println("O volume da esfera é: " + volume);
        
    }
    
}
