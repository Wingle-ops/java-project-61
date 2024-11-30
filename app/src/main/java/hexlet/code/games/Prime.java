package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;
import hexlet.code.Utils;

public class Prime {

    private static final int COUNT = 3;
    private static final int MAX_RANDOM_INT = 30;

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < COUNT; i++) {
            final int number = Utils.getRandomNum(MAX_RANDOM_INT) + 1; // Указываем 1 чтобы
                                                                       // диапазон начинался с 1, а не с 0
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            String otvetStr = isPrime(number);
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.getNameUser() + "!");
    }

    static String isPrime(int number) {
        if (number == 1) {
            return "no";
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
