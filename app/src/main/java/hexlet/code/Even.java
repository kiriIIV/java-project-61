package hexlet.code;

import java.util.Scanner;
import java.util.Random;


public class Even {
    public static String Game() {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {

            int number = rand.nextInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            boolean correctAnswer = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));

            if (correctAnswer) {
                System.out.println("Correct!");
            } else {
                String correct = isEven ? "yes" : "no";
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!%n", answer, correct, name);
                return "";
            }
        }
        System.out.println("Congratulations, " + name + "!");
        return "";
    }
}
