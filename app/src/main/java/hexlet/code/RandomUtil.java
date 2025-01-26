package hexlet.code;

import java.util.Random;

public class RandomUtil {
    private static final Random RAND = new Random();
    private static final int MAX_NUMBER = 100;
    private  static final int LENGTH_OF_PROGRESSION = 10;
    private  static final int MAX_OF_STEP = 6;
    private static final int MAX_INDEX_OF_SKIP = 10;

    public static int getRandomNumber() {
        return RAND.nextInt(MAX_NUMBER);
    }

    public static int getRandomNumber(int maxNumber) {
        return RAND.nextInt(maxNumber);
    }

    public static int getRandomLength() {
        return RAND.nextInt(LENGTH_OF_PROGRESSION);
    }

    public static int getRandomStep() {
        return RAND.nextInt(MAX_OF_STEP);
    }

    public static int getRandomSkip() {
        return RAND.nextInt(MAX_INDEX_OF_SKIP);
    }
}
