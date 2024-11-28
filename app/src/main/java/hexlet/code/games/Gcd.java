package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;

public class Gcd {

    private static final int COUNT = 30;
    private static final int RANDOM_RANGE = 5; // Максимальное рандомное число + 1

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < COUNT; i++) {
            final int number1 = randomNum();
            final int number2 = randomNum();
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            String otvetStr = String.valueOf(getGcd(number1, number2));
            Engine.testString(otvetStr, answerStr);
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.nameUser + "!");
    }

    static int randomNum() {
        return (int) (Math.random() * RANDOM_RANGE) + 1;
    }

    static int getGcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
}
