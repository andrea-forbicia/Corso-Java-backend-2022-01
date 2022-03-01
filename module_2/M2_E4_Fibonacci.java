package module_2;

import java.util.Arrays;
import java.util.Scanner;

public class M2_E4_Fibonacci {

    /* Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci, nella quale ogni numero è
    definito dalla somma dei due precedenti, eccetto i primi due che sono per definizione 0 e 1.
    Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via.
    Assumete di iniziare da 0, dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via. */

   public static int[] sequenzaFibonacci(int n) {
       int[] values = new int[n];
       if (n == 1) {
           values[0] = 0;
       }
       else if (n == 2) {
           for (int i = 0; i < values.length; i++) {
               values[i] = i;
           }
       }
       else {
           for (int i = 0; i < 2; i++) {
               values[i] = i;
           }
           for (int i = 2; i < n; i++) {
               values[i] = values[i - 2] + values[i - 1];
           }
       }
       return values;
   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di elementi della sequenza di Fibonacci: ");
        int n = input.nextInt();

        System.out.println("Fibonacci(" + n + ") = " + Arrays.toString(sequenzaFibonacci(n)));
    }
}
