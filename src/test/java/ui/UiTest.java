package ui;

import language.English;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UiTest {

    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
    }

    @Test
    public void askToChooseLanguage() {
        Ui ui = newUiWith("english");

        ui.askForLanguage();

        assertTrue(output.toString().contains("Please choose a language:"));
        assertTrue(output.toString().contains("English/italiano"));
    }

    @Test
    public void welcomePlayer() {
        Ui ui = newUiWith("input");

        ui.welcomePlayer();

        assertTrue(output.toString().contains("*** Welcome to Rock-Paper-Scissors ***"));
    }

    @Test
    public void askForName() {
        Ui ui = newUiWith("Gabriella");

        String userName = ui.askForName();

        assertTrue(output.toString().contains("Please type your name:"));
        assertEquals("Gabriella", userName);
    }

    @Test
    public void promptForMoveAndReturnsIt() {
        Ui ui = newUiWith("Paper");

        String moveChosen = ui.promptForMove();

        assertTrue(output.toString().contains("Please type your move:"));
        assertEquals("paper", moveChosen);
    }

    @Test
    public void askForCorrectMove() {
        Ui ui = newUiWith("papers\nPaper");

        ui.promptForMove();

        assertTrue(output.toString().contains("Invalid move. Please type your move again:"));
    }

    @Test
    public void printsMessageWithMoveChosen() {
        Ui ui = newUiWith("input");

        ui.confirmMove("Gabriella", "paper");

        assertTrue(output.toString().contains("Gabriella played paper."));
    }

    @Test
    public void computerMove() {
        Ui ui = newUiWith("input");

        ui.declareComputerMove("rock");

        assertTrue(output.toString().contains("Computer played rock."));
    }

    @Test
    public void declareWinner() {
        Ui ui = newUiWith("input");

        ui.declareWinner("Player One");

        assertTrue(output.toString().contains("Player One won!"));
    }

    @Test
    public void declareDraw() {
        Ui ui = newUiWith("input");

        ui.declareDraw();

        assertTrue(output.toString().contains("It's a draw!"));
    }

    @Test
    public void askToPlayAgain() {
        Ui ui = newUiWith("yes");

        String answer = ui.playAgain();

        assertTrue(output.toString().contains("Do you want to play again?"));
        assertEquals("yes", answer);
    }

    @Test
    public void askToRepeatForNewGame() {
        Ui ui = newUiWith("maybe\nno");

        String answer = ui.playAgain();

        assertTrue(output.toString().contains("I didn't understand: yes or no?"));
        assertEquals("no", answer);
    }

    @Test
    public void sayGoodbye() {
        Ui ui = newUiWith("input");

        ui.sayBye();

        assertTrue(output.toString().contains("Bye bye!"));
    }

    private Ui newUiWith(String inputString) {
        ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());

        return new Ui(new PrintStream(output), input, new English());
    }
}
