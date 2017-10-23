package moveTest;

import move.Paper;
import move.Rock;
import move.Scissors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScissorsTest {

    @Test
    public void winsAgainstPaper() {
        Scissors scissors = new Scissors("scissors");

        assertEquals("won", scissors.playAgainst(new Paper("paper")));
    }

    @Test
    public void losesAgainstRock() {
        Scissors scissors = new Scissors("scissors");

        assertEquals("lost", scissors.playAgainst(new Rock("rock")));
    }

    @Test
    public void isDrawAgainstScissors() {
        Scissors scissors = new Scissors("scissors");

        assertEquals("draw", scissors.playAgainst(new Scissors("scissors")));
    }
}
