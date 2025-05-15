
package ex3;

import java.util.Scanner;

public class Ex3 {
         public static int maiorValorAbsoluto(int[] array) {
             
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE; 
        }

        int maiorAbsoluto = Integer.MIN_VALUE;

        for (int valor : array) {
            int valorAbsoluto = Math.abs(valor); 
            if (valorAbsoluto > maiorAbsoluto) {
                maiorAbsoluto = valorAbsoluto;
            }
        }

        return maiorAbsoluto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maior = maiorValorAbsoluto(array);

        if (maior == Integer.MIN_VALUE) {
            System.out.println("O array está vazio ou é nulo.");
        } else {
            System.out.println("O maior valor absoluto é: " + maior);
        }
    }
    
}
