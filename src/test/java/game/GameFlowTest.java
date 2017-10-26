package game;

import org.junit.Test;
import player.FakeComputer;
import player.HumanPlayer;
import ui.Ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class GameFlowTest {

    @Test
    public void humanPlayerWins() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream outputStream = new PrintStream(output);
        Ui ui = new Ui(outputStream, new ByteArrayInputStream("paper".getBytes()));
        HumanPlayer humanPlayer = new HumanPlayer("Gabriella", ui);
        FakeComputer fakeComputer = new FakeComputer("rock");
        GameFlow gameFlow = new GameFlow(ui, humanPlayer, fakeComputer);

        gameFlow.run();

        assertTrue(output.toString().contains("Gabriella won!"));
    }

    @Test
    public void computerWins() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream outputStream = new PrintStream(output);
        Ui ui = new Ui(outputStream, new ByteArrayInputStream("paper".getBytes()));
        HumanPlayer humanPlayer = new HumanPlayer("Gabriella", ui);
        FakeComputer fakeComputer = new FakeComputer("scissors");
        GameFlow gameFlow = new GameFlow(ui, humanPlayer, fakeComputer);

        gameFlow.run();

        assertTrue(output.toString().contains("computer won!"));
    }

    @Test
    public void isDraw() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream outputStream = new PrintStream(output);
        Ui ui = new Ui(outputStream, new ByteArrayInputStream("paper".getBytes()));
        HumanPlayer humanPlayer = new HumanPlayer("Gabriella", ui);
        FakeComputer fakeComputer = new FakeComputer("paper");
        GameFlow gameFlow = new GameFlow(ui, humanPlayer, fakeComputer);

        gameFlow.run();

        assertTrue(output.toString().contains("It's a draw!"));
    }
}
