package hexlet.code;

public class Engine {

    private static String itsOtvet;
    private static String itsAnswer;

    public static void getEnd(String otvet, String answer) {
        itsOtvet = otvet;
        itsAnswer = answer;

        if (otvet.equals(answer)) {
            System.out.println("Correct!");
        } else {
            noCorrect(otvet, answer);
        }
    }
    public static void testString(String otvet, String answer) {
        itsOtvet = otvet;
        itsAnswer = answer;
        String regex = "-?\\d+";
        if (!answer.matches(regex)) {
            noCorrect(itsOtvet, itsAnswer);
        }
    }

    static void noCorrect(String otvet, String answer) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + otvet + "'");
        System.out.println("Let's try again, " + Cli.getNameUser() + "!");
        System.exit(0);
    }
}
