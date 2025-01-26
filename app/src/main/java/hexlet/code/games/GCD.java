package hexlet.code.games;

import hexlet.code.RandomUtil;

public class GCD {

    private static final int COUNT_OF_ROUNDS = 3;
    private static final String MESSAGE = "Find the greatest common divisor of given numbers.";

    public static String getMessage() {
        return MESSAGE;
    }

    public static String[][] game() {

        String[][] dataBase = new String[COUNT_OF_ROUNDS][2];

        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {

            int firstNumber = RandomUtil.getRandomNumber() + 1;
            int secondNumber = RandomUtil.getRandomNumber() + 1;
            String correctAnswer = String.valueOf(GCD.nod(firstNumber, secondNumber));
            String question = firstNumber + " " + secondNumber;
            dataBase[i][0] = question;
            dataBase[i][1] = correctAnswer;
        }
        return dataBase;
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
