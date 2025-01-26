package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Even {

    private static final int COUNT_OF_ROUNDS = 3;

    public static String[][] game() {

        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

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
