package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < 3; i++) {

            String[] progression = new String[10];
            int firstNumber = rand.nextInt(30);
            int step = rand.nextInt(6) + 1;
            int skip = rand.nextInt(10);
            String question = "";

            for (int j = 0; j < 10; j++) {
                if (j == skip) {
                    progression[j] = "..";
                    question += progression[j] + " ";
                    firstNumber += step;
                } else {
                    progression[j] = "" + firstNumber;
                    question += progression[j] + " ";
                    firstNumber += step;
                }
            }

            String correctAnswer = "" + (Integer.parseInt(progression[skip - 1]) + step);

            String result = Engine.correct(question, correctAnswer);
            if (result.equals("Error")) {
                return "";
            }
        }
        System.out.println("Congratulations, " + Engine.nameOfUser + "!");
        return "";
    }
}
