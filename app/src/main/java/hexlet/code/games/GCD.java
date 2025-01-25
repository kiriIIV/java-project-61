package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    private static final int countOfRounds = 3;
    private static final int maxNumber = 100;

    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < countOfRounds; i++) {

            int firstNumber = rand.nextInt(maxNumber);
            int secondNumber = rand.nextInt(maxNumber);
            String correctAnswer = String.valueOf(GCD.nod(firstNumber, secondNumber));
            String question = firstNumber + " " + secondNumber;

            String result = Engine.correct(question, correctAnswer);
            if (result.equals("Error")) {
                return "";
            }
        }
        System.out.println("Congratulations, " + Engine.getNameOfUser() + "!");
        return "";
    }

    public static int nod(int a, int b) {
        int temp = -1;
        while (temp != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
