package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    private static final int MIN_NUM = 1; // Минимальное рандомное число
    private static final int MAX_NUM = 100;  // Максимальное рандомное число

    public static void getGame() {
        String target = "Find the greatest common divisor of given numbers.";
        String[][] dataGame = new String[Engine.COUNT][Engine.DATA];
        for (int i = 0; i < dataGame.length; i++) {
            final int number1 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается первое число
            final int number2 = Utils.getRandomNum(MIN_NUM, MAX_NUM); // Выбирается второе число
            dataGame[i][0] = number1 + " " + number2; // Получаем пример для решения
            dataGame[i][1] = String.valueOf(getGcd(number1, number2)); // Получаем правильный ответ
        }
        Engine.dataProcessing(dataGame, target);
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
