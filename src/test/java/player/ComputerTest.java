package player;

import language.English;
import move.Moves;
import org.junit.Test;
import ui.Ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertTrue;

public class ComputerTest {

    @Test
    public void choosesRandomly() {
        Ui ui = new Ui(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream("".getBytes()), new English());
        Computer computer = new Computer();

        String move = computer.makeMove(ui).getName();

        assertTrue(Moves.possibleMoves().contains(move));
    }

}
