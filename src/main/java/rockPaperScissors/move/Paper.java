package rockPaperScissors.move;
import rockPaperScissors.game.Results;

import static rockPaperScissors.move.Moves.*;

public class Paper implements Move {

    private String name;

    public Paper(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        if (opponentMove.getName().equals(ROCK.name)) {
            return Results.WON.value;
        } else if (opponentMove.getName().equals(SCISSORS.name)) {
            return Results.LOST.value;
        } else {
            return Results.DRAW.value;
        }
    }

    public String getName() {
        return name;
    }
}
