package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("What number is missing in the progression?");

        int countOfRounds = 3;
        int lengthOfProgression = 10;
        int maxNumberOfProgression = 30;
        int maxOfStep = 6;
        int maxIndexOfSkip = 10;

        for (int i = 0; i < countOfRounds; i++) {

            String[] progression = new String[lengthOfProgression];
            int firstNumber = rand.nextInt(maxNumberOfProgression);
            int step = rand.nextInt(maxOfStep) + 1;
            int skip = rand.nextInt(maxIndexOfSkip);
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
