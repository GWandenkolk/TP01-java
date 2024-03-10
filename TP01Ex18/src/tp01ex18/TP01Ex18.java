/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp01ex18;
import java.util.Scanner;

/**
 *
 * @author Gabriela Otilia Wandenkolk Monteiro
 * 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
 */
public class TP01Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        double[] precos = new double[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor do " + (i + 1) + "º produto:");
            precos[i] = scanner.nextDouble();
            total += precos[i];
        }

        System.out.println("Digite o valor do pagamento:");
        double pagamento = scanner.nextDouble();

        double troco = pagamento - total;

        System.out.println("O troco a ser devolvido é: R$ " + troco);
    }
    
}
