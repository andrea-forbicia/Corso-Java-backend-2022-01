import java.util.Arrays;
import java.util.Scanner;

public class M3_E1_Labyrinth {
    public static void main(String[] args) {
        String[][] labirinth = {{"--WW-"},
                                {"-W-W-"},
                                {"PW-WW"},
                                {"--W-E"},
                                {"W---W"}};

        for (int i = 0; i < labirinth.length; i++) {
            System.out.println(Arrays.toString(labirinth[i]));
        }

        Scanner input = new Scanner(System.in);
        String movePlayer = input.next();

        if (movePlayer == "s") {
            labirinth[2][0] = "-";
            labirinth[3][0] = "P";
        }
    }
}
