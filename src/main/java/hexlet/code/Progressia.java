package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progressia {

    static int otvet;

    public static void getGame() {
        int i = 0;
        int count = 3;
        while (i < count) {
            System.out.println("What number is missing in the progression?");
            System.out.println("Question:" + getProgressia());
            String otvetStr = String.valueOf(otvet);
            System.out.print("Your answer: ");
            Scanner scan = new Scanner(System.in);
            String answerStr = scan.nextLine();
            Engine.getEnd(otvetStr, answerStr);
            i++;
        }
        System.out.println("Congratulations, " + Cli.nameUser);
    }

    static String getProgressia() {
        Random rand = new Random();
        StringBuilder progressia = new StringBuilder();
        int a = rand.nextInt(20) + 1;
        int b = rand.nextInt(10) + 1;
        int propusk = rand.nextInt(11);
        for (int i = 0; i <= 10; i++) {
            if (propusk == i) {
                progressia.append(" ..");
                otvet = a;
            } else {
                progressia.append(" ").append(a);
            }
            a += b;
        }
        return progressia.toString();
    }

}
