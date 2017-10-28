package player;

import move.Move;
import move.MoveFactory;
import ui.Ui;

public class HumanPlayer implements Player {

    private final MoveFactory moveFactory;
    private String name;

    public HumanPlayer(String name) {
        this.name = name;
        moveFactory = new MoveFactory();
    }

    public Move makeMove(Ui ui) {
        String move = ui.promptForMove();
        ui.confirmMove(name, move);
        return moveFactory.newMove(move);
    }

    public String name() {
        return name;
    }
}
