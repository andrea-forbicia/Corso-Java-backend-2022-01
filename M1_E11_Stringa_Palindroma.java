import java.util.Scanner;

public class M1_E11_Stringa_Palindroma {

    // Scrivere un programma che, data in input una stringa s, restituisca true se s è palindroma, false altrimenti

    public static String palindroma(String s) {
        String stringReverse = new String();
        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            stringReverse = stringReverse + s.charAt(s.length()-j);
            j++;
        }
        return stringReverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire una strnga: ");
        String stringa = input.nextLine();
        String stringReverse = palindroma(stringa);
        if (stringa.equals(stringReverse)) {
            System.out.println("Le stringa è palindrome");
        }
        else {
            System.out.println("Le stringa non è palindrome");
        }
    }

}

