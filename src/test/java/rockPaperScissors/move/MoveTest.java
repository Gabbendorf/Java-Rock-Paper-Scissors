package rockPaperScissors.move;

import org.junit.Test;
import rockPaperScissors.game.Result;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MoveTest {

    @Test
    public void rockBeatsScissors() {
        assertThat(Move.ROCK.playAgainst(Move.SCISSORS), is(equalTo(Result.WON)));
    }

    @Test
    public void rockLosesAgainstPaper() {
        assertThat(Move.ROCK.playAgainst(Move.PAPER), is(equalTo(Result.LOST)));
    }

    @Test
    public void paperBeatsRock() {
        assertThat(Move.PAPER.playAgainst(Move.ROCK), is(equalTo(Result.WON)));
    }

    @Test
    public void scissorsLosesAgainstRock() {
        assertThat(Move.SCISSORS.playAgainst(Move.ROCK), is(equalTo(Result.LOST)));
    }
}