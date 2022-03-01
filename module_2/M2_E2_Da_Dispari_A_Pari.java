package module_2;

import java.util.Arrays;
import java.util.Scanner;

public class M2_E2_Da_Dispari_A_Pari {

    //Scrivete una funzione che dato un array di valori ne restituisce una copia dove i numeri dispari
    //sono stati moltiplicati per 2.

    public static int[] valoriDispariRaddoppiati(int[] arrayValori) {
        int[] arrayDispari = new int[arrayValori.length];
        for (int i = 0; i < arrayDispari.length; i++) {
            if (arrayValori[i] % 2 != 0) {
                arrayDispari[i] = arrayValori[i] * 2;
            }
            else {
                arrayDispari[i] = arrayValori[i];
            }
        }
        return arrayDispari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indicare il numero di valori da inserire: ");
        int numValori = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Inserire i valori: ");
        int[] arrayValori = new int[numValori];
        for (int i = 0; i < numValori; i++) {
            arrayValori[i] = input.nextInt();
        }
        System.out.println("Il tuo array di valori è: " + Arrays.toString(arrayValori));

        System.out.println("L'array con i valori dispari raddippiati è: " + Arrays.toString(valoriDispariRaddoppiati(arrayValori)));
    }

}
