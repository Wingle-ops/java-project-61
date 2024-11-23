package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    static void getGame() {
        int i = 0;
        int count = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (i < count) {
            int rand = randomNum();
            String otvet = rand % 2 == 0 ? "yes" : "no";
            System.out.print("Question: " + rand + "\n" + "Yor answer: ");
            String answer = scan.nextLine();
            Engine.setEnd(otvet, answer);
            i++;
        }
        System.out.println("Congratulations, " + Cli.nameUser);
    }

    static int randomNum() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

}
