package move;

import game.Results;

public class Rock implements Move {

    private String name;

    public Rock(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        if (opponentMove.getName().equals("scissors")) {
            return Results.WON.value;
        } else if (opponentMove.getName().equals("paper")){
            return Results.LOST.value;
        } else {
            return Results.DRAW.value;
        }
    }

    public String getName() {
        return name;
    }
}
