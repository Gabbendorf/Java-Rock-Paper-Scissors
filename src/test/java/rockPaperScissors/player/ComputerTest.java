package rockPaperScissors.player;

import org.junit.Test;
import rockPaperScissors.move.Move;
import rockPaperScissors.ui.Ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertTrue;

public class ComputerTest {

    @Test
    public void choosesRandomly() {
        Ui ui = new Ui(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream("".getBytes()));
        Computer computer = new Computer();

        String moves = computer.makeMove(ui).name;

        assertTrue(Move.possibleMoves().contains(moves));
    }

}
