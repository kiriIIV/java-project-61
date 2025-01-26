package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                Cli.greetings();
                break;
            case "2":
                Engine.startGame(Even.game());
                break;
            case "3":
                Engine.startGame(Calculator.game());
                break;
            case "4":
                Engine.startGame(GCD.game());
                break;
            case "5":
                Engine.startGame(Progression.game());
                break;
            case "6":
                Engine.startGame(Prime.game());
                break;
            case "0":
                break;
            default:
                System.out.println("Wrong command!");
                break;
        }
    }
}
