package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;
import hexlet.code.Utils;

public class Progression {

    private static final int COUNT = 3;
    private static final int MAX_INT = 20;
    // Крайнее число, которое указывает границу диапазона.
    // То есть первое число прогрессии не может быть больше этого числа
    private static final int PLUS_INT = 10;
    // Тут выбирается число, которое будет прибавляться к А. То-есть создавать диапазон.
    // Например, если число А = 5, а число Б = 3, тогда прогрессия будет такая: 5,8,11,14...
    private static final int ISCOMOE_CHISLO = 10;
    // Число по значению, которое надо будет найти.

    public static void getGame() {
        for (int i = 0; i < COUNT; i++) {
            final int aMaxInt = Utils.getRandomNum(MAX_INT + 1);
            final int bPlusInt = Utils.getRandomNum(PLUS_INT) + 1; // Указываем 1 чтобы диапазон начинался с 1, а не с 0
            final int propusk = Utils.getRandomNum(ISCOMOE_CHISLO + 1);
            System.out.println("What number is missing in the progression?");
            System.out.println("Question:" + getProgressia(aMaxInt, bPlusInt, propusk));
            String otvetStr = String.valueOf(getIskomoeChislo(aMaxInt, bPlusInt, propusk));
            System.out.print("Your answer: ");
            Scanner scan = new Scanner(System.in);
            String answerStr = scan.nextLine();
            Engine.testString(otvetStr, answerStr);
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.getNameUser() + "!");
    }

    static String getProgressia(int a, int b, int propusk) {
        StringBuilder progressia = new StringBuilder();
        for (int i = 0; i < ISCOMOE_CHISLO; i++) {
            if (propusk == i) {
                progressia.append(" ..");
            } else {
                progressia.append(" ").append(a);
            }
            a += b;
        }
        return progressia.toString();
    }

    static int getIskomoeChislo(int a, int b, int propusk) {
        StringBuilder progressia = new StringBuilder();
        for (int i = 0; i < ISCOMOE_CHISLO; i++) {
            if (propusk == i) {
                progressia.append(" ..");
                return a;
            } else {
                progressia.append(" ").append(a);
            }
            a += b;
        }
        return a;
    }
}
