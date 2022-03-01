import java.util.Scanner;

public class M1_E10_Somma_Armonica {

    // Scrivere un programma che, dato un intero n in input, calcoli la somma di una serie armonica fino a n

    public static void sommaArmonica(int n) {
        double counter = 1;
        for (double i = 2; i <= n; i++) {
            counter = counter + 1 / i;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int numero = input.nextInt();
        sommaArmonica(numero);
    }

}
