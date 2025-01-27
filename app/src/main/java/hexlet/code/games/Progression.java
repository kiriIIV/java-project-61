package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Progression {

    private  static final int LENGTH_OF_PROGRESSION = 10;
    private static final String MESSAGE = "What number is missing in the progression?";

    public static void game() {

        String[][] dataBase = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            String[] progression = new String[LENGTH_OF_PROGRESSION];
            int firstNumber = RandomUtil.getRandomNumber();
            int step = RandomUtil.getRandomStep() + 1;
            int skip = RandomUtil.getRandomSkip();
            String question = "";
            String correctAnswer = "";

            for (int j = 0; j < progression.length; j++) {
                if (j == skip) {
                    progression[j] = "..";
                    question += progression[j] + " ";
                    correctAnswer += firstNumber;
                    firstNumber += step;
                } else {
                    progression[j] = "" + firstNumber;
                    question += progression[j] + " ";
                    firstNumber += step;
                }
            }
            dataBase[i][0] = question;
            dataBase[i][1] = correctAnswer;
        }
        Engine.startGame(dataBase, Progression.MESSAGE);
    }
}
