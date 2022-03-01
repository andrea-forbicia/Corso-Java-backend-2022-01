package module_1;

import java.util.Scanner;

public class M1_E2_Even_Odd {

    //Dato un numero, stampare true se il numero è pari, false altrimenti.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        evenOdd(x);
    }

    public static void evenOdd(int x) {
        if (x % 2 == 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
