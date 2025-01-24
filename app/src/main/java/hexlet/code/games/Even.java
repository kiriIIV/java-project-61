package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {
    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {

            int number = rand.nextInt(100);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            String result = Engine.correct("" + number, correctAnswer);
            if (result.equals("Error")) {
                return "";
            }
        }
        System.out.println("Congratulations, " + Engine.nameOfUser + "!");
        return "";
    }
}
