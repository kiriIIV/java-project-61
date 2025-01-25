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

            int firstNumber = rand.nextInt(100);
            int secondNumber = rand.nextInt(100);
            int index = rand.nextInt(3);
            String correctAnswer = "";
            String question = firstNumber + " " + operations[index] + " " + secondNumber;

            switch (operations[index]) {
                case "+":
                    correctAnswer += firstNumber + secondNumber;
                    break;
                case "-":
                    correctAnswer += firstNumber - secondNumber;
                    break;
                case "*":
                    correctAnswer += firstNumber * secondNumber;
                    break;
                default:
                    break;
            }

            String result = Engine.correct(question, correctAnswer);
            if (result.equals("Error")) {
                return "";
            }
        }
        System.out.println("Congratulations, " + Engine.nameOfUser + "!");
        return "";
    }
}
