package hexlet.code;

import java.util.Scanner;

public class Greeting {

    static String greet() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
