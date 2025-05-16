
package ex8;

public class Ex8 {

         public static int[] inverterArray(int[] arrayOriginal) {
        if (arrayOriginal == null || arrayOriginal.length == 0) {
            return new int[0]; 
        }

        int tamanho = arrayOriginal.length;
        int[] arrayInvertido = new int[tamanho];

       
        for (int i = 0; i < tamanho; i++) {
            arrayInvertido[i] = arrayOriginal[tamanho - 1 - i];
        }

        return arrayInvertido;
    }

    public static void main(String[] args) {
     
        int[] arrayExemplo = {1, 2, 3, 4, 5};
        int[] arrayInvertido = inverterArray(arrayExemplo);

        System.out.print("Array original: ");
        for (int i = 0; i < arrayExemplo.length; i++) {
            System.out.print(arrayExemplo[i] + " ");
        }
        System.out.println();

        System.out.print("Array invertido: ");
        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.print(arrayInvertido[i] + " ");
        }
         
    }
    
}
