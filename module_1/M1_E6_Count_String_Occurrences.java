package module_1;

import java.util.Scanner;

public class M1_E6_Count_String_Occurrences {
    //Scrivere un metodo che, dato un char a e una stringa b, stampa il numero di occorrenze di a in b.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        String inputString = input.nextLine();

        System.out.println("Enter character: ");
        char inputCharacter = input.next(".").charAt(0);

        countOccurrences(inputString, inputCharacter);
    }

    public static void countOccurrences(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Occurrences: " + count);
    }
}
