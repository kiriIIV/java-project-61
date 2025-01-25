package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static  final int COUNT_OF_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;

    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {

            int number = rand.nextInt(MAX_NUMBER);
            String correctAnswer = Prime.isPrime(number);
            String question = String.valueOf(number);

            String result = Engine.correct(question, correctAnswer);
            if (result.equals("Error")) {
                return "";
            }
        }
        System.out.println("Congratulations, " + Engine.getNameOfUser() + "!");
        return "";
    }

    public static String isPrime(int a) {

        if (a == 1) {
            return "no";
        }

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
