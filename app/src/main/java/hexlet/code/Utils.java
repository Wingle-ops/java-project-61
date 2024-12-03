package hexlet.code;

public class Utils {

    public static final int count = 3; // Количество раундов игры

    public static int getRandomNum(int MinNum, int MaxNum) {
        return (int) (Math.random() * (MaxNum - MinNum + 1)) + MinNum;
    }

    public static void testString(String trueAnswer, String userAnswer) {
        String regex = "-?\\d+";
        if (!userAnswer.matches(regex)) {
            Engine.noCorrect(trueAnswer, userAnswer);
        }
    }
}
