package module_2;

import java.util.Arrays;
import java.util.Scanner;

public class M2_E7_Somma_Diagonale {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire dimensione matrice quadrata: ");
        int n = input.nextInt();

        int[][] matriceQuadrata = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Inserisci elemento riga: " + i + ", colonna: " + j);
                matriceQuadrata[i][j] = input.nextInt();
            }
        }
        //int[][] matriceQuadrata = {{1, 7, 0, -1}, {-1, 3, 8, 5}, {2, 0, -2, 4}, {6, 1, 5, 9}};
        //int[][] matriceQuadrata = {{1, 7, 0, -1, 2}, {-1, 3, 8, 5, 2}, {2, 0, -2, 4, 2}, {6, 1, 5, 9, 2}, {2, 2, 2, 2, 2}};

        int solution = diagonalSum(matriceQuadrata);
        System.out.println(solution);
    }

    public static int diagonalSum(int[][] m) {
        int sum = 0;
        if (m.length % 2 == 0) {
            for (int i = 0; i < m.length; i++) {
                sum = sum + m[i][i];
            }
        }
        else {
            int j = 0;
            for (int i = m.length - 1; i >= 0; i--) {
                sum = sum + m[j][i];
                j++;
            }
        }
        return sum;
    }

}
