
package ex9;

public class Ex9 {

   
        
         public static double calcularPorcentagem(double valorTotal, double porcentagem) {
       
        double resultado = (valorTotal * porcentagem) / 100;
        return resultado;
    }

    public static void main(String[] args) {
        
        double valorTotal = 150.0;
        double porcentagem = 20.0;

        double valorDaPorcentagem = calcularPorcentagem(valorTotal, porcentagem);

        System.out.println("O valor de " + porcentagem + "% de " + valorTotal + " é: " + valorDaPorcentagem);
    }
        
    }
    
