
package ex5;
import java.util.Scanner;
public class Ex5 {
        public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1; 
        }

        if (numero == 0 || numero == 1) {
            return 1; 
        }

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);

        if (fatorial == -1) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        
    }
    
}
