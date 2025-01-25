package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {
    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int countOfRounds = 3;
        int maxNumber = 100;

        for (int i = 0; i < countOfRounds; i++) {

            int number = rand.nextInt(maxNumber);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            String question = String.valueOf(number);

            String result = Engine.correct(question, correctAnswer);
            if (result.equals("Error")) {
                return "";
            }
        }
        System.out.println("Congratulations, " + Engine.getNameOfUser() + "!");
        return "";
    }
}
