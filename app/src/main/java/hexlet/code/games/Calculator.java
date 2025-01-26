package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Calculator {

    private static final int COUNT_OF_ROUNDS = 3;

    public static String[][] game() {

        Engine.greet();

        System.out.println("What is the result of the expression?");

        String[] operations = new String[] {"+", "-", "*"};
        String[][] dataBase = new String[COUNT_OF_ROUNDS][2];

        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {

            int firstNumber = RandomUtil.getRandomNumber();
            int secondNumber = RandomUtil.getRandomNumber();
            int index = RandomUtil.getRandomNumber(operations.length);
            String question = firstNumber + " " + operations[index] + " " + secondNumber;
            String correctAnswer = Calculator.getAnswer(operations, index, firstNumber, secondNumber);
            dataBase[i][0] = question;
            dataBase[i][1] = correctAnswer;
        }
        return dataBase;
    }

    public static String getAnswer(String[] operations, int index, int firstNumber, int secondNumber) {
        String correctAnswer = "";
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
        return correctAnswer;
    }
}
