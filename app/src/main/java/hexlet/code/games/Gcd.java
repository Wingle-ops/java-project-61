package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;
import hexlet.code.Utils;

public class Gcd {

    private static final int COUNT = 3;
    private static final int RANDOM_RANGE = 30;

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < COUNT; i++) {
            final int number1 = Utils.getRandomNum(RANDOM_RANGE) + 1; // Указываем 1 чтобы диапазон
            final int number2 = Utils.getRandomNum(RANDOM_RANGE) + 1; // начинался с 1, а не с 0
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            String otvetStr = String.valueOf(getGcd(number1, number2));
            Engine.testString(otvetStr, answerStr);
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.getNameUser() + "!");
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
