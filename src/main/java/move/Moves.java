package move;

import java.util.Arrays;
import java.util.List;

public enum Moves {

    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");

    public String name;

    Moves(String name) {
        this.name = name;
    }

    static public List possibleMoves() {
        return Arrays.asList(ROCK.name, PAPER.name, SCISSORS.name);
    }
}
