import java.util.Scanner;

public class M2_E8_Tombola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrice = new int[3][5];
        int[] numeriEstratti = new int[20];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.println("Inserisci elemento riga: " + i + ", colonna: " + j);
                matrice[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numeriEstratti.length; i++) {
            System.out.println("Inserisci prossimo numero estratto:");
            numeriEstratti[i] = scanner.nextInt();
        }

        //int[][] matrice = {{9, 27, 55, 70, 83}, {11, 39, 57, 73, 85}, {5, 18, 34, 41, 62}};
        //int[] numeriEstratti = {9, 26, 55, 70, 83, 11, 37, 57, 72, 85, 5, 18, 35, 42, 66, 88, 77, 66, 54, 1};

        String result = calcolaTombola(matrice, numeriEstratti);
        System.out.println(result);
    }

    public static String calcolaTombola(int[][] matrice, int[] numeriEstratti) {
        int ambi = 0;
        int terne = 0;
        int quaterne = 0;
        int cinquine = 0;

        for (int i = 0; i < matrice.length; i++) {
            int contatore = 0;
            for (int j = 0; j < matrice[0].length; j++) {
                for (int z = 0; z < numeriEstratti.length; z++) {
                    if (numeriEstratti[z] == matrice[i][j]) {
                        contatore++;
                        break;
                    }
                }
            }
            switch (contatore) {
                case 2:
                    ambi++;
                    break;
                case 3:
                    terne++;
                    break;
                case 4:
                    quaterne++;
                    break;
                case 5:
                    cinquine++;
                    break;
                default:
                    break;
            }
        }
        if (cinquine == 3) {
            return "TOMBOLA!";
        }
        return "ambi: " + ambi + ", terne: " + terne + ", quaterne: " + quaterne + ", cinquine: " + cinquine;
    }
}
