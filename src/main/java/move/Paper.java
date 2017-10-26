package move;

import game.Results;

public class Paper implements Move {

    private String name;

    public Paper(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        if (opponentMove.getName().equals("rock")) {
            return Results.WON.value;
        } else if (opponentMove.getName().equals("scissors")) {
            return Results.LOST.value;
        } else {
            return Results.DRAW.value;
        }
    }

    public String getName() {
        return name;
    }
}