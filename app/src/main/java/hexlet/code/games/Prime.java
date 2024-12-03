package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MIN_NUM = 0; // Минимальное рандомное число
    private static final int MAX_NUM = 30;  // Максимальное рандомное число
    private static final boolean goTestString = false; // Надо-ли проводить проверку строки на число

    public static void getGame() {
        for (int i = 0; i < Utils.count; i++) {
            final int number = Utils.getRandomNum(MIN_NUM, MAX_NUM);
            String trueAnswer = isPrime(number);
            String target = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            String task = "Question: " + number;
            Engine.dataProcessing(trueAnswer, target, task, goTestString);
        }
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