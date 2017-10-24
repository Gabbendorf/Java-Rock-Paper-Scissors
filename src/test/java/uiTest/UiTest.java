package uiTest;

import org.junit.Before;
import org.junit.Test;
import ui.Ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UiTest {

    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
    }

    @Test
    public void welcomePlayer() {
        Ui ui = newUiWith("input");

        ui.welcomePlayer();

        assertTrue(output.toString().contains("*** Welcome to Rock-Paper-Scissors ***"));
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

        ui.confirmMove("paper");

        assertTrue(output.toString().contains("You played paper."));
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

    private Ui newUiWith(String inputString) {
        ByteArrayInputStream input = new ByteArrayInputStream(inputString.getBytes());

        return new Ui(new PrintStream(output), input);
    }
}
