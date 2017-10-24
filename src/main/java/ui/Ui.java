package ui;

import move.Moves;

import java.io.InputStream;
import java.io.PrintStream;
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

    public String promptForMove() {
        output.println("Please type your move:");
        String moveChosen = input.nextLine().toLowerCase();
        while (!isValidMove(moveChosen)) {
            output.println("Invalid move. Please type your move again:");
            moveChosen = input.nextLine().toLowerCase();
        }
        return moveChosen;
    }

    public void confirmMove(String moveChosen) {
        output.println(String.format("You played %s.", moveChosen));
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

    private boolean isValidMove(String moveChosen) {
        return Moves.possibleMoves.contains(moveChosen);
    }
}
