package hexlet.code;

public class Utils {

    public static int getRandomNum(int number) {
        number += 1;
        return (int) (Math.random() * number);
    }

}
