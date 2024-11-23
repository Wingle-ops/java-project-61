package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    static void getGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i = 0;
        int j = 0;
        int count = 3;
        while (i < count) {
            Scanner scan = new Scanner(System.in);
            int rand = randomNum();

            String znach = rand % 2 == 0 ? "yes" : "no";
            System.out.print("Question: " + rand + "\n" + "Yor answer: ");
            String answer = scan.nextLine();
            if (znach.equals(answer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + znach + "'");
                break;
            }
            System.out.println("Congratulations, " + Cli.nameUser);
        }
    }

    static int randomNum() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

}
