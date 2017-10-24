package player;

import move.Move;
import move.MoveFactory;
import move.Moves;

import java.util.List;

public class FakeComputer implements Player{

    private MoveFactory moveFactory;

    public FakeComputer() {
        moveFactory = new MoveFactory();
    }

    public Move makeMove() {
        List<String> moves = Moves.possibleMoves;
        String randomMove = moves.get(0);
        return moveFactory.newMove(randomMove);
    }
}
