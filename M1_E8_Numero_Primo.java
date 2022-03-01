import java.util.Scanner;

public class M1_E8_Numero_Primo {
    //Scrivere un metodo che, dato in input un intero a, ritorni true se il numero è primo, false altrimenti.

    public static void numeroPrimo(int n) {
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Il numero è composto");
        }
        else {
            System.out.println("Il numero è primo");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int numero = input.nextInt();
        numeroPrimo(numero);
    }

}
