package playerTest;

import move.Moves;
import org.junit.Test;
import player.Computer;

import static org.junit.Assert.assertTrue;

public class ComputerTest {

    @Test
    public void choosesRandomly() {
        Computer computer = new Computer();

        String move = computer.makeMove().getName();

        assertTrue(Moves.possibleMoves.contains(move));
    }

}