package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;

public class Calc {

    private static final int COUNT = 3;
    private static final int RANDOM_RANGE = 11;
    private static final int RANDOM_ZNACH = 3;

    public static void getGame() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < COUNT; i++) {
            final int number1 = getCount();
            final int number2 = getCount();
            final String znachenie = getZnachenie();

            System.out.println("Question: " + number1 + " " + znachenie + " " + number2);
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            String otvetStr = String.valueOf(getOtvet(number1, number2, znachenie));
            Engine.testString(otvetStr, answerStr);
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.nameUser + "!");
    }

    static int getCount() {
        return (int) (Math.random() * RANDOM_RANGE);
    }

    static String getZnachenie() {
        int znach = (int) (Math.random() * RANDOM_ZNACH);
        return switch (znach) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
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
