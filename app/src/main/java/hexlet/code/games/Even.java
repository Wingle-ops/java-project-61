package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MIN_NUM = 0; // Минимальное рандомное число
    private static final int MAX_NUM = 30;  // Максимальное рандомное число
    private static final boolean GO_TEST_STRING = false; // Надо-ли проводить проверку строки на число

    public static void getGame() {
        for (int i = 0; i < Engine.COUNT; i++) {
            int rand = Utils.getRandomNum(MIN_NUM, MAX_NUM);
            String trueAnswer = Utils.isBoolean(rand) ? "yes" : "no";
            String target = "Answer 'yes' if the number is even, otherwise answer 'no'.";
            String task = "Question: " + rand;
            Engine.dataProcessing(trueAnswer, target, task, GO_TEST_STRING);
        }
    }
}
