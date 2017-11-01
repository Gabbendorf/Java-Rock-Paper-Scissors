package rockPaperScissors.move;

import rockPaperScissors.game.Results;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockTest {

    @Test
    public void winsAgainstScissors() {
        Rock rock = new Rock("rock");

        String winnerValue = Results.WON.value;

        assertEquals(winnerValue, rock.playAgainst(new Scissors("scissors")));
    }

    @Test
    public void losesAgainstPaper() {
        Rock rock = new Rock("rock");

        String loserValue = Results.LOST.value;

        assertEquals(loserValue, rock.playAgainst(new Paper("paper")));
    }

    @Test
    public void isDrawAgainstRock() {
        Rock rock = new Rock("rock");

        String drawValue = Results.DRAW.value;

        assertEquals(drawValue, rock.playAgainst(new Rock("rock")));
    }
}
