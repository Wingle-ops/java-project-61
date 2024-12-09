package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MIN_NUM = 0; // Минимальное рандомное число
    private static final int MAX_NUM = 30;  // Максимальное рандомное число

    public static void getGame() {
        String target = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] dataGame = new String[Engine.COUNT][Engine.DATA];
        for (int i = 0; i < dataGame.length; i++) {
            int rand = Utils.getRandomNum(MIN_NUM, MAX_NUM);
            dataGame[i][0] = String.valueOf(rand); // Получаем пример для решения
            dataGame[i][1] = isBoolean(rand) ? "yes" : "no"; // Получаем правильный ответ
        }
        Engine.dataProcessing(dataGame, target);
    }

    public static boolean isBoolean(int number) {
        return number % 2 == 0;
    }
}
