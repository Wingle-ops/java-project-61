package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MIN_NUM = 0; // Минимальное рандомное число
    private static final int MAX_NUM = 30;  // Максимальное рандомное число

    public static void getGame() {
        String target = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] dataGame = new String[Engine.COUNT][Engine.DATA];
        for (int i = 0; i < dataGame.length; i++) {
            final int number = Utils.getRandomNum(MIN_NUM, MAX_NUM);
            dataGame[i][0] = String.valueOf(number); // Получаем пример для решения
            dataGame[i][1] = isPrime(number) ? "yes" : "no"; // Получаем правильный ответ
        }
        Engine.dataProcessing(dataGame, target);
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
