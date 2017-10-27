package ui;

import move.Moves;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ui {

    private PrintStream output;
    private Scanner input;

    public Ui(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new Scanner(input);
    }

    public void welcomePlayer() {
        output.println("*** Welcome to Rock-Paper-Scissors ***");
    }

    public String askForName() {
        output.println("Please type your name:");
        return input.nextLine();
    }

    public String promptForMove() {
        output.println("Please type your move:");
        String moveChosen = input.nextLine().toLowerCase();
        while (!isValidMove(moveChosen)) {
            output.println("Invalid move. Please type your move again:");
            moveChosen = input.nextLine().toLowerCase();
        }
        return moveChosen;
    }

    public void confirmMove(String userName, String moveChosen)  {
        output.println(String.format("%s played %s.", userName, moveChosen));
    }

    public void declareComputerMove(String computerMove) {
       output.println(String.format("Computer played %s.", computerMove));
    }

    public void declareWinner(String winnerName) {
       output.println(String.format("%s won!", winnerName));
    }

    public void declareDraw() {
        output.println("It's a draw!");
    }

    public String playAgain() {
        output.println("Do you want to play again?");
        String answer = input.nextLine().toLowerCase();
        while (!isValidAnswer(answer)) {
            output.println("I didn't understand: yes or no?");
            answer = input.nextLine().toLowerCase();
        }
        return answer;
    }

    public void sayBye() {
        output.println("Bye bye!");
    }

    private boolean isValidAnswer(String answer) {
        List<String> validAnswers = Arrays.asList("yes", "no");
        return validAnswers.contains(answer);
    }

    private boolean isValidMove(String moveChosen) {
        return Moves.possibleMoves.contains(moveChosen);
    }

}
