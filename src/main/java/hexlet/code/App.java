package hexlet.code;

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
                5 - Progressia
                0 - Exit
                Your choice:\s""");
        int num = scan.nextInt();
        System.out.println();

        switch (num) {
            case 0:
                break;
            case 1:
                Cli.name();
                break;
            case 2:
                Cli.name();
                Even.getGame();
                break;
            case 3:
                Cli.name();
                Calc.getGame();
                break;
            case 4:
                Cli.name();
                Gcd.getGame();
                break;
            case 5:
                Cli.name();
                Progressia.getGame();
                break;
            default:
                System.out.println("Ничего не выбрано или выбран неверный вариант.");
        }
    }
}
