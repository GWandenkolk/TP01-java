/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex11;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
 */
public class TP01Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o diâmetro do círculo:");
        double diametro = scanner.nextDouble();

        double raio = diametro / 2;
        double area = Math.PI * raio * raio;

        System.out.println("A área do círculo é: " + area + " unidades de área.");
    
    }
    
}
