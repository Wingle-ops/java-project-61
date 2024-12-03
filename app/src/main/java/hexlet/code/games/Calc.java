package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_NUM = 0; // Минимальное рандомное число
    private static final int MAX_NUM = 10;  // Максимальное рандомное число
    private static final boolean GO_TEST_STRING = true; // Надо-ли проводить проверку строки на число
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static void getGame() {
        for (int i = 0; i < Engine.COUNT; i++) {
            final int operationNum = Utils.getRandomNum(0, OPERATIONS.length - 1);
            final int number1 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается первое число
            final int number2 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается второе число
            final char operation = OPERATIONS[operationNum];
            String trueAnswer = String.valueOf(getOtvet(number1, number2, operation));
            String target = "What is the result of the expression?";
            String task = "Question: " + number1 + " " + operation + " " + number2;
            Engine.dataProcessing(trueAnswer, target, task, GO_TEST_STRING);
        }
    }

    static int getOtvet(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> 0;
        };
    }
}
