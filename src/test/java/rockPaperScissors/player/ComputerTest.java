package rockPaperScissors.player;

import org.junit.Test;
import rockPaperScissors.move.Moves;
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

        String move = computer.makeMove(ui).getName();

        assertTrue(Moves.possibleMoves().contains(move));
    }

}
