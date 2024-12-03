package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    private static final int MIN_NUM = 0; // Минимальное рандомное число
    private static final int MAX_NUM = 30;  // Максимальное рандомное число
    private static final boolean goTestString = true; // Надо-ли проводить проверку строки на число

    public static void getGame() {
        for (int i = 0; i < Utils.count; i++) {
            final int number1 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается первое число
            final int number2 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается второе число
            String trueAnswer = String.valueOf(getGcd(number1, number2));
            String target = "Find the greatest common divisor of given numbers.";
            String task = "Question: " + number1 + " " + number2;
            Engine.dataProcessing(trueAnswer, target, task, goTestString);
        }
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
