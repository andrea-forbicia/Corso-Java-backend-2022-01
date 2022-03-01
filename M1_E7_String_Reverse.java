import java.util.Scanner;

public class M1_E7_String_Reverse {

    /* Scrivere un metodo che, data una stringa s in input, ne stampi il reverse, ossia la stringa al contrario.
    Esempio: data la stringa «ciao», dovrà stampare «oaic».
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputString = input.nextLine();

        stringReverse(inputString);
    }

    public static void stringReverse(String s) {
        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(s.length()-j));
            j++;
        }
    }
}
