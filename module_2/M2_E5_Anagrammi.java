package module_2;

import java.util.Scanner;

public class M2_E5_Anagrammi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire la prima stringa: ");
        String stringOne = input.nextLine();

        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Inserire la seconda stringa: ");
        String stringTwo = inputTwo.nextLine();

        String result = checkAnagrammi(stringOne, stringTwo);
        System.out.println(result);
    }

    public static String checkAnagrammi(String stringOne, String stringTwo) {
        if (stringOne.length() != stringTwo.length()) {
            return "Non sono anagrammi";
        } else {
            for (int i = 0; i < stringOne.length(); i++) {
                for (int j = 0; j < stringTwo.length(); j++) {
                    if (stringOne.charAt(i) == stringTwo.charAt(j)) {
                        break;
                    }
                    if (stringTwo.length() - 1 == j) {
                        return "Non sono anagrammi";
                    }
                }
            }
            return "Sono anagrammi";
        }
    }
}
