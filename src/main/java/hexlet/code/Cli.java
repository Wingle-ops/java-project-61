package hexlet.code;

import java.util.Scanner;

class Cli {

    static String nameUser;

    static void name() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        nameUser = name;
        System.out.println("Hello, " + name + "!");
    }
}
