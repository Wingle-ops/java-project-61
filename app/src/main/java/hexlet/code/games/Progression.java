package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Cli;

public class Progression {

    private static final int COUNT = 3;
    private static final int MAX_INT = 21;
    // Крайнее число, которое указывает границу диапазона (-1).
    // То есть первое число прогрессии не может быть больше этого числа (-1)
    private static final int PLUS_INT = 11;
    // Тут выбирается число (-1), которое будет прибавляться к А. То-есть создавать диапазон.
    // Например, если число А = 5, а число Б = 3, тогда прогрессия будет такая: 5,8,11,14...
    private static final int ISCOMOE_CHISLO = 11;
    // Число по значению, которое надо будет найти (-1).

    public static void getGame() {
        for (int i = 0; i < COUNT; i++) {
            final int aMaxInt = (int) (Math.random() * MAX_INT);
            final int bPlusInt = (int) (Math.random() * PLUS_INT);
            final int propusk = (int) (Math.random() * ISCOMOE_CHISLO);

            System.out.println("What number is missing in the progression?");
            System.out.println("Question:" + getProgressia(aMaxInt, bPlusInt, propusk));
            String otvetStr = String.valueOf(getIskomoeChislo(aMaxInt, bPlusInt, propusk));
            System.out.print("Your answer: ");
            Scanner scan = new Scanner(System.in);
            String answerStr = scan.nextLine();
            Engine.testString(otvetStr, answerStr);
            Engine.getEnd(otvetStr, answerStr);
        }
        System.out.println("Congratulations, " + Cli.nameUser + "!");
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
