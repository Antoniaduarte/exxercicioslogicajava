
package ex4;

import java.util.Scanner;

public class Ex4 {

public static String stringComMaisVogais(String[] array) {
        if (array == null || array.length == 0) {
            return null; 
        }

        String stringComMaisVogais = null;
        int maiorNumeroDeVogais = -1;

        for (String str : array) {
            if (str != null) {
                int numeroDeVogais = contarVogais(str);
                if (numeroDeVogais > maiorNumeroDeVogais) {
                    maiorNumeroDeVogais = numeroDeVogais;
                    stringComMaisVogais = str;
                }
            }
        }

        return stringComMaisVogais;
    }

    private static int contarVogais(String str) {
        int contador = 0;
        if (str != null) {
            str = str.toLowerCase(); 
            for (int i = 0; i < str.length(); i++) {
                char caractere = str.charAt(i);
                if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array de strings: ");
        int tamanho = scanner.nextInt();
        scanner.nextLine(); 

        String[] array = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a string " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        String resultado = stringComMaisVogais(array);

        if (resultado != null) {
            System.out.println("A string com mais vogais é: " + resultado);
        } else {
            System.out.println("O array está vazio ou nulo.");
        }

    }
}

       