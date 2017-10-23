package move;

public class Paper implements Move {

    private String name;

    public Paper(String name) {
        this.name = name;
    }

    public String playAgainst(Move opponentMove) {
        StringBuilder verdict = new StringBuilder();
        if (opponentMove.getName() == "rock") {
            verdict.append("won");
        } else if (opponentMove.getName() == "scissors") {
            verdict.append("lost");
        } else {
            verdict.append("draw");
        }
        return verdict.toString();
    }

    public String getName() {
        return name;
    }
}
