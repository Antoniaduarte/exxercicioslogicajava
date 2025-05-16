
 
package metodo.retorno;

import java.util.Random;


public class MetodoRetorno {

  
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            System.out.println("numero da sorte de hoje:" + gerarNumeroAleatorio());
        }
        String hoje = obterDataHoraAtual();
        System.out.println(hoje);
    }
    public static int gerarNumeroAleatorio(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
    public static String obterDataHoraAtual(){
        return java.time.LocalDateTime.now().toString();
    }
}
