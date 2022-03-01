import java.util.Scanner;

public class M2_E1_Contatote_Tempo {

    //Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa che dice
    //«Giorni: numero di giorni, Ore: numero di ore etc...»

    public static int giorni(int numSec) {
        int numDay = numSec / 86400;
        return numDay;
    }

    public static int ore(int numSec) {
        int numOre = numSec / 3600;
        return numOre;
    }

    public static int minuti(int numSec) {
        int numMin = numSec / 60;
        return numMin;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero dei secondi: ");
        int numSec = input.nextInt();
        int numDay = giorni(numSec);
        System.out.println("Numero giorni: " + numDay);
        int numOre = ore(numSec);
        System.out.println("Numero ore: " + numOre);
        int numMin = minuti(numSec);
        System.out.println("Numero minuti: " + numMin);
    }

}
