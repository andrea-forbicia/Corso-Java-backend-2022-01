import java.util.Scanner;

public class M1_E9_Il_Fattoriale {

    // Scrivere un programma che, dato un intero n in input, ne calcoli il fattoriale.

    public static void fattoriale(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            counter *= i;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int numero = input.nextInt();
        fattoriale(numero);
    }

}
