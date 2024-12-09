package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_NUM = 0; // Минимальное рандомное число
    private static final int MAX_NUM = 10;  // Максимальное рандомное число
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static void getGame() {
        String target = "What is the result of the expression?";
        String[][] dataGame = new String[Engine.COUNT][Engine.DATA];
        for (int i = 0; i < dataGame.length; i++) {
            final int operation = Utils.getRandomNum(0, OPERATIONS.length - 1); // Выбирается действие над числами
            final int number1 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается первое число
            final int number2 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается второе число
            dataGame[i][0] = number1 + " " + OPERATIONS[operation] + " " + number2;
            // Получаем пример для решения
            dataGame[i][1] = String.valueOf(getOtvet(number1, number2, OPERATIONS[operation]));
            // Получаем правильный ответ
        }
        Engine.dataProcessing(dataGame, target);
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
