package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Prime {

    private static final String MESSAGE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {

        String[][] dataBase = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            int number = RandomUtil.getRandomNumber();
            String correctAnswer = Prime.isPrime(number);
            String question = String.valueOf(number);

            dataBase[i][0] = question;
            dataBase[i][1] = correctAnswer;
        }
        Engine.startGame(dataBase, Prime.MESSAGE);
    }

    public static String isPrime(int a) {

        if (a == 1 || a == 0) {
            return "no";
        }

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
