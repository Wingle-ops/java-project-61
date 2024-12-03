package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int MIN_FIRST_INT = 0;  // Выбирается число из диапазона, которое
    private static final int MAX_FIRST_INT = 20; // будет первым в прогрессии.
    private static final int MIN_STEP = 0;   // Выбирается шаг между числами прогрессии.
    private static final int MAX_STEP = 10;  //
    private static final int MAX_LENGTH_PROG = 10; // Выбирается длина прогрессии.
    private static final int MIN_UNKNOWN_NUMBER = 0;  // Выбирается число по индексу, которое
    private static final int MAX_UNKNOWN_NUMBER = 10; // необходимо будет найти.
    private static final boolean goTestString = true; // Надо-ли проводить проверку строки на число.

    public static void getGame() {
        for (int i = 0; i < Utils.count; i++) {
            final int lengthProg = Utils.getRandomNum(5, MAX_LENGTH_PROG);
            // Выбирается длина прогрессии, по условиям задачи минимальная длина 5.
            final int startProg = Utils.getRandomNum(MIN_FIRST_INT, MAX_FIRST_INT);
            // Выбирается первое число прогрессии.
            final int stepProg = Utils.getRandomNum(MIN_STEP, MAX_STEP);
            // Выбирается шаг прогрессии.
            final int unknownNum = Utils.getRandomNum(MIN_UNKNOWN_NUMBER, MAX_UNKNOWN_NUMBER);
            // Выбирается индекс числа, которого нужно будет найти.
            String trueAnswer = String.valueOf(getUnknownNumber(startProg, stepProg, unknownNum, lengthProg));
            String target = "What number is missing in the progression?";
            String task = "Question:" + getProgressia(startProg, stepProg, unknownNum, lengthProg);
            Engine.dataProcessing(trueAnswer, target, task, goTestString);
        }
    }

    static String getProgressia(int startProg, int stepProg, int unknownNum, int lengthProg) {
        StringBuilder progressia = new StringBuilder();
        for (int i = 0; i < lengthProg; i++) {
            if (unknownNum == i){
                progressia.append(" ..");
            }
             else{
                 progressia.append(" ").append(startProg);
            }
            startProg += stepProg;
        }
        return progressia.toString();
    }

    static int getUnknownNumber(int startProg, int stepProg, int unknownNum,int lengthProg) {
        StringBuilder progressia = new StringBuilder();
        for (int i = 0; i < lengthProg; i++) {
            if (unknownNum == i) {
                progressia.append(" ..");
                return startProg;
            } else {
                progressia.append(" ").append(startProg);
            }
            startProg += stepProg;
        }
        return startProg;
    }
}