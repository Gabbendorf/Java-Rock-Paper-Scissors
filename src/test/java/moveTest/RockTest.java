package moveTest;

import move.Paper;
import move.Rock;
import move.Scissors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockTest {

    @Test
    public void winsAgainstScissors() {
        Rock rock = new Rock("rock");

        assertEquals("won", rock.playAgainst(new Scissors("scissors")));
    }

    @Test
    public void losesAgainstPaper() {
        Rock rock = new Rock("rock");

        assertEquals("lost", rock.playAgainst(new Paper("paper")));
    }

    @Test
    public void isDrawAgainstRock() {
        Rock rock = new Rock("rock");

        assertEquals("draw", rock.playAgainst(new Rock("rock")));
    }
}
