
package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

   public static boolean ehNumeroPerfeito(int numero) {
       
        if (numero <= 1) {
            return false;
        }

        int somaDivisores = 1;

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
                if (i * i != numero) { 
                    somaDivisores += numero / i;
                }
            }
        }

        return somaDivisores == numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (ehNumeroPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
    }
    
}
