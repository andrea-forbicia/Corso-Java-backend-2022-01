package module_1;

import java.util.Scanner;

public class M1_E1_Math_Operator {

    /* Scrivere un programma Java che permetta all’utente di inserire due numeri interi e, successivamente,
    stampi a video il risultato di addizione, sottrazione, moltiplicazione e divisione tra i due numeri.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = input.nextInt();
        System.out.println("Enter second number: ");
        int y = input.nextInt();
        calculator(x, y);
    }

    public static void calculator(int x, int y) {
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        if (y != 0) {
            System.out.println("Division: " + (x / y));
        }
        else {
            System.out.println("It cannot be divided by 0!");
        }
    }
}
