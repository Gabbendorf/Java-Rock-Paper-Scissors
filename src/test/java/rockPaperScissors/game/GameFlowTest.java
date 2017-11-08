package rockPaperScissors.game;

import org.junit.Before;
import org.junit.Test;
import rockPaperScissors.player.FakeComputer;
import rockPaperScissors.ui.Ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class GameFlowTest {

    private ByteArrayOutputStream output;

    @Before
    public void setUp() throws Exception {
        output = new ByteArrayOutputStream();
    }

    @Test
    public void humanPlayerWins() {
        GameFlow gameFlow = generateGame("English\nGabriella\npaper\nno", "rock");

        gameFlow.run();

        assertTrue(output.toString().contains("Gabriella won!"));
    }

    @Test
    public void computerWins() {
        GameFlow gameFlow = generateGame("English\nGabriella\npaper\nno", "scissors");

        gameFlow.run();

        assertTrue(output.toString().contains("computer won!"));
    }

    @Test
    public void isDraw() {
        GameFlow gameFlow = generateGame("English\nGabriella\npaper\nno", "paper");

        gameFlow.run();

        assertTrue(output.toString().contains("It's a draw!"));
    }

    @Test
    public void startsSecondGameThatIsDraw() {
        GameFlow gameFlow = generateGame("English\nGabriella\npaper\nyes\nEnglish\nGabi\nrock\nno", "rock");

        gameFlow.run();

        assertTrue(output.toString().contains("It's a draw!"));
    }

    @Test
    public void startsGameInItalian() {
        GameFlow gameFlow = generateGame("italiano\nGabi\ncarta\nno", "rock");

        gameFlow.run();

        assertTrue(output.toString().contains("Gabi ha vinto!"));
    }

    private GameFlow generateGame(String playerInput, String computerMove) {
        PrintStream outputStream = new PrintStream(output);
        Ui ui = new Ui(outputStream, new ByteArrayInputStream(playerInput.getBytes()));
        FakeComputer fakeComputer = new FakeComputer(computerMove);

        return new GameFlow(ui, fakeComputer);
    }
}
