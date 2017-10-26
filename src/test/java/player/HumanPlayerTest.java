package player;

import move.Paper;
import org.junit.Test;
import ui.DoubleUi;

import static org.junit.Assert.assertTrue;

public class HumanPlayerTest {

   @Test
   public void returnsMove() {
       HumanPlayer humanPlayer = new HumanPlayer("Gabriella", new DoubleUi(null, null));

       assertTrue(humanPlayer.makeMove() instanceof Paper);
   }
}
