package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;

public class Even {

    public static void getGame() {
        int i = 0;
        int count = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (i < count) {
            int rand = randomNum();
            String otvetStr = rand % 2 == 0 ? "yes" : "no";
            System.out.print("Question: " + rand + "\n" + "Yor answer: ");
            String answerStr = scan.nextLine();
            Engine.getEnd(otvetStr, answerStr);
            i++;
        }
        System.out.println("Congratulations, " + Cli.nameUser + "!");
    }

    static int randomNum() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }

}
