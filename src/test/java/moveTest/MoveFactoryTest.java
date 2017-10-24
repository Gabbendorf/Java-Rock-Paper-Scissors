package moveTest;

import move.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveFactoryTest {

    @Test
    public void createsNewRock() {
        MoveFactory moveFactory = new MoveFactory();

        assertTrue(moveFactory.newMove("rock") instanceof Rock);
    }

    @Test
    public void createsNewPaper() {
        MoveFactory moveFactory = new MoveFactory();

        assertTrue(moveFactory.newMove("paper") instanceof Paper);
    }

    @Test
    public void createsNewScissors() {
        MoveFactory moveFactory = new MoveFactory();

        assertTrue(moveFactory.newMove("scissors") instanceof Scissors);
    }
}
