
package ex2;

import java.util.Scanner;

public class Ex2 {

      public static String substituirVogaisPorAsterisco(String texto) {
              
   if (texto == null || texto.isEmpty()) {
       return texto; 
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            char caractereMinusculo = Character.toLowerCase(caractere); 

            if (caractereMinusculo == 'a' || caractereMinusculo == 'e' || caractereMinusculo == 'i' || caractereMinusculo == 'o' || caractereMinusculo == 'u') {
                resultado.append('*'); 
            } else {
                resultado.append(caractere);
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        String resultado = substituirVogaisPorAsterisco(texto);
        System.out.println("String com vogais substituídas: " + resultado);

        scanner.close();
    }
    
}
