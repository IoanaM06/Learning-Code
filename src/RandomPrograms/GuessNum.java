package RandomPrograms;

import java.util.Scanner;

public class GuessNum {
    int userInput;

    public GuessNum() {
        var scanner = new Scanner(System.in);

        System.out.print("Please enter a number from 1 to 100: ");
        userInput = scanner.nextInt();
    }

    public String checkNumGuess() {
        int randomNum = (int) (Math.random() * 10 + 1);

        if (randomNum == userInput) return "You win! The right number is " + randomNum + ".";
        else return "You lose. The right number is " + randomNum + ".";
    }
}
