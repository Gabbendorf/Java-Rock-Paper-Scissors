package rockPaperScissors.move;

import rockPaperScissors.game.Results;

public class Scissors implements Move {

    private String name;

    public Scissors(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        if (opponentMove.getName().equals(Moves.PAPER.name)) {
            return Results.WON.value;
        } else if (opponentMove.getName().equals(Moves.ROCK.name)){
            return Results.LOST.value;
        } else {
            return Results.DRAW.value;
        }
    }

    public String getName() {
        return name;
    }
}
