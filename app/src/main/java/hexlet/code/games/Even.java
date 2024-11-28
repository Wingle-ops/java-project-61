package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;

public class Even {

    private static final int COUNT = 3;
    private static final int RANDOM_RANGE = 11; // Максимальное рандомное число + 1

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < COUNT; i++) {
            int rand = randomNum();
            String otvetStr = rand % 2 == 0 ? "yes" : "no";
            System.out.print("Question: " + rand + "\n" + "Your answer: ");
            String answerStr = scan.nextLine();
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.nameUser + "!");
    }

    static int randomNum() {
        return (int) (Math.random() * RANDOM_RANGE);
    }
}
