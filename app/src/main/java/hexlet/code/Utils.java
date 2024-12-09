package hexlet.code;

public class Utils {

    public static int getRandomNum(int minNum, int maxNum) {
        return (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
    }
}
