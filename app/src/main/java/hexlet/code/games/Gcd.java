package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;

public class Gcd {

    static int number1;
    static int number2;

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int count = 3;
        while (i < count) {
            randomNum();
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            String otvetStr = String.valueOf(getGcd(number1, number2));
            Engine.testString(otvetStr, answerStr);
            Engine.getEnd(otvetStr, answerStr);
            i++;
        }
        System.out.println("Congratulations, " + Cli.nameUser + "!");
    }

    static void randomNum() {
        Random rand = new Random();
        number1 = rand.nextInt(10) + 1;
        number2 = rand.nextInt(10) + 1;
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
