package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int MIN_FIRST_INT = 0;  // Выбирается число из диапазона, которое
    private static final int MAX_FIRST_INT = 20; // будет первым в прогрессии.
    private static final int MIN_STEP = 0;   // Выбирается шаг между числами прогрессии.
    private static final int MAX_STEP = 10;  //
    private static final int MIN_LENGTH_PROG = 5;  // Выбирается длина прогрессии.
    private static final int MAX_LENGTH_PROG = 10;
    private static final int MIN_UNKNOWN_NUMBER = 0;  // Минимальное число по индексу, которое необходимо будет найти.

    public static void getGame() {
        String target = "What number is missing in the progression";
        String[][] dataGame = new String[Engine.COUNT][Engine.DATA];
        for (int i = 0; i < Engine.COUNT; i++) {
            final int lengthProg = Utils.getRandomNum(MIN_LENGTH_PROG, MAX_LENGTH_PROG);
            // Выбирается длина прогрессии
            final int startProg = Utils.getRandomNum(MIN_FIRST_INT, MAX_FIRST_INT);
            // Выбирается первое число прогрессии.
            final int stepProg = Utils.getRandomNum(MIN_STEP, MAX_STEP);
            // Выбирается шаг прогрессии.
            final int unknownNum = Utils.getRandomNum(MIN_UNKNOWN_NUMBER, lengthProg - 1);
            // Выбирается индекс числа, которого нужно будет найти.
            String[] result = getProgressia(startProg, stepProg, unknownNum, lengthProg);
            dataGame[i][0] = result[0]; // Получаем пример для решения
            dataGame[i][1] = result[1]; // Получаем правильный ответ
        }
        Engine.dataProcessing(dataGame, target);
    }

    static String[] getProgressia(int startProg, int stepProg, int unknownNum, int lengthProg) {
        String[] progression = new String[lengthProg];
        for (int num = 0; num < lengthProg; num++) {
            progression[num] = String.valueOf(startProg + num * stepProg);
        }
        String unknownNumber = progression[unknownNum];
        progression[unknownNum] = "..";
        String progressionString = String.join(" ", progression);
        return new String[]{progressionString, unknownNumber};
    }
}
