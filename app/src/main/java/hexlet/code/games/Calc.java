package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;
import hexlet.code.Utils;

public class Calc {

    private static final int COUNT = 3;
    private static final int RANDOM_RANGE = 10;
    private static final int RANDOM_ZNACH = 2; //Значение от 0 до 2

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < COUNT; i++) {
            final int number1 = Utils.getRandomNum(RANDOM_RANGE);
            final int number2 = Utils.getRandomNum(RANDOM_RANGE);
            final String znachenie = getZnachenie();

            System.out.println("Question: " + number1 + " " + znachenie + " " + number2);
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            String otvetStr = String.valueOf(getOtvet(number1, number2, znachenie));
            Engine.testString(otvetStr, answerStr);
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.getNameUser() + "!");
    }

    static String getZnachenie() {
        int znach = Utils.getRandomNum(RANDOM_ZNACH);
        return switch (znach) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            default -> "";
        };
    }

    static int getOtvet(int number1, int number2, String znachenie) {
        if (znachenie.equals("+")) {
            return number1 + number2;
        } else if (znachenie.equals("-")) {
            return number1 - number2;
        } else {
            return number1 * number2;
        }
    }
}
