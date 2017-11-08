package rockPaperScissors.move;

import rockPaperScissors.game.Results;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScissorsTest {

    @Test
    public void winsAgainstPaper() {
        Scissors scissors = new Scissors("scissors");

        String winnerValue = Results.WON.value;

        assertEquals(winnerValue, scissors.playAgainst(new Paper("paper")));
    }

    @Test
    public void losesAgainstRock() {
        Scissors scissors = new Scissors("scissors");

        String loserValue = Results.LOST.value;

        assertEquals(loserValue, scissors.playAgainst(new Rock("rock")));
    }

    @Test
    public void isDrawAgainstScissors() {
        Scissors scissors = new Scissors("scissors");

        String drawValue = Results.DRAW.value;

        assertEquals(drawValue, scissors.playAgainst(new Scissors("scissors")));
    }
}
