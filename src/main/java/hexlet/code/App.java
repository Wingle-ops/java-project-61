package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("""
                1 - Greet
                0 - Exit
                2 - Even
                Your choice:\s""");
        int num = scan.nextInt();

        switch (num) {
            case 0:
                break;
            case 1:
                System.out.println();
                Cli.name();
                break;
            case 2:
                Cli.name();
                Even.getGame();
                break;
            default:
                System.out.println("Ничего не выбрано или выбран неверный вариант.");
        }
    }
}
