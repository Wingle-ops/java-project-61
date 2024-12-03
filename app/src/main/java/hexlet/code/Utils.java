package hexlet.code;

public class Utils {

    public static final int COUNT = 3; // Количество раундов игры

    public static int getRandomNum(int minNum, int maxNum) {
        return (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
    }

    public static void testString(String trueAnswer, String userAnswer) {
        String regex = "-?\\d+";
        if (!userAnswer.matches(regex)) {
            Engine.noCorrect(trueAnswer, userAnswer);
        }
    }
}
