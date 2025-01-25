package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int countOfRounds = 3;
        int maxNumber = 100;

        for (int i = 0; i < countOfRounds; i++) {

            int number = rand.nextInt(maxNumber);
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

        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
