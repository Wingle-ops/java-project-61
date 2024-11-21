package hexlet.code;

import java.util.Scanner;

    class Cli {

    static void Name() {
        System.out.print("Welcome to the Brain Games!\n May I have your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
