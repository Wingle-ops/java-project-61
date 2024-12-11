package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int COUNT = 3; // Количество раундов игры
    public static final int DATA = 2; // Количество типов данных, которые будем получать

    public static void dataProcessing(String[][] dataGame, String target) {
        Scanner scan = new Scanner(System.in);
        Cli.greeting();
        System.out.println(target);
        for (String[] test : dataGame) {
            System.out.println("Question: " + test[0]); // Выводится пример для решения
            System.out.print("Your answer: ");
            String userAnswer = scan.nextLine(); // Пользователь пишет свой ответ
            if (test[1].equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("\n'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + test[1] + "'");
                System.out.println("Let's try again, " + Cli.getNameUser() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getNameUser() + "!");
    }
}
