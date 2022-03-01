package module_1;

import java.util.Scanner;

public class M1_E4_Replace_Intruders {

    /* Date tre stringhe a, b e c in input, stampare c dopo aver rimpiazzato, all’interno di c,
    ogni occorrenza compresa tra due spazi di a con b. Ad esempio, date in input le stringhe «a», «b», «a abc d»,
    stampare a video «a bbc d». Potete dare per assunto che la stringa c conterrà sempre e solo due spazi. */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String stringOne = input.next();
        String stringTwo = input.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a sentence consisting of 3 words divided by 2 spaces: ");
        String stringThree = input2.nextLine();

        String[] words = stringThree.split(" ");
        String word = words[1];
        word = word.replaceAll(stringOne, stringTwo);
        stringThree = words[0] + " " + word + " " + words[2];
        System.out.println(stringThree);
    }
}
