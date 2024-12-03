package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String nameUser;

    static void greeting() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        setNameUser(scan.nextLine());
        System.out.println("Hello, " + getNameUser() + "!");
    }

    public static String  getNameUser() {
        return nameUser;
    }

    public static void setNameUser(String name) {
        nameUser = name;
    }
}
