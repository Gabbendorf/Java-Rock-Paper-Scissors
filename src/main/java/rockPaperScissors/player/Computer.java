package rockPaperScissors.player;

import rockPaperScissors.move.Move;
import rockPaperScissors.move.MoveFactory;
import rockPaperScissors.move.Moves;
import rockPaperScissors.ui.Ui;

public class Computer implements Player {

    private final MoveFactory moveFactory;
    private String name;

    public Computer() {
        this.name = "computer";
        moveFactory = new MoveFactory();
    }

    public Move makeMove(Ui ui) {
        ui.declareComputerMove(Moves.randomMove());
        return moveFactory.newMove(Moves.randomMove());
    }

    public String name() {
        return name;
    }
}
