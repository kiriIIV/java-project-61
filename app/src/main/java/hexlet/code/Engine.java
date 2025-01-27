package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static String nameOfUser;
    public static final int COUNT_OF_ROUNDS = 3;

    public static String checkQuestionAndAnswer(String question, String correct) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (correct.equals(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                    + "Let's try again, %s!%n", answer, correct, nameOfUser);
            return "Error";
        }
        return "";
    }

    public static void startGame(String[][] dataBase, String message) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        nameOfUser = scanner.nextLine();
        System.out.println("Hello, " + nameOfUser + "!");

        System.out.println(message);

        for (String[] pair : dataBase) {
            String question = pair[0];
            String correctAnswer = pair[1];
            String result = Engine.checkQuestionAndAnswer(question, correctAnswer);
            if (result.equals("Error")) {
                return;
            }
        }
        System.out.println("Congratulations, " + nameOfUser + "!");
    }
}
