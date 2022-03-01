import java.util.Scanner;

public class M1_E5_Compare_Strings {

    /* Date tre stringhe a, b e c in input, stampare l’intero corrispondente al numero di stringhe uguali
    tra loro (ignorando maiuscole e minuscole).
    Esempio: se a, b e c sono uguali tra loro stamperà «3», se invece a e b sono uguali
    ma c è diversa stamperà 2 etc. */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String firstString = input.nextLine();

        System.out.println("Enter second string: ");
        String secondString = input.nextLine();

        System.out.println("Enter third string: ");
        String thirdString = input.nextLine();

        compareStrings(firstString, secondString, thirdString);
    }

    public static void compareStrings(String a, String b, String c) {
        if (a.equalsIgnoreCase(b) && b.equalsIgnoreCase(c)) {
            System.out.println(3);
        }
        else if ((a.equalsIgnoreCase(b) && !b.equalsIgnoreCase(c)) || (a.equalsIgnoreCase(c) && !b.equalsIgnoreCase(c)) || (b.equalsIgnoreCase(c) && !c.equalsIgnoreCase(a))) {
            System.out.println(2);
        }
        else {
            System.out.println(1);
        }
    }
}
