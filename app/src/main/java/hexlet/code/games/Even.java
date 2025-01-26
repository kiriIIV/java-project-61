package hexlet.code.games;

import hexlet.code.RandomUtil;

public class Even {

    private static final int COUNT_OF_ROUNDS = 3;
    private static final String MESSAGE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String getMessage() {
        return MESSAGE;
    }

    public static String[][] game() {

        String[][] dataBase = new String[COUNT_OF_ROUNDS][2];

        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {

            int number = RandomUtil.getRandomNumber();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            String question = String.valueOf(number);

            dataBase[i][0] = question;
            dataBase[i][1] = correctAnswer;
        }
        return dataBase;
    }
}
