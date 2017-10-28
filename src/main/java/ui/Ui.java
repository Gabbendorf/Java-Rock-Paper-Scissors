package ui;

import language.Language;
import language.LanguageFactory;
import language.Languages;
import move.Moves;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ui {

    final static private String NEWLINE = "";
    private Language language;
    private PrintStream output;
    private Scanner input;

    public Ui(PrintStream output, InputStream input, Language language) {
        this.output = output;
        this.input = new Scanner(input);
        this.language = language;
    }

    public void askForLanguage() {
        output.println("Please choose a language:");
        output.println("English/italiano");
        String languageChosen = input.nextLine().toLowerCase();
        while (!isValidLanguage(languageChosen)) {
            output.println(language.repeatLanguageMessage());
            output.println("English/italiano");
            languageChosen = input.nextLine().toLowerCase();
        }
        output.println(NEWLINE);
        language = new LanguageFactory().newLanguage(languageChosen);
    }

    public void welcomePlayer() {
        output.println(language.welcomeMessage());
        output.println(NEWLINE);
    }

    public String askForName() {
        output.println(language.nameMessage());
        return input.nextLine();
    }

    public String promptForMove() {
        output.println(language.moveMessage());
        String moveChosen = language.translateIntoValidMove(input.nextLine().toLowerCase());
        while (!isValidMove(moveChosen)) {
            output.println(language.repeatMoveMessage());
            moveChosen = language.translateIntoValidMove(input.nextLine().toLowerCase());
        }
        return moveChosen;
    }

    public void confirmMove(String userName, String moveChosen)  {
        output.println(language.movePlayedMessage(userName, moveChosen));
    }

    public void declareComputerMove(String computerMove) {
       output.println(language.computerMoveMessage(computerMove));
       output.println(NEWLINE);
    }

    public void declareWinner(String winnerName) {
       output.println(language.winnerMessage(winnerName));
    }

    public void declareDraw() {
        output.println(language.drawMessage());
    }

    public String playAgain() {
        output.println(language.newGameMessage());
        String answer = language.convertAnswer(input.nextLine().toLowerCase());
        while (!isValidAnswer(answer)) {
            output.println(language.repeatAnswerMessage());
            answer = language.convertAnswer(input.nextLine().toLowerCase());
        }
        return answer;
    }

    public void sayBye() {
        output.println(language.byeMessage());
    }

    private boolean isValidLanguage(String languageChosen) {
        return Languages.availableLanguages().contains(languageChosen);
    }

    private boolean isValidMove(String moveChosen) {
        return Moves.possibleMoves().contains(moveChosen);
    }

    private boolean isValidAnswer(String answer) {
        List<String> validAnswers = Arrays.asList("yes", "no");
        return validAnswers.contains(answer);
    }

}
