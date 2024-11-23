package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    static int number1;
    static int number2;
    static char znachenie;
    static int otvet;

    static void getGame() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int count = 3;
        System.out.println("What is the result of the expression?");

        while (i < count) {
            getCount();
            System.out.println("Question: " + number1 + " " + znachenie + " " + number2);
            System.out.print("Your answer: ");
            String answerStr = scan.nextLine();
            String otvetStr = String.valueOf(otvet);
            Engine.getEnd(otvetStr, answerStr);
            i++;
        }
        System.out.println("Congratulations, " + Cli.nameUser);
    }

    static void getCount() {
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        int znach = rand.nextInt(3);
        number1 = num1;
        number2 = num2;

        switch (znach) {
            case 0:
                znachenie = '+';
                otvet = number1 + number2;
                return;
            case 1:
                znachenie = '-';
                otvet = number1 - number2;
                return;
            case 2:
                znachenie = '*';
                otvet = number1 * number2;
                return;
            default:
        }
    }
}
