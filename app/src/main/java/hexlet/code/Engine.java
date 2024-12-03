package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int COUNT = 3; // Количество раундов игры
    private static int hello = 0;
    private static int count = 0;

    public static void dataProcessing(String trueAnswer, String target, String task, boolean goTestString) {
        Scanner scan = new Scanner(System.in);
        if (hello == 0) { // Приветствуем пользователя и описываем цель игры при запуске
            Cli.greeting();
            System.out.println(target);
            hello += 1;
        }
        System.out.println(task); // Выводится пример для решения
        System.out.print("Your answer: ");
        String userAnswer = scan.nextLine(); // Пользователь пишет свой ответ
        if (goTestString) { // если требуется проверка строки на число, тогда данные отправляютя в метод
            Utils.testString(trueAnswer, userAnswer);
        }
        getEnd(trueAnswer, userAnswer); // получаем ответ программы на ответ пользователя
        count++;
        if (count == Engine.COUNT) { // Если пользователь дал 3 верных овета, то его поздравляют с завершением игры
            System.out.println("Congratulations, " + Cli.getNameUser() + "!");
        }
    }

    public static void getEnd(String trueAnswer, String userAnswer) {

        if (trueAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
        } else {
            noCorrect(trueAnswer, userAnswer);
        }
    }

    static void noCorrect(String otvet, String answer) {
        System.out.println("\n'" + answer + "' is wrong answer ;(. Correct answer was '" + otvet + "'");
        System.out.println("Let's try again, " + Cli.getNameUser() + "!");
        System.exit(0);
    }
}
