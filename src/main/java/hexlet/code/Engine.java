package hexlet.code;

public class Engine {

    static void setEnd(String otvet, String answer) {
        if (otvet.equals(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + otvet + "'");
            System.out.println("Let's try again, " + Cli.nameUser);
            System.exit(0);
        }
    }
}
