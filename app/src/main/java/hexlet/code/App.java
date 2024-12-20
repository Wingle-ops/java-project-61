package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        String num = scan.nextLine();
        System.out.println();
        gameStart(num);
    }

    static void gameStart(String num) {
        switch (num) {
            case "0" -> System.exit(0);
            case "1" -> Greeting.greet();
            case "2" -> Even.getGame();
            case "3" -> Calc.getGame();
            case "4" -> Gcd.getGame();
            case "5" -> Progression.getGame();
            case "6" -> Prime.getGame();
            default -> System.out.println("Ничего не выбрано или выбран неверный вариант.");
        }
    }
}
