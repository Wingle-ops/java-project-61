package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;

public class Prime {

    static String otvetStr;

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int i = 0;
        int count = 3;
        while (i < count) {
            System.out.println("Question: " + getNumber());
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            Engine.getEnd(otvetStr, answerStr);
            i++;
        }
        System.out.println("Congratulations, " + Cli.nameUser + "!");
    }

    static int getNumber() {
        Random rand = new Random();
        int number = rand.nextInt(30) + 1;
        if (number < 2) {
            otvetStr = "yes";
            return number;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                otvetStr = "no";
                return number;
            }
        }
        otvetStr = "yes";
        return number;

    }
}
