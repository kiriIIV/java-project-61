package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Even {

    private static final String MESSAGE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {

        String[][] dataBase = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            int number = RandomUtil.getRandomNumber();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            String question = String.valueOf(number);

            dataBase[i][0] = question;
            dataBase[i][1] = correctAnswer;
        }
        Engine.startGame(dataBase, Even.MESSAGE);
    }
}
