package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_NUM = 0; // Минимальное рандомное число
    private static final int MAX_NUM = 10;  // Максимальное рандомное число
    private static final int RANDOM_OPERATION = 3; //  Выбор операция для работы над числами
    private static final boolean GO_TEST_STRING = true; // Надо-ли проводить проверку строки на число

    public static void getGame() {
        for (int i = 0; i < Utils.COUNT; i++) {
            final int number1 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается первое число
            final int number2 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается второе число
            final String znachenie = getOperation(); // Выбирается операция для работы над числами
            String trueAnswer = String.valueOf(getOtvet(number1, number2, znachenie));
            String target = "What is the result of the expression?";
            String task = "Question: " + number1 + " " + znachenie + " " + number2;
            Engine.dataProcessing(trueAnswer, target, task, GO_TEST_STRING);
        }
    }

    static String getOperation() {
        int znach = Utils.getRandomNum(1, RANDOM_OPERATION);
        return switch (znach) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            default -> "";
        };
    }

    static int getOtvet(int number1, int number2, String znachenie) {
        return switch (znachenie) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> 0;
        };
    }
}
