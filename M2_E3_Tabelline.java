import java.util.Arrays;
import java.util.Scanner;

public class M2_E3_Tabelline {

    /* Scrivete una funzione che dato in input due numeri n ed m, crea un array lungo m che in ogni cella
    ha il valore di indice della cella moltiplicato per n */

    public static int[] tabellina(int n, int m) {
        int[] tabellina = new int[m];
        for (int i = 0; i < tabellina.length; i++) {
            tabellina[i] = n * i;
        }
        return tabellina;
    }

    public static void main(String[] args) {
        Scanner inputN = new Scanner(System.in);
        System.out.println("Inserire il valore del moltiplicatore: ");
        int n = inputN.nextInt();

        Scanner inputM = new Scanner(System.in);
        System.out.println("Inserire la quantità dei prodotti: ");
        int m = inputM.nextInt();

        System.out.println("La tabellina del " + n + " è: " + Arrays.toString(tabellina(n, m)));
    }
}
