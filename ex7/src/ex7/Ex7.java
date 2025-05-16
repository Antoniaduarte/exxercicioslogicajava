
package ex7;
import java.util.Scanner;
public class Ex7 {

   
      
        public static boolean ehPalindromo(String texto) {
        if (texto == null || texto.isEmpty()) {
            return true;
        }

       
        String textoLimpo = texto.replaceAll("\\s+", "").toLowerCase();

        int esquerda = 0;
        int direita = textoLimpo.length() - 1;

        while (esquerda < direita) {
            if (textoLimpo.charAt(esquerda) != textoLimpo.charAt(direita)) {
                return false; 
            }
            esquerda++;
            direita--;
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        if (ehPalindromo(texto)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
        
    }
    
}
