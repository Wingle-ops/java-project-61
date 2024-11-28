package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;

public class Prime {

    private static final int COUNT = 3;
    private static final int MAX_RANDOM_INT = 30;

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < COUNT; i++) {
            final int number = getNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            String otvetStr = isPrime(number);
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.getNameUser() + "!");
    }

    static int getNumber() {
        return (int) (Math.random() * MAX_RANDOM_INT);
    }

    static String isPrime(int number) {
        if (number < 2) {
            return "no"; // Исправлено: число меньше 2 не является простым
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
