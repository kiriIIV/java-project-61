package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static  final int COUNT_OF_ROUNDS = 3;
    private  static  final int LENGTH_OF_PROGRESSION = 10;
    private  static  final int MAX_NUMBER_OF_PROGRESSION = 30;
    private  static  final int MAX_OF_STEP = 6;
    private static final int MAX_INDEX_OF_SKIP = 10;

    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {

            String[] progression = new String[LENGTH_OF_PROGRESSION];
            int firstNumber = rand.nextInt(MAX_NUMBER_OF_PROGRESSION);
            int step = rand.nextInt(MAX_OF_STEP) + 1;
            int skip = rand.nextInt(MAX_INDEX_OF_SKIP);
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

            String result = Engine.correct(question, correctAnswer);
            if (result.equals("Error")) {
                return "";
            }
        }
        System.out.println("Congratulations, " + Engine.getNameOfUser() + "!");
        return "";
    }
}
