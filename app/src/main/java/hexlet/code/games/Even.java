package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {

    private static  final int COUNT_OF_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;

    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {

            int number = rand.nextInt(MAX_NUMBER);
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
