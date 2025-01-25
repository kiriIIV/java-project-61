package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calculator {
    public static String game() {

        Random rand = new Random();

        Engine.greet();

        System.out.println("What is the result of the expression?");

        int countOfRounds = 3;
        int maxNumber = 100;

        String[] operations = new String[] {"+", "-", "*"};

        for (int i = 0; i < countOfRounds; i++) {

            int firstNumber = rand.nextInt(maxNumber);
            int secondNumber = rand.nextInt(maxNumber);
            int index = rand.nextInt(operations.length);
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
        System.out.println("Congratulations, " + Engine.getNameOfUser() + "!");
        return "";
    }
}
