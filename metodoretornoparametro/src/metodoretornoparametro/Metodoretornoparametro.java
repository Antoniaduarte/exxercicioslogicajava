package metodoretornoparametro;

import java.util.Random;

public class Metodoretornoparametro {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("numero da sorte de hoje:" + gerarNumeroAleatorio());
            String hoje = obterDataHoraAtual();
        }
      /* for (int i = 1; i <= 6; i++) {
            System.out.println("a mensagem de hoje é:" + obterMen(i));
        }*/
      
            System.out.println("a mensagem de hoje é:" + obterMen(gerarNumeroAleatorio()));
        

    }

    public static int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public static String obterDataHoraAtual() {
        return java.time.LocalDateTime.now().toString();
    }

    public static String obterMen(int op) {
        String men = "";

        switch (op) {
            case 1:
                men = "fica em casa";
                break;
            case 2:
                men = "bora beber uma";
                break;
            case 3:
                men = "paga sua conta";
                break;
            case 4:
                men = " dia do sofá";
                break;
            case 5:
                men = "corre hora do churras";
                break;
            default:
                men = "pra lá";
        }
        return men;

    }

}
