package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calculator {
    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("What is the result of the expression?");

        String[] operations = new String[] {"+", "-", "*"};

        for (int i = 0; i < 3; i++) {

            int first_number = rand.nextInt(100);
            int second_number = rand.nextInt(100);
            int index = rand.nextInt(3);
            String correctAnswer = "";

            switch (operations[index]) {
                case "+":
                    correctAnswer += first_number + second_number;
                    break;
                case "-":
                    correctAnswer += first_number - second_number;
                    break;
                case "*":
                    correctAnswer += first_number * second_number;
                    break;
            }

            String result = Engine.correct(first_number + " " + operations[index] + " " + second_number, correctAnswer);
            if (result.equals("Error")) {
                return "";
            }
        }
        System.out.println("Congratulations, " + Engine.nameOfUser + "!");
        return "";
    }
}
