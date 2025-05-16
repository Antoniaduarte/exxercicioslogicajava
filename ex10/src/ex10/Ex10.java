
package ex10;

import java.util.Scanner;

public class Ex10 {

    public static boolean isFibonacci(int numero) {
        if (numero < 0) {
            return false; 
        }

        if (numero == 0 || numero == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int proximo = a + b;

        while (proximo <= numero) {
            if (proximo == numero) {
                return true; 
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
    }
    
}
