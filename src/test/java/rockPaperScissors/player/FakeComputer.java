package rockPaperScissors.player;

import rockPaperScissors.move.Move;
import rockPaperScissors.move.MoveFactory;
import rockPaperScissors.ui.Ui;

public class FakeComputer extends Computer {

    private String move;
    private MoveFactory moveFactory;

    public FakeComputer(String move) {
       this.move = move;
       moveFactory = new MoveFactory();
    }

    @Override
    public Move makeMove(Ui ui) {
        return moveFactory.newMove(move);
    }
}
