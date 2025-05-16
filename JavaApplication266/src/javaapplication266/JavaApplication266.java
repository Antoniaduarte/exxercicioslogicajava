
package javaapplication266;
import java.util.Scanner;
public class JavaApplication266 {

    public static void main(String[] args) {
        // TODO code application logic here
       int numero, fat = 1;
Scanner ler = new Scanner(System.in);
        System.out.println("digite o numero do fatorial desejado?:");
        numero= ler.nextInt();  
if (numero <=13) // 13 é a quantidade que java aceita no fatorial{    
for( int cont=1; cont <= numero; cont++){
    fat= fat*cont;
        System.out.println("o fatoria é:"+ fat);
}else{
    System.out.println("impossivel resolver" + fat);
}


    }
    
}
