package rockPaperScissors.move;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static rockPaperScissors.move.Move.PAPER;
import static rockPaperScissors.move.Move.ROCK;
import static rockPaperScissors.move.Move.SCISSORS;

public class MoveFactoryTest {

    @Test
    public void createsNewRock() {
        MoveFactory moveFactory = new MoveFactory();

        assertTrue(moveFactory.newMove("rock") == ROCK);
    }

    @Test
    public void createsNewPaper() {
        MoveFactory moveFactory = new MoveFactory();

        assertTrue(moveFactory.newMove("paper") == PAPER);
    }

    @Test
    public void createsNewScissors() {
        MoveFactory moveFactory = new MoveFactory();

        assertTrue(moveFactory.newMove("scissors") == SCISSORS);
    }
}
