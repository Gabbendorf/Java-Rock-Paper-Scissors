package player;

import move.Move;
import move.MoveFactory;
import move.Moves;

import java.util.List;
import java.util.Random;

public class Computer implements Player {

    private final MoveFactory moveFactory;
    private String name;

    public Computer() {
        this.name = "computer";
        moveFactory = new MoveFactory();
    }

    public Move makeMove() {
        List<String> moves = Moves.possibleMoves;
        String randomMove = moves.get(new Random().nextInt(moves.size()));
        return moveFactory.newMove(randomMove);
    }

}
