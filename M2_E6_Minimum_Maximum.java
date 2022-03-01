import java.util.Arrays;
import java.util.Scanner;

public class M2_E6_Minimum_Maximum {
//    Dato un array di interi (inseriti dall’utente, separati da virgola e senza spazi),
//    effettuare la conversione dei valori in interi e stampare in ordine minimo e massimo
//    (separati da virgola).
//    Gli interi inseriti possono anche assumere valori negativi.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String myString = input.nextLine();

        String[] splitString = myString.split(",");

        int[] convertString = new int[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            convertString[i] = Integer.parseInt(splitString[i]);
        }

        Arrays.sort(convertString);

        System.out.print(Arrays.toString(convertString));
    }
}
