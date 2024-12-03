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
    private static final boolean GO_TEST_STRING = true; // Надо-ли проводить проверку строки на число.

    public static void getGame() {
        for (int i = 0; i < Utils.COUNT; i++) {
            final int lengthProg = Utils.getRandomNum(MIN_LENGTH_PROG, MAX_LENGTH_PROG);
            // Выбирается длина прогрессии
            final int startProg = Utils.getRandomNum(MIN_FIRST_INT, MAX_FIRST_INT);
            // Выбирается первое число прогрессии.
            final int stepProg = Utils.getRandomNum(MIN_STEP, MAX_STEP);
            // Выбирается шаг прогрессии.
            final int unknownNum = Utils.getRandomNum(MIN_UNKNOWN_NUMBER, lengthProg - 1);
            // Выбирается индекс числа, которого нужно будет найти.
            String trueAnswer = String.valueOf(getUnknownNumber(startProg, stepProg, unknownNum, lengthProg));
            String target = "What number is missing in the progression?";
            String task = "Question:" + getProgressia(startProg, stepProg, unknownNum, lengthProg);
            Engine.dataProcessing(trueAnswer, target, task, GO_TEST_STRING);
        }
    }

    static String getProgressia(int startProg, int stepProg, int unknownNum, int lengthProg) {
        StringBuilder progressia = new StringBuilder();
        for (int i = 0; i < lengthProg; i++) {
            if (i == unknownNum) {
                progressia.append(" ..");
            } else {
                progressia.append(" ").append(startProg);
            }
            startProg += stepProg;
        }
        return progressia.toString();
    }

    static int getUnknownNumber(int startProg, int stepProg, int unknownNum, int lengthProg) {
        for (int i = 0; i < lengthProg; i++) {
            if (i == unknownNum) {
                return startProg;
            }
            startProg += stepProg;
        }
        return startProg;
    }
}
