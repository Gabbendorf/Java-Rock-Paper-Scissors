package player;

import move.Move;
import move.MoveFactory;
import move.Moves;
import ui.Ui;

import java.util.List;
import java.util.Random;

public class Computer implements Player {

    private final MoveFactory moveFactory;
    private String name;

    public Computer() {
        this.name = "computer";
        moveFactory = new MoveFactory();
    }

    public Move makeMove(Ui ui) {
        List<String> possibleMovesMoves = Moves.possibleMoves();
        String randomMove = possibleMovesMoves.get(new Random().nextInt(possibleMovesMoves.size()));
        ui.declareComputerMove(randomMove);
        return moveFactory.newMove(randomMove);
    }

    public String name() {
        return name;
    }
}
