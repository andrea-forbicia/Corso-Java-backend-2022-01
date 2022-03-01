import java.util.Scanner;

public class M1_E3_String_Reverse {

    /* Data una stringa, stampare la stessa stringa invertendone il contenuto a partire dal primo spazio,
    ad esempio data la stringa «come stai» stampare a video «stai come».
    Potete dare per assunto che la stringa conterrà sempre un solo spazio.
    Suggerimento: utilizzate i metodi della classe String */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        stringReverse(inputString);
    }

    public static void stringReverse(String outputString) {
        int spaceIndex = outputString.indexOf(" ");
        System.out.println(outputString.substring(spaceIndex + 1, outputString.length()) + " " + outputString.substring(0, spaceIndex));
    }
}
