package moveTest;

import move.Paper;
import move.Rock;
import move.Scissors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaperTest {

    @Test
    public void winsAgainstRock() {
        Paper paper = new Paper("paper");

        assertEquals("won", paper.playAgainst(new Rock("rock")));
    }

    @Test
    public void losesAgainstScissors() {
        Paper paper = new Paper("paper");

        assertEquals("lost", paper.playAgainst(new Scissors("scissors")));
    }

    @Test
    public void isDrawAgainstPaper() {
        Paper paper = new Paper("paper");

        assertEquals("draw", paper.playAgainst(new Paper("paper")));
    }
}
