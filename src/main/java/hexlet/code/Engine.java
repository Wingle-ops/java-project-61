package hexlet.code;

public class Engine {

    static String itsOtvet;
    static String itsAnswer;

    static void getEnd(String otvet, String answer) {
        itsOtvet = otvet;
        itsAnswer = answer;

        testString(answer);
        if (otvet.equals(answer)) {
            System.out.println("Correct!");
        } else {
            noCorrect(otvet, answer);
        }
    }
     static void testString(String string){
         for(int i = 0; i < string.length(); i++) {
             if(!Character.isDigit(string.charAt(i))) {
                noCorrect(itsOtvet, itsAnswer);
             }
         }
     }

     static void noCorrect(String otvet, String answer) {
         System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + otvet + "'");
         System.out.println("Let's try again, " + Cli.nameUser);
         System.exit(0);
     }
}
