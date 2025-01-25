package hexlet.code;

import java.util.Scanner;

public class Engine {

    static Scanner scanner = new Scanner(System.in);
    public static String nameOfUser;

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        nameOfUser = scanner.nextLine();
        System.out.println("Hello, " + nameOfUser + "!");
    }

    public static String correct(String question, String correct) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
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
}
